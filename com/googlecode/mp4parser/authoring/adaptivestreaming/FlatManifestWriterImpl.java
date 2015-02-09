package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.coremedia.iso.Hex;
import com.coremedia.iso.boxes.SoundMediaHeaderBox;
import com.coremedia.iso.boxes.VideoMediaHeaderBox;
import com.coremedia.iso.boxes.h264.AvcConfigurationBox;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import com.googlecode.mp4parser.Version;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Sample;
import com.googlecode.mp4parser.authoring.Track;
import com.googlecode.mp4parser.authoring.builder.FragmentIntersectionFinder;
import com.googlecode.mp4parser.boxes.DTSSpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox.Entry;
import com.googlecode.mp4parser.boxes.mp4.ESDescriptorBox;
import com.googlecode.mp4parser.boxes.mp4.objectdescriptors.AudioSpecificConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class FlatManifestWriterImpl extends AbstractManifestWriter {
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final Logger LOG;

    private class DependentSubstreamMask {
        private byte dWChannelMaskFirstByte;
        private byte dWChannelMaskSecondByte;
        private Entry entry;

        public DependentSubstreamMask(byte dWChannelMaskFirstByte, byte dWChannelMaskSecondByte, Entry entry) {
            this.dWChannelMaskFirstByte = dWChannelMaskFirstByte;
            this.dWChannelMaskSecondByte = dWChannelMaskSecondByte;
            this.entry = entry;
        }

        public byte getdWChannelMaskFirstByte() {
            return this.dWChannelMaskFirstByte;
        }

        public byte getdWChannelMaskSecondByte() {
            return this.dWChannelMaskSecondByte;
        }

        public DependentSubstreamMask process() {
            switch (this.entry.chan_loc) {
                case PBE.MD5 /*0*/:
                    this.dWChannelMaskFirstByte = (byte) (this.dWChannelMaskFirstByte | 3);
                    break;
                case ay.f /*1*/:
                    this.dWChannelMaskFirstByte = (byte) (this.dWChannelMaskFirstByte | 12);
                    break;
                case ay.n /*2*/:
                    this.dWChannelMaskSecondByte = (byte) (this.dWChannelMaskSecondByte | 128);
                    break;
                case ay.p /*3*/:
                    this.dWChannelMaskSecondByte = (byte) (this.dWChannelMaskSecondByte | 8);
                    break;
                case aV.i /*6*/:
                    this.dWChannelMaskSecondByte = (byte) (this.dWChannelMaskSecondByte | 5);
                    break;
                case a8.s /*7*/:
                    this.dWChannelMaskSecondByte = (byte) (this.dWChannelMaskSecondByte | 2);
                    break;
            }
            return this;
        }
    }

    static {
        $assertionsDisabled = !FlatManifestWriterImpl.class.desiredAssertionStatus();
        LOG = Logger.getLogger(FlatManifestWriterImpl.class.getName());
    }

    protected FlatManifestWriterImpl(FragmentIntersectionFinder intersectionFinder) {
        super(intersectionFinder);
    }

    protected Document customizeManifest(Document manifest) {
        return manifest;
    }

    public String getManifest(Movie movie) throws IOException {
        LinkedList<VideoQuality> videoQualities = new LinkedList();
        long videoTimescale = -1;
        LinkedList<AudioQuality> audioQualities = new LinkedList();
        long audioTimescale = -1;
        for (Track track : movie.getTracks()) {
            if (track.getMediaHeaderBox() instanceof VideoMediaHeaderBox) {
                this.videoFragmentsDurations = checkFragmentsAlign(this.videoFragmentsDurations, calculateFragmentDurations(track, movie));
                videoQualities.add(getVideoQuality(track, (VisualSampleEntry) track.getSampleDescriptionBox().getSampleEntry()));
                if (videoTimescale == -1) {
                    videoTimescale = track.getTrackMetaData().getTimescale();
                } else if (!($assertionsDisabled || videoTimescale == track.getTrackMetaData().getTimescale())) {
                    throw new AssertionError();
                }
            }
            if (track.getMediaHeaderBox() instanceof SoundMediaHeaderBox) {
                this.audioFragmentsDurations = checkFragmentsAlign(this.audioFragmentsDurations, calculateFragmentDurations(track, movie));
                audioQualities.add(getAudioQuality(track, (AudioSampleEntry) track.getSampleDescriptionBox().getSampleEntry()));
                if (audioTimescale == -1) {
                    audioTimescale = track.getTrackMetaData().getTimescale();
                } else if (!($assertionsDisabled || audioTimescale == track.getTrackMetaData().getTimescale())) {
                    throw new AssertionError();
                }
            }
        }
        try {
            int i;
            Element qualityLevel;
            String str;
            int length;
            Element c;
            Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
            Element smoothStreamingMedia = document.createElement("SmoothStreamingMedia");
            document.appendChild(smoothStreamingMedia);
            smoothStreamingMedia.setAttribute("MajorVersion", "2");
            smoothStreamingMedia.setAttribute("MinorVersion", "1");
            smoothStreamingMedia.setAttribute("Duration", "0");
            smoothStreamingMedia.appendChild(document.createComment(Version.VERSION));
            Element videoStreamIndex = document.createElement("StreamIndex");
            videoStreamIndex.setAttribute("Type", "video");
            videoStreamIndex.setAttribute("TimeScale", Long.toString(videoTimescale));
            videoStreamIndex.setAttribute("Chunks", Integer.toString(this.videoFragmentsDurations.length));
            videoStreamIndex.setAttribute("Url", "video/{bitrate}/{start time}");
            videoStreamIndex.setAttribute("QualityLevels", Integer.toString(videoQualities.size()));
            smoothStreamingMedia.appendChild(videoStreamIndex);
            for (i = 0; i < videoQualities.size(); i++) {
                VideoQuality vq = (VideoQuality) videoQualities.get(i);
                qualityLevel = document.createElement("QualityLevel");
                qualityLevel.setAttribute("Index", Integer.toString(i));
                qualityLevel.setAttribute("Bitrate", Long.toString(vq.bitrate));
                str = "FourCC";
                qualityLevel.setAttribute(r29, vq.fourCC);
                qualityLevel.setAttribute("MaxWidth", Long.toString((long) vq.width));
                qualityLevel.setAttribute("MaxHeight", Long.toString((long) vq.height));
                str = "CodecPrivateData";
                qualityLevel.setAttribute(r29, vq.codecPrivateData);
                qualityLevel.setAttribute("NALUnitLengthField", Integer.toString(vq.nalLength));
                videoStreamIndex.appendChild(qualityLevel);
            }
            i = 0;
            while (true) {
                length = this.videoFragmentsDurations.length;
                if (i >= r0) {
                    break;
                }
                c = document.createElement("c");
                c.setAttribute("n", Integer.toString(i));
                c.setAttribute("d", Long.toString(this.videoFragmentsDurations[i]));
                videoStreamIndex.appendChild(c);
                i++;
            }
            if (this.audioFragmentsDurations != null) {
                Element audioStreamIndex = document.createElement("StreamIndex");
                audioStreamIndex.setAttribute("Type", "audio");
                audioStreamIndex.setAttribute("TimeScale", Long.toString(audioTimescale));
                audioStreamIndex.setAttribute("Chunks", Integer.toString(this.audioFragmentsDurations.length));
                audioStreamIndex.setAttribute("Url", "audio/{bitrate}/{start time}");
                audioStreamIndex.setAttribute("QualityLevels", Integer.toString(audioQualities.size()));
                smoothStreamingMedia.appendChild(audioStreamIndex);
                for (i = 0; i < audioQualities.size(); i++) {
                    AudioQuality aq = (AudioQuality) audioQualities.get(i);
                    qualityLevel = document.createElement("QualityLevel");
                    qualityLevel.setAttribute("Index", Integer.toString(i));
                    str = "FourCC";
                    qualityLevel.setAttribute(r29, aq.fourCC);
                    qualityLevel.setAttribute("Bitrate", Long.toString(aq.bitrate));
                    qualityLevel.setAttribute("AudioTag", Integer.toString(aq.audioTag));
                    qualityLevel.setAttribute("SamplingRate", Long.toString(aq.samplingRate));
                    qualityLevel.setAttribute("Channels", Integer.toString(aq.channels));
                    qualityLevel.setAttribute("BitsPerSample", Integer.toString(aq.bitPerSample));
                    qualityLevel.setAttribute("PacketSize", Integer.toString(aq.packetSize));
                    str = "CodecPrivateData";
                    qualityLevel.setAttribute(r29, aq.codecPrivateData);
                    audioStreamIndex.appendChild(qualityLevel);
                }
                i = 0;
                while (true) {
                    length = this.audioFragmentsDurations.length;
                    if (i >= r0) {
                        break;
                    }
                    c = document.createElement("c");
                    c.setAttribute("n", Integer.toString(i));
                    c.setAttribute("d", Long.toString(this.audioFragmentsDurations[i]));
                    audioStreamIndex.appendChild(c);
                    i++;
                }
            }
            document.setXmlStandalone(true);
            Source dOMSource = new DOMSource(customizeManifest(document));
            Writer stringWriter = new StringWriter();
            Result streamResult = new StreamResult(stringWriter);
            try {
                Transformer transformer = TransformerFactory.newInstance().newTransformer();
                transformer.setOutputProperty("indent", "yes");
                transformer.transform(dOMSource, streamResult);
                return stringWriter.getBuffer().toString();
            } catch (TransformerConfigurationException e) {
                throw new IOException(e);
            } catch (TransformerException e2) {
                throw new IOException(e2);
            }
        } catch (ParserConfigurationException e3) {
            throw new IOException(e3);
        }
    }

    private AudioQuality getAudioQuality(Track track, AudioSampleEntry ase) {
        if (getFormat(ase).equals(AudioSampleEntry.TYPE3)) {
            return getAacAudioQuality(track, ase);
        }
        if (getFormat(ase).equals(AudioSampleEntry.TYPE9)) {
            return getEc3AudioQuality(track, ase);
        }
        if (getFormat(ase).startsWith("dts")) {
            return getDtsAudioQuality(track, ase);
        }
        throw new InternalError("I don't know what to do with audio of type " + getFormat(ase));
    }

    private AudioQuality getAacAudioQuality(Track track, AudioSampleEntry ase) {
        AudioQuality l = new AudioQuality();
        AudioSpecificConfig audioSpecificConfig = ((ESDescriptorBox) ase.getBoxes(ESDescriptorBox.class).get(0)).getEsDescriptor().getDecoderConfigDescriptor().getAudioSpecificInfo();
        if (audioSpecificConfig.getSbrPresentFlag() == 1) {
            l.fourCC = "AACH";
        } else if (audioSpecificConfig.getPsPresentFlag() == 1) {
            l.fourCC = "AACP";
        } else {
            l.fourCC = "AACL";
        }
        l.bitrate = getBitrate(track);
        l.audioTag = 255;
        l.samplingRate = ase.getSampleRate();
        l.channels = ase.getChannelCount();
        l.bitPerSample = ase.getSampleSize();
        l.packetSize = 4;
        l.codecPrivateData = getAudioCodecPrivateData(audioSpecificConfig);
        return l;
    }

    private AudioQuality getEc3AudioQuality(Track track, AudioSampleEntry ase) {
        EC3SpecificBox ec3SpecificBox = (EC3SpecificBox) ase.getBoxes(EC3SpecificBox.class).get(0);
        if (ec3SpecificBox == null) {
            throw new RuntimeException("EC-3 track misses EC3SpecificBox!");
        }
        short nfchans = (short) 0;
        short lfechans = (short) 0;
        byte dWChannelMaskFirstByte = (byte) 0;
        byte dWChannelMaskSecondByte = (byte) 0;
        for (Entry entry : ec3SpecificBox.getEntries()) {
            DependentSubstreamMask dependentSubstreamMask;
            switch (entry.acmod) {
                case PBE.MD5 /*0*/:
                    nfchans = (short) (nfchans + 2);
                    throw new RuntimeException("Smooth Streaming doesn't support DDP 1+1 mode");
                case ay.f /*1*/:
                    nfchans = (short) (nfchans + 1);
                    if (entry.num_dep_sub <= 0) {
                        dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 32);
                        break;
                    }
                    dependentSubstreamMask = new DependentSubstreamMask(dWChannelMaskFirstByte, dWChannelMaskSecondByte, entry).process();
                    dWChannelMaskFirstByte = (byte) (dependentSubstreamMask.getdWChannelMaskFirstByte() | dWChannelMaskFirstByte);
                    dWChannelMaskSecondByte = (byte) (dependentSubstreamMask.getdWChannelMaskSecondByte() | dWChannelMaskSecondByte);
                    break;
                case ay.n /*2*/:
                    nfchans = (short) (nfchans + 2);
                    if (entry.num_dep_sub <= 0) {
                        dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 192);
                        break;
                    }
                    dependentSubstreamMask = new DependentSubstreamMask(dWChannelMaskFirstByte, dWChannelMaskSecondByte, entry).process();
                    dWChannelMaskFirstByte = (byte) (dependentSubstreamMask.getdWChannelMaskFirstByte() | dWChannelMaskFirstByte);
                    dWChannelMaskSecondByte = (byte) (dependentSubstreamMask.getdWChannelMaskSecondByte() | dWChannelMaskSecondByte);
                    break;
                case ay.p /*3*/:
                    nfchans = (short) (nfchans + 3);
                    if (entry.num_dep_sub <= 0) {
                        dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 224);
                        break;
                    }
                    dependentSubstreamMask = new DependentSubstreamMask(dWChannelMaskFirstByte, dWChannelMaskSecondByte, entry).process();
                    dWChannelMaskFirstByte = (byte) (dependentSubstreamMask.getdWChannelMaskFirstByte() | dWChannelMaskFirstByte);
                    dWChannelMaskSecondByte = (byte) (dependentSubstreamMask.getdWChannelMaskSecondByte() | dWChannelMaskSecondByte);
                    break;
                case aj.i /*4*/:
                    nfchans = (short) (nfchans + 3);
                    if (entry.num_dep_sub <= 0) {
                        dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 192);
                        dWChannelMaskSecondByte = (byte) (dWChannelMaskSecondByte | 128);
                        break;
                    }
                    dependentSubstreamMask = new DependentSubstreamMask(dWChannelMaskFirstByte, dWChannelMaskSecondByte, entry).process();
                    dWChannelMaskFirstByte = (byte) (dependentSubstreamMask.getdWChannelMaskFirstByte() | dWChannelMaskFirstByte);
                    dWChannelMaskSecondByte = (byte) (dependentSubstreamMask.getdWChannelMaskSecondByte() | dWChannelMaskSecondByte);
                    break;
                case aV.r /*5*/:
                    nfchans = (short) (nfchans + 4);
                    if (entry.num_dep_sub <= 0) {
                        dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 224);
                        dWChannelMaskSecondByte = (byte) (dWChannelMaskSecondByte | 128);
                        break;
                    }
                    dependentSubstreamMask = new DependentSubstreamMask(dWChannelMaskFirstByte, dWChannelMaskSecondByte, entry).process();
                    dWChannelMaskFirstByte = (byte) (dependentSubstreamMask.getdWChannelMaskFirstByte() | dWChannelMaskFirstByte);
                    dWChannelMaskSecondByte = (byte) (dependentSubstreamMask.getdWChannelMaskSecondByte() | dWChannelMaskSecondByte);
                    break;
                case aV.i /*6*/:
                    nfchans = (short) (nfchans + 4);
                    if (entry.num_dep_sub <= 0) {
                        dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 204);
                        break;
                    }
                    dependentSubstreamMask = new DependentSubstreamMask(dWChannelMaskFirstByte, dWChannelMaskSecondByte, entry).process();
                    dWChannelMaskFirstByte = (byte) (dependentSubstreamMask.getdWChannelMaskFirstByte() | dWChannelMaskFirstByte);
                    dWChannelMaskSecondByte = (byte) (dependentSubstreamMask.getdWChannelMaskSecondByte() | dWChannelMaskSecondByte);
                    break;
                case a8.s /*7*/:
                    nfchans = (short) (nfchans + 5);
                    if (entry.num_dep_sub <= 0) {
                        dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 236);
                        break;
                    }
                    dependentSubstreamMask = new DependentSubstreamMask(dWChannelMaskFirstByte, dWChannelMaskSecondByte, entry).process();
                    dWChannelMaskFirstByte = (byte) (dependentSubstreamMask.getdWChannelMaskFirstByte() | dWChannelMaskFirstByte);
                    dWChannelMaskSecondByte = (byte) (dependentSubstreamMask.getdWChannelMaskSecondByte() | dWChannelMaskSecondByte);
                    break;
            }
            if (entry.lfeon == 1) {
                lfechans = (short) (lfechans + 1);
                dWChannelMaskFirstByte = (byte) (dWChannelMaskFirstByte | 16);
            }
        }
        ByteBuffer waveformatex = ByteBuffer.allocate(22);
        byte[] bArr = new byte[2];
        bArr[1] = (byte) 6;
        waveformatex.put(bArr);
        waveformatex.put(dWChannelMaskFirstByte);
        waveformatex.put(dWChannelMaskSecondByte);
        waveformatex.put(new byte[2]);
        waveformatex.put(new byte[]{(byte) -81, (byte) -121, (byte) -5, (byte) -89, (byte) 2, (byte) 45, (byte) -5, (byte) 66, (byte) -92, (byte) -44, (byte) 5, (byte) -51, (byte) -109, (byte) -124, (byte) 59, (byte) -35});
        ByteBuffer dec3Content = ByteBuffer.allocate((int) ec3SpecificBox.getContentSize());
        ec3SpecificBox.getContent(dec3Content);
        AudioQuality l = new AudioQuality();
        l.fourCC = "EC-3";
        l.bitrate = getBitrate(track);
        l.audioTag = 65534;
        l.samplingRate = ase.getSampleRate();
        l.channels = nfchans + lfechans;
        l.bitPerSample = 16;
        l.packetSize = (int) ((Sample) track.getSamples().get(0)).remaining();
        l.codecPrivateData = new StringBuilder(String.valueOf(Hex.encodeHex(waveformatex.array()))).append(Hex.encodeHex(dec3Content.array())).toString();
        return l;
    }

    private AudioQuality getDtsAudioQuality(Track track, AudioSampleEntry ase) {
        DTSSpecificBox dtsSpecificBox = (DTSSpecificBox) ase.getBoxes(DTSSpecificBox.class).get(0);
        if (dtsSpecificBox == null) {
            throw new RuntimeException("DTS track misses DTSSpecificBox!");
        }
        ByteBuffer waveformatex = ByteBuffer.allocate(22);
        short samplesPerBlock = (short) 0;
        switch (dtsSpecificBox.getFrameDuration()) {
            case PBE.MD5 /*0*/:
                samplesPerBlock = (short) 512;
                break;
            case ay.f /*1*/:
                samplesPerBlock = (short) 1024;
                break;
            case ay.n /*2*/:
                samplesPerBlock = (short) 2048;
                break;
            case ay.p /*3*/:
                samplesPerBlock = (short) 4096;
                break;
        }
        waveformatex.put((byte) (samplesPerBlock & 255));
        waveformatex.put((byte) (samplesPerBlock >>> 8));
        int dwChannelMask = getNumChannelsAndMask(dtsSpecificBox)[1];
        waveformatex.put((byte) (dwChannelMask & 255));
        waveformatex.put((byte) (dwChannelMask >>> 8));
        waveformatex.put((byte) (dwChannelMask >>> 16));
        waveformatex.put((byte) (dwChannelMask >>> 24));
        waveformatex.put(new byte[]{(byte) -82, (byte) -28, (byte) -65, (byte) 94, (byte) 97, (byte) 94, (byte) 65, (byte) -121, (byte) -110, (byte) -4, (byte) -92, (byte) -127, (byte) 38, (byte) -103, (byte) 2, (byte) 17});
        ByteBuffer dtsCodecPrivateData = ByteBuffer.allocate(8);
        dtsCodecPrivateData.put((byte) dtsSpecificBox.getStreamConstruction());
        int channelLayout = dtsSpecificBox.getChannelLayout();
        dtsCodecPrivateData.put((byte) (channelLayout & 255));
        dtsCodecPrivateData.put((byte) (channelLayout >>> 8));
        dtsCodecPrivateData.put((byte) (channelLayout >>> 16));
        dtsCodecPrivateData.put((byte) (channelLayout >>> 24));
        dtsCodecPrivateData.put((byte) (dtsSpecificBox.getLBRDurationMod() | ((byte) (dtsSpecificBox.getMultiAssetFlag() << 1))));
        dtsCodecPrivateData.put(new byte[2]);
        AudioQuality l = new AudioQuality();
        l.fourCC = getFormat(ase);
        l.bitrate = dtsSpecificBox.getAvgBitRate();
        l.audioTag = 65534;
        l.samplingRate = dtsSpecificBox.getDTSSamplingFrequency();
        l.channels = getNumChannelsAndMask(dtsSpecificBox)[0];
        l.bitPerSample = 16;
        l.packetSize = (int) ((Sample) track.getSamples().get(0)).remaining();
        l.codecPrivateData = new StringBuilder(String.valueOf(Hex.encodeHex(waveformatex.array()))).append(Hex.encodeHex(dtsCodecPrivateData.array())).toString();
        return l;
    }

    private int[] getNumChannelsAndMask(DTSSpecificBox dtsSpecificBox) {
        int channelLayout = dtsSpecificBox.getChannelLayout();
        int numChannels = 0;
        int dwChannelMask = 0;
        if ((channelLayout & 1) == 1) {
            numChannels = 0 + 1;
            dwChannelMask = 0 | 4;
        }
        if ((channelLayout & 2) == 2) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 1) | 2;
        }
        if ((channelLayout & 4) == 4) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 16) | 32;
        }
        if ((channelLayout & 8) == 8) {
            numChannels++;
            dwChannelMask |= 8;
        }
        if ((channelLayout & 16) == 16) {
            numChannels++;
            dwChannelMask |= 256;
        }
        if ((channelLayout & 32) == 32) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 4096) | 16384;
        }
        if ((channelLayout & 64) == 64) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 16) | 32;
        }
        if ((channelLayout & 128) == 128) {
            numChannels++;
            dwChannelMask |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            numChannels++;
            dwChannelMask |= 2048;
        }
        if ((channelLayout & 512) == 512) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 64) | 128;
        }
        if ((channelLayout & 1024) == 1024) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 512) | 1024;
        }
        if ((channelLayout & 2048) == 2048) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 16) | 32;
        }
        if ((channelLayout & 4096) == 4096) {
            numChannels++;
            dwChannelMask |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 16) | 32;
        }
        if ((channelLayout & 16384) == 16384) {
            numChannels++;
            dwChannelMask |= 65536;
        }
        if ((channelLayout & 32768) == 32768) {
            numChannels += 2;
            dwChannelMask = (dwChannelMask | 32768) | 131072;
        }
        if ((channelLayout & 65536) == 65536) {
            numChannels++;
        }
        if ((channelLayout & 131072) == 131072) {
            numChannels += 2;
        }
        return new int[]{numChannels, dwChannelMask};
    }

    private String getAudioCodecPrivateData(AudioSpecificConfig audioSpecificConfig) {
        return Hex.encodeHex(audioSpecificConfig.getConfigBytes());
    }

    private VideoQuality getVideoQuality(Track track, VisualSampleEntry vse) {
        if (VisualSampleEntry.TYPE3.equals(getFormat(vse))) {
            AvcConfigurationBox avcConfigurationBox = (AvcConfigurationBox) vse.getBoxes(AvcConfigurationBox.class).get(0);
            VideoQuality l = new VideoQuality();
            l.bitrate = getBitrate(track);
            l.codecPrivateData = Hex.encodeHex(getAvcCodecPrivateData(avcConfigurationBox));
            l.fourCC = "AVC1";
            l.width = vse.getWidth();
            l.height = vse.getHeight();
            l.nalLength = avcConfigurationBox.getLengthSizeMinusOne() + 1;
            return l;
        }
        throw new InternalError("I don't know how to handle video of type " + getFormat(vse));
    }

    private byte[] getAvcCodecPrivateData(AvcConfigurationBox avcConfigurationBox) {
        List<byte[]> sps = avcConfigurationBox.getSequenceParameterSets();
        List<byte[]> pps = avcConfigurationBox.getPictureParameterSets();
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[4];
            bArr[3] = (byte) 1;
            baos.write(bArr);
            for (byte[] sp : sps) {
                baos.write(sp);
            }
            bArr = new byte[4];
            bArr[3] = (byte) 1;
            baos.write(bArr);
            for (byte[] pp : pps) {
                baos.write(pp);
            }
            return baos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("ByteArrayOutputStream do not throw IOException ?!?!?");
        }
    }
}
