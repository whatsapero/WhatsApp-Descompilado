package com.googlecode.mp4parser.authoring.container.mp4;

import com.coremedia.iso.IsoFile;
import com.coremedia.iso.boxes.TrackBox;
import com.googlecode.mp4parser.authoring.Movie;
import com.googlecode.mp4parser.authoring.Mp4TrackImpl;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class MovieCreator {
    public static Movie build(String file) throws IOException {
        return build(new FileInputStream(file).getChannel());
    }

    public static Movie build(FileChannel channel) throws IOException {
        IsoFile isoFile = new IsoFile(channel);
        Movie m = new Movie();
        for (TrackBox trackBox : isoFile.getMovieBox().getBoxes(TrackBox.class)) {
            m.addTrack(new Mp4TrackImpl(trackBox, new IsoFile[0]));
        }
        m.setMatrix(isoFile.getMovieBox().getMovieHeaderBox().getMatrix());
        return m;
    }
}
