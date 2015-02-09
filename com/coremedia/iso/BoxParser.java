package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import java.io.IOException;
import java.nio.channels.FileChannel;

public interface BoxParser {
    Box parseBox(FileChannel fileChannel, Container container) throws IOException;
}
