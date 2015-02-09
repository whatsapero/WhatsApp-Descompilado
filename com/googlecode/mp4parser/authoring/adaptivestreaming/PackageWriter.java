package com.googlecode.mp4parser.authoring.adaptivestreaming;

import com.googlecode.mp4parser.authoring.Movie;
import java.io.IOException;

public interface PackageWriter {
    void write(Movie movie) throws IOException;
}
