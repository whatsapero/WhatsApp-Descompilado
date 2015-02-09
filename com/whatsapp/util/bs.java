package com.whatsapp.util;

import java.io.File;
import java.util.Comparator;

final class bs implements Comparator {
    public int compare(Object obj, Object obj2) {
        return a((File) obj, (File) obj2);
    }

    public int a(File file, File file2) {
        if (file.lastModified() == file2.lastModified()) {
            return 0;
        }
        return file.lastModified() < file2.lastModified() ? -1 : 1;
    }

    bs(n nVar) {
        this();
    }

    private bs() {
    }
}
