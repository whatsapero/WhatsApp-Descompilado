package com.whatsapp;

import java.io.File;
import java.util.Comparator;

final class t5 implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }

    t5() {
    }

    public int a(File file, File file2) {
        return (int) (file2.lastModified() - file.lastModified());
    }
}
