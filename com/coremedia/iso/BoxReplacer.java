package com.coremedia.iso;

import com.coremedia.iso.boxes.Box;
import com.coremedia.iso.boxes.Container;
import com.googlecode.mp4parser.util.Path;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class BoxReplacer {
    static final /* synthetic */ boolean $assertionsDisabled;

    static {
        $assertionsDisabled = !BoxReplacer.class.desiredAssertionStatus();
    }

    public static void replace(Map<String, Box> replacements, File file) throws IOException {
        Container isoFile = new IsoFile(new RandomAccessFile(file, "r").getChannel(), new PropertyBoxParserImpl(new String[0]));
        Map<String, Box> replacementSanitised = new HashMap();
        for (Entry<String, Box> e : replacements.entrySet()) {
            Box b = Path.getPath(isoFile, (String) e.getKey());
            replacementSanitised.put(Path.createPath(b), (Box) e.getValue());
            if (!$assertionsDisabled && b.getSize() != ((Box) e.getValue()).getSize()) {
                throw new AssertionError();
            }
        }
        isoFile.close();
        FileChannel fileChannel = new RandomAccessFile(file, "rw").getChannel();
        Iterator it = replacementSanitised.entrySet().iterator();
        if (it.hasNext()) {
            String str = (String) ((Entry) it.next()).getKey();
            throw new RuntimeException("ddd");
        } else {
            fileChannel.close();
        }
    }
}
