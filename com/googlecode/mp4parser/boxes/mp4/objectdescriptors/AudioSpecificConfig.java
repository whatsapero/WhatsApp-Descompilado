package com.googlecode.mp4parser.boxes.mp4.objectdescriptors;

import com.coremedia.iso.Hex;
import com.coremedia.iso.IsoTypeWriter;
import com.whatsapp.vk;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

@Descriptor(objectTypeIndication = 64, tags = {5})
public class AudioSpecificConfig extends BaseDescriptor {
    public static Map<Integer, String> audioObjectTypeMap;
    public static Map<Integer, Integer> samplingFrequencyIndexMap;
    int aacScalefactorDataResilienceFlag;
    int aacSectionDataResilienceFlag;
    int aacSpectralDataResilienceFlag;
    int audioObjectType;
    int channelConfiguration;
    byte[] configBytes;
    int coreCoderDelay;
    int dependsOnCoreCoder;
    int directMapping;
    int epConfig;
    int erHvxcExtensionFlag;
    int extensionAudioObjectType;
    int extensionChannelConfiguration;
    int extensionFlag;
    int extensionFlag3;
    int extensionSamplingFrequency;
    int extensionSamplingFrequencyIndex;
    int fillBits;
    int frameLengthFlag;
    boolean gaSpecificConfig;
    int hilnContMode;
    int hilnEnhaLayer;
    int hilnEnhaQuantMode;
    int hilnFrameLength;
    int hilnMaxNumLine;
    int hilnQuantMode;
    int hilnSampleRateCode;
    int hvxcRateMode;
    int hvxcVarMode;
    int isBaseLayer;
    int layerNr;
    int layer_length;
    int numOfSubFrame;
    int paraExtensionFlag;
    int paraMode;
    boolean parametricSpecificConfig;
    int psPresentFlag;
    int sacPayloadEmbedding;
    int samplingFrequency;
    int samplingFrequencyIndex;
    int sbrPresentFlag;
    int syncExtensionType;
    int var_ScalableFlag;

    static {
        samplingFrequencyIndexMap = new HashMap();
        audioObjectTypeMap = new HashMap();
        samplingFrequencyIndexMap.put(Integer.valueOf(0), Integer.valueOf(96000));
        samplingFrequencyIndexMap.put(Integer.valueOf(1), Integer.valueOf(88200));
        samplingFrequencyIndexMap.put(Integer.valueOf(2), Integer.valueOf(64000));
        samplingFrequencyIndexMap.put(Integer.valueOf(3), Integer.valueOf(48000));
        samplingFrequencyIndexMap.put(Integer.valueOf(4), Integer.valueOf(44100));
        samplingFrequencyIndexMap.put(Integer.valueOf(5), Integer.valueOf(32000));
        samplingFrequencyIndexMap.put(Integer.valueOf(6), Integer.valueOf(24000));
        samplingFrequencyIndexMap.put(Integer.valueOf(7), Integer.valueOf(22050));
        samplingFrequencyIndexMap.put(Integer.valueOf(8), Integer.valueOf(16000));
        samplingFrequencyIndexMap.put(Integer.valueOf(9), Integer.valueOf(12000));
        samplingFrequencyIndexMap.put(Integer.valueOf(10), Integer.valueOf(11025));
        samplingFrequencyIndexMap.put(Integer.valueOf(11), Integer.valueOf(8000));
        audioObjectTypeMap.put(Integer.valueOf(1), "AAC main");
        audioObjectTypeMap.put(Integer.valueOf(2), "AAC LC");
        audioObjectTypeMap.put(Integer.valueOf(3), "AAC SSR");
        audioObjectTypeMap.put(Integer.valueOf(4), "AAC LTP");
        audioObjectTypeMap.put(Integer.valueOf(5), "SBR");
        audioObjectTypeMap.put(Integer.valueOf(6), "AAC Scalable");
        audioObjectTypeMap.put(Integer.valueOf(7), "TwinVQ");
        audioObjectTypeMap.put(Integer.valueOf(8), "CELP");
        audioObjectTypeMap.put(Integer.valueOf(9), "HVXC");
        audioObjectTypeMap.put(Integer.valueOf(10), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(11), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(12), "TTSI");
        audioObjectTypeMap.put(Integer.valueOf(13), "Main synthetic");
        audioObjectTypeMap.put(Integer.valueOf(14), "Wavetable synthesis");
        audioObjectTypeMap.put(Integer.valueOf(15), "General MIDI");
        audioObjectTypeMap.put(Integer.valueOf(16), "Algorithmic Synthesis and Audio FX");
        audioObjectTypeMap.put(Integer.valueOf(17), "ER AAC LC");
        audioObjectTypeMap.put(Integer.valueOf(18), "(reserved)");
        audioObjectTypeMap.put(Integer.valueOf(19), "ER AAC LTP");
        audioObjectTypeMap.put(Integer.valueOf(20), "ER AAC Scalable");
        audioObjectTypeMap.put(Integer.valueOf(21), "ER TwinVQ");
        audioObjectTypeMap.put(Integer.valueOf(22), "ER BSAC");
        audioObjectTypeMap.put(Integer.valueOf(23), "ER AAC LD");
        audioObjectTypeMap.put(Integer.valueOf(24), "ER CELP");
        audioObjectTypeMap.put(Integer.valueOf(25), "ER HVXC");
        audioObjectTypeMap.put(Integer.valueOf(26), "ER HILN");
        audioObjectTypeMap.put(Integer.valueOf(27), "ER Parametric");
        audioObjectTypeMap.put(Integer.valueOf(28), "SSC");
        audioObjectTypeMap.put(Integer.valueOf(29), "PS");
        audioObjectTypeMap.put(Integer.valueOf(30), "MPEG Surround");
        audioObjectTypeMap.put(Integer.valueOf(31), "(escape)");
        audioObjectTypeMap.put(Integer.valueOf(32), "Layer-1");
        audioObjectTypeMap.put(Integer.valueOf(33), "Layer-2");
        audioObjectTypeMap.put(Integer.valueOf(34), "Layer-3");
        audioObjectTypeMap.put(Integer.valueOf(35), "DST");
        audioObjectTypeMap.put(Integer.valueOf(36), "ALS");
        audioObjectTypeMap.put(Integer.valueOf(37), "SLS");
        audioObjectTypeMap.put(Integer.valueOf(38), "SLS non-core");
        audioObjectTypeMap.put(Integer.valueOf(39), "ER AAC ELD");
        audioObjectTypeMap.put(Integer.valueOf(40), "SMR Simple");
        audioObjectTypeMap.put(Integer.valueOf(41), "SMR Main");
    }

    public void parseDetail(ByteBuffer bb) throws IOException {
        ByteBuffer configBytes = bb.slice();
        configBytes.limit(this.sizeOfInstance);
        bb.position(bb.position() + this.sizeOfInstance);
        this.configBytes = new byte[this.sizeOfInstance];
        configBytes.get(this.configBytes);
        configBytes.rewind();
        BitReaderBuffer bitReaderBuffer = new BitReaderBuffer(configBytes);
        this.audioObjectType = getAudioObjectType(bitReaderBuffer);
        this.samplingFrequencyIndex = bitReaderBuffer.readBits(4);
        if (this.samplingFrequencyIndex == 15) {
            this.samplingFrequency = bitReaderBuffer.readBits(24);
        }
        this.channelConfiguration = bitReaderBuffer.readBits(4);
        if (this.audioObjectType == 5 || this.audioObjectType == 29) {
            this.extensionAudioObjectType = 5;
            this.sbrPresentFlag = 1;
            if (this.audioObjectType == 29) {
                this.psPresentFlag = 1;
            }
            this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
            if (this.extensionSamplingFrequencyIndex == 15) {
                this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
            }
            this.audioObjectType = getAudioObjectType(bitReaderBuffer);
            if (this.audioObjectType == 22) {
                this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
            }
        } else {
            this.extensionAudioObjectType = 0;
        }
        switch (this.audioObjectType) {
            case ay.f /*1*/:
            case ay.n /*2*/:
            case ay.p /*3*/:
            case aj.i /*4*/:
            case aV.i /*6*/:
            case a8.s /*7*/:
            case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
            case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
            case vk.SherlockTheme_buttonStyleSmall /*20*/:
            case vk.SherlockTheme_selectableItemBackground /*21*/:
            case vk.SherlockTheme_windowContentOverlay /*22*/:
            case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                parseGaSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                break;
            case a8.n /*8*/:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case a6.D /*9*/:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case a6.s /*12*/:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case a6.z /*13*/:
            case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
            case vk.SherlockTheme_actionModeBackground /*15*/:
            case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case vk.SherlockTheme_textAppearanceSmall /*25*/:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case vk.SherlockTheme_textColorPrimary /*26*/:
            case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
                parseParametricSpecificConfig(this.samplingFrequencyIndex, this.channelConfiguration, this.audioObjectType, bitReaderBuffer);
                break;
            case vk.SherlockTheme_textColorPrimaryInverse /*28*/:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case vk.SherlockTheme_spinnerDropDownItemStyle /*30*/:
                this.sacPayloadEmbedding = bitReaderBuffer.readBits(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case vk.SherlockTheme_searchDropdownBackground /*32*/:
            case vk.SherlockTheme_searchViewCloseIcon /*33*/:
            case vk.SherlockTheme_searchViewGoIcon /*34*/:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case vk.SherlockTheme_searchViewSearchIcon /*35*/:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case vk.SherlockTheme_searchViewVoiceIcon /*36*/:
                this.fillBits = bitReaderBuffer.readBits(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case vk.SherlockTheme_searchViewEditQuery /*37*/:
            case vk.SherlockTheme_searchViewEditQueryBackground /*38*/:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case vk.SherlockTheme_searchViewTextField /*39*/:
                throw new UnsupportedOperationException("can't parse ELDSpecificConfig yet");
            case vk.SherlockTheme_searchViewTextFieldRight /*40*/:
            case vk.SherlockTheme_textColorSearchUrl /*41*/:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        switch (this.audioObjectType) {
            case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
            case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
            case vk.SherlockTheme_buttonStyleSmall /*20*/:
            case vk.SherlockTheme_selectableItemBackground /*21*/:
            case vk.SherlockTheme_windowContentOverlay /*22*/:
            case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
            case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
            case vk.SherlockTheme_textAppearanceSmall /*25*/:
            case vk.SherlockTheme_textColorPrimary /*26*/:
            case vk.SherlockTheme_textColorPrimaryDisableOnly /*27*/:
            case vk.SherlockTheme_searchViewTextField /*39*/:
                this.epConfig = bitReaderBuffer.readBits(2);
                if (this.epConfig == 2 || this.epConfig == 3) {
                    throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
                } else if (this.epConfig == 3) {
                    this.directMapping = bitReaderBuffer.readBits(1);
                    if (this.directMapping == 0) {
                        throw new RuntimeException("not implemented");
                    }
                }
                break;
        }
        if (this.extensionAudioObjectType != 5 && bitReaderBuffer.remainingBits() >= 16) {
            this.syncExtensionType = bitReaderBuffer.readBits(11);
            if (this.syncExtensionType == 695) {
                this.extensionAudioObjectType = getAudioObjectType(bitReaderBuffer);
                if (this.extensionAudioObjectType == 5) {
                    this.sbrPresentFlag = bitReaderBuffer.readBits(1);
                    if (this.sbrPresentFlag == 1) {
                        this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                        if (bitReaderBuffer.remainingBits() >= 12) {
                            this.syncExtensionType = bitReaderBuffer.readBits(11);
                            if (this.syncExtensionType == 1352) {
                                this.psPresentFlag = bitReaderBuffer.readBits(1);
                            }
                        }
                    }
                }
                if (this.extensionAudioObjectType == 22) {
                    this.sbrPresentFlag = bitReaderBuffer.readBits(1);
                    if (this.sbrPresentFlag == 1) {
                        this.extensionSamplingFrequencyIndex = bitReaderBuffer.readBits(4);
                        if (this.extensionSamplingFrequencyIndex == 15) {
                            this.extensionSamplingFrequency = bitReaderBuffer.readBits(24);
                        }
                    }
                    this.extensionChannelConfiguration = bitReaderBuffer.readBits(4);
                }
            }
        }
    }

    private int gaSpecificConfigSize() {
        return 0;
    }

    public int serializedSize() {
        if (this.audioObjectType == 2) {
            return 4 + gaSpecificConfigSize();
        }
        throw new UnsupportedOperationException("can't serialize that yet");
    }

    public ByteBuffer serialize() {
        ByteBuffer out = ByteBuffer.allocate(serializedSize());
        IsoTypeWriter.writeUInt8(out, 5);
        IsoTypeWriter.writeUInt8(out, serializedSize() - 2);
        BitWriterBuffer bwb = new BitWriterBuffer(out);
        bwb.writeBits(this.audioObjectType, 5);
        bwb.writeBits(this.samplingFrequencyIndex, 4);
        if (this.samplingFrequencyIndex == 15) {
            throw new UnsupportedOperationException("can't serialize that yet");
        }
        bwb.writeBits(this.channelConfiguration, 4);
        return out;
    }

    private int getAudioObjectType(BitReaderBuffer in) throws IOException {
        int audioObjectType = in.readBits(5);
        return audioObjectType == 31 ? in.readBits(6) + 32 : audioObjectType;
    }

    private void parseGaSpecificConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {
        this.frameLengthFlag = in.readBits(1);
        this.dependsOnCoreCoder = in.readBits(1);
        if (this.dependsOnCoreCoder == 1) {
            this.coreCoderDelay = in.readBits(14);
        }
        this.extensionFlag = in.readBits(1);
        if (channelConfiguration == 0) {
            throw new UnsupportedOperationException("can't parse program_config_element yet");
        }
        if (audioObjectType == 6 || audioObjectType == 20) {
            this.layerNr = in.readBits(3);
        }
        if (this.extensionFlag == 1) {
            if (audioObjectType == 22) {
                this.numOfSubFrame = in.readBits(5);
                this.layer_length = in.readBits(11);
            }
            if (audioObjectType == 17 || audioObjectType == 19 || audioObjectType == 20 || audioObjectType == 23) {
                this.aacSectionDataResilienceFlag = in.readBits(1);
                this.aacScalefactorDataResilienceFlag = in.readBits(1);
                this.aacSpectralDataResilienceFlag = in.readBits(1);
            }
            this.extensionFlag3 = in.readBits(1);
        }
        this.gaSpecificConfig = true;
    }

    private void parseParametricSpecificConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {
        this.isBaseLayer = in.readBits(1);
        if (this.isBaseLayer == 1) {
            parseParaConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        } else {
            parseHilnEnexConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }
    }

    private void parseParaConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {
        this.paraMode = in.readBits(2);
        if (this.paraMode != 1) {
            parseErHvxcConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }
        if (this.paraMode != 0) {
            parseHilnConfig(samplingFrequencyIndex, channelConfiguration, audioObjectType, in);
        }
        this.paraExtensionFlag = in.readBits(1);
        this.parametricSpecificConfig = true;
    }

    private void parseErHvxcConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {
        this.hvxcVarMode = in.readBits(1);
        this.hvxcRateMode = in.readBits(2);
        this.erHvxcExtensionFlag = in.readBits(1);
        if (this.erHvxcExtensionFlag == 1) {
            this.var_ScalableFlag = in.readBits(1);
        }
    }

    private void parseHilnConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {
        this.hilnQuantMode = in.readBits(1);
        this.hilnMaxNumLine = in.readBits(8);
        this.hilnSampleRateCode = in.readBits(4);
        this.hilnFrameLength = in.readBits(12);
        this.hilnContMode = in.readBits(2);
    }

    private void parseHilnEnexConfig(int samplingFrequencyIndex, int channelConfiguration, int audioObjectType, BitReaderBuffer in) throws IOException {
        this.hilnEnhaLayer = in.readBits(1);
        if (this.hilnEnhaLayer == 1) {
            this.hilnEnhaQuantMode = in.readBits(2);
        }
    }

    public byte[] getConfigBytes() {
        return this.configBytes;
    }

    public int getAudioObjectType() {
        return this.audioObjectType;
    }

    public int getExtensionAudioObjectType() {
        return this.extensionAudioObjectType;
    }

    public int getSbrPresentFlag() {
        return this.sbrPresentFlag;
    }

    public int getPsPresentFlag() {
        return this.psPresentFlag;
    }

    public void setAudioObjectType(int audioObjectType) {
        this.audioObjectType = audioObjectType;
    }

    public void setSamplingFrequencyIndex(int samplingFrequencyIndex) {
        this.samplingFrequencyIndex = samplingFrequencyIndex;
    }

    public void setSamplingFrequency(int samplingFrequency) {
        this.samplingFrequency = samplingFrequency;
    }

    public void setChannelConfiguration(int channelConfiguration) {
        this.channelConfiguration = channelConfiguration;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioSpecificConfig");
        sb.append("{configBytes=").append(Hex.encodeHex(this.configBytes));
        sb.append(", audioObjectType=").append(this.audioObjectType).append(" (").append((String) audioObjectTypeMap.get(Integer.valueOf(this.audioObjectType))).append(")");
        sb.append(", samplingFrequencyIndex=").append(this.samplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(Integer.valueOf(this.samplingFrequencyIndex))).append(")");
        sb.append(", samplingFrequency=").append(this.samplingFrequency);
        sb.append(", channelConfiguration=").append(this.channelConfiguration);
        if (this.extensionAudioObjectType > 0) {
            sb.append(", extensionAudioObjectType=").append(this.extensionAudioObjectType).append(" (").append((String) audioObjectTypeMap.get(Integer.valueOf(this.extensionAudioObjectType))).append(")");
            sb.append(", sbrPresentFlag=").append(this.sbrPresentFlag);
            sb.append(", psPresentFlag=").append(this.psPresentFlag);
            sb.append(", extensionSamplingFrequencyIndex=").append(this.extensionSamplingFrequencyIndex).append(" (").append(samplingFrequencyIndexMap.get(Integer.valueOf(this.extensionSamplingFrequencyIndex))).append(")");
            sb.append(", extensionSamplingFrequency=").append(this.extensionSamplingFrequency);
            sb.append(", extensionChannelConfiguration=").append(this.extensionChannelConfiguration);
        }
        sb.append(", syncExtensionType=").append(this.syncExtensionType);
        if (this.gaSpecificConfig) {
            sb.append(", frameLengthFlag=").append(this.frameLengthFlag);
            sb.append(", dependsOnCoreCoder=").append(this.dependsOnCoreCoder);
            sb.append(", coreCoderDelay=").append(this.coreCoderDelay);
            sb.append(", extensionFlag=").append(this.extensionFlag);
            sb.append(", layerNr=").append(this.layerNr);
            sb.append(", numOfSubFrame=").append(this.numOfSubFrame);
            sb.append(", layer_length=").append(this.layer_length);
            sb.append(", aacSectionDataResilienceFlag=").append(this.aacSectionDataResilienceFlag);
            sb.append(", aacScalefactorDataResilienceFlag=").append(this.aacScalefactorDataResilienceFlag);
            sb.append(", aacSpectralDataResilienceFlag=").append(this.aacSpectralDataResilienceFlag);
            sb.append(", extensionFlag3=").append(this.extensionFlag3);
        }
        if (this.parametricSpecificConfig) {
            sb.append(", isBaseLayer=").append(this.isBaseLayer);
            sb.append(", paraMode=").append(this.paraMode);
            sb.append(", paraExtensionFlag=").append(this.paraExtensionFlag);
            sb.append(", hvxcVarMode=").append(this.hvxcVarMode);
            sb.append(", hvxcRateMode=").append(this.hvxcRateMode);
            sb.append(", erHvxcExtensionFlag=").append(this.erHvxcExtensionFlag);
            sb.append(", var_ScalableFlag=").append(this.var_ScalableFlag);
            sb.append(", hilnQuantMode=").append(this.hilnQuantMode);
            sb.append(", hilnMaxNumLine=").append(this.hilnMaxNumLine);
            sb.append(", hilnSampleRateCode=").append(this.hilnSampleRateCode);
            sb.append(", hilnFrameLength=").append(this.hilnFrameLength);
            sb.append(", hilnContMode=").append(this.hilnContMode);
            sb.append(", hilnEnhaLayer=").append(this.hilnEnhaLayer);
            sb.append(", hilnEnhaQuantMode=").append(this.hilnEnhaQuantMode);
        }
        sb.append('}');
        return sb.toString();
    }

    public int getSamplingFrequency() {
        return this.samplingFrequencyIndex == 15 ? this.samplingFrequency : ((Integer) samplingFrequencyIndexMap.get(Integer.valueOf(this.samplingFrequencyIndex))).intValue();
    }

    public int getChannelConfiguration() {
        return this.channelConfiguration;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AudioSpecificConfig that = (AudioSpecificConfig) o;
        if (this.aacScalefactorDataResilienceFlag != that.aacScalefactorDataResilienceFlag) {
            return false;
        }
        if (this.aacSectionDataResilienceFlag != that.aacSectionDataResilienceFlag) {
            return false;
        }
        if (this.aacSpectralDataResilienceFlag != that.aacSpectralDataResilienceFlag) {
            return false;
        }
        if (this.audioObjectType != that.audioObjectType) {
            return false;
        }
        if (this.channelConfiguration != that.channelConfiguration) {
            return false;
        }
        if (this.coreCoderDelay != that.coreCoderDelay) {
            return false;
        }
        if (this.dependsOnCoreCoder != that.dependsOnCoreCoder) {
            return false;
        }
        if (this.directMapping != that.directMapping) {
            return false;
        }
        if (this.epConfig != that.epConfig) {
            return false;
        }
        if (this.erHvxcExtensionFlag != that.erHvxcExtensionFlag) {
            return false;
        }
        if (this.extensionAudioObjectType != that.extensionAudioObjectType) {
            return false;
        }
        if (this.extensionChannelConfiguration != that.extensionChannelConfiguration) {
            return false;
        }
        if (this.extensionFlag != that.extensionFlag) {
            return false;
        }
        if (this.extensionFlag3 != that.extensionFlag3) {
            return false;
        }
        if (this.extensionSamplingFrequency != that.extensionSamplingFrequency) {
            return false;
        }
        if (this.extensionSamplingFrequencyIndex != that.extensionSamplingFrequencyIndex) {
            return false;
        }
        if (this.fillBits != that.fillBits) {
            return false;
        }
        if (this.frameLengthFlag != that.frameLengthFlag) {
            return false;
        }
        if (this.gaSpecificConfig != that.gaSpecificConfig) {
            return false;
        }
        if (this.hilnContMode != that.hilnContMode) {
            return false;
        }
        if (this.hilnEnhaLayer != that.hilnEnhaLayer) {
            return false;
        }
        if (this.hilnEnhaQuantMode != that.hilnEnhaQuantMode) {
            return false;
        }
        if (this.hilnFrameLength != that.hilnFrameLength) {
            return false;
        }
        if (this.hilnMaxNumLine != that.hilnMaxNumLine) {
            return false;
        }
        if (this.hilnQuantMode != that.hilnQuantMode) {
            return false;
        }
        if (this.hilnSampleRateCode != that.hilnSampleRateCode) {
            return false;
        }
        if (this.hvxcRateMode != that.hvxcRateMode) {
            return false;
        }
        if (this.hvxcVarMode != that.hvxcVarMode) {
            return false;
        }
        if (this.isBaseLayer != that.isBaseLayer) {
            return false;
        }
        if (this.layerNr != that.layerNr) {
            return false;
        }
        if (this.layer_length != that.layer_length) {
            return false;
        }
        if (this.numOfSubFrame != that.numOfSubFrame) {
            return false;
        }
        if (this.paraExtensionFlag != that.paraExtensionFlag) {
            return false;
        }
        if (this.paraMode != that.paraMode) {
            return false;
        }
        if (this.parametricSpecificConfig != that.parametricSpecificConfig) {
            return false;
        }
        if (this.psPresentFlag != that.psPresentFlag) {
            return false;
        }
        if (this.sacPayloadEmbedding != that.sacPayloadEmbedding) {
            return false;
        }
        if (this.samplingFrequency != that.samplingFrequency) {
            return false;
        }
        if (this.samplingFrequencyIndex != that.samplingFrequencyIndex) {
            return false;
        }
        if (this.sbrPresentFlag != that.sbrPresentFlag) {
            return false;
        }
        if (this.syncExtensionType != that.syncExtensionType) {
            return false;
        }
        if (this.var_ScalableFlag != that.var_ScalableFlag) {
            return false;
        }
        return Arrays.equals(this.configBytes, that.configBytes);
    }

    public int hashCode() {
        int result;
        int i;
        int i2 = 1;
        if (this.configBytes != null) {
            result = Arrays.hashCode(this.configBytes);
        } else {
            result = 0;
        }
        int i3 = ((((((((((((((((((((((((((((((((((((((((((((((((((((result * 31) + this.audioObjectType) * 31) + this.samplingFrequencyIndex) * 31) + this.samplingFrequency) * 31) + this.channelConfiguration) * 31) + this.extensionAudioObjectType) * 31) + this.sbrPresentFlag) * 31) + this.psPresentFlag) * 31) + this.extensionSamplingFrequencyIndex) * 31) + this.extensionSamplingFrequency) * 31) + this.extensionChannelConfiguration) * 31) + this.sacPayloadEmbedding) * 31) + this.fillBits) * 31) + this.epConfig) * 31) + this.directMapping) * 31) + this.syncExtensionType) * 31) + this.frameLengthFlag) * 31) + this.dependsOnCoreCoder) * 31) + this.coreCoderDelay) * 31) + this.extensionFlag) * 31) + this.layerNr) * 31) + this.numOfSubFrame) * 31) + this.layer_length) * 31) + this.aacSectionDataResilienceFlag) * 31) + this.aacScalefactorDataResilienceFlag) * 31) + this.aacSpectralDataResilienceFlag) * 31) + this.extensionFlag3) * 31;
        if (this.gaSpecificConfig) {
            i = 1;
        } else {
            i = 0;
        }
        i = (((((((((((((((((((((((((((((i3 + i) * 31) + this.isBaseLayer) * 31) + this.paraMode) * 31) + this.paraExtensionFlag) * 31) + this.hvxcVarMode) * 31) + this.hvxcRateMode) * 31) + this.erHvxcExtensionFlag) * 31) + this.var_ScalableFlag) * 31) + this.hilnQuantMode) * 31) + this.hilnMaxNumLine) * 31) + this.hilnSampleRateCode) * 31) + this.hilnFrameLength) * 31) + this.hilnContMode) * 31) + this.hilnEnhaLayer) * 31) + this.hilnEnhaQuantMode) * 31;
        if (!this.parametricSpecificConfig) {
            i2 = 0;
        }
        return i + i2;
    }
}
