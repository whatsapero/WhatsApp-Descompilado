package com.whatsapp.util;

import java.io.File;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;

public class at {
    private static final String[] z;

    static {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:22)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:261)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:157)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(Unknown Source)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(Unknown Source)
	at java.lang.Thread.run(Unknown Source)
*/
        /*
        r1 = 0;
        r0 = 2;
        r3 = new java.lang.String[r0];
        r2 = "!a/Gb\u0015U{Z+";
        r0 = -1;
        r4 = r3;
        r5 = r3;
        r3 = r1;
    L_0x000a:
        r2 = r2.toCharArray();
        r6 = r2.length;
        r7 = r6;
        r8 = r1;
        r6 = r2;
    L_0x0012:
        if (r7 > r8) goto L_0x002f;
    L_0x0014:
        r2 = new java.lang.String;
        r2.<init>(r6);
        r2 = r2.intern();
        switch(r0) {
            case 0: goto L_0x002a;
            default: goto L_0x0020;
        };
    L_0x0020:
        r4[r3] = r2;
        r2 = 1;
        r0 = "v)";
        r3 = r2;
        r4 = r5;
        r2 = r0;
        r0 = r1;
        goto L_0x000a;
    L_0x002a:
        r4[r3] = r2;
        z = r5;
        return;
    L_0x002f:
        r9 = r6[r8];
        r2 = r8 % 5;
        switch(r2) {
            case 0: goto L_0x0040;
            case 1: goto L_0x0043;
            case 2: goto L_0x0046;
            case 3: goto L_0x0049;
            default: goto L_0x0036;
        };
    L_0x0036:
        r2 = 79;
    L_0x0038:
        r2 = r2 ^ r9;
        r2 = (char) r2;
        r6[r8] = r2;
        r2 = r8 + 1;
        r8 = r2;
        goto L_0x0012;
    L_0x0040:
        r2 = 88;
        goto L_0x0038;
    L_0x0043:
        r2 = 24;
        goto L_0x0038;
    L_0x0046:
        r2 = 86;
        goto L_0x0038;
    L_0x0049:
        r2 = 62;
        goto L_0x0038;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.at.<clinit>():void");
    }

    public static boolean b(File file, File file2) {
        boolean z = false;
        if (file.exists()) {
            try {
                z = file.renameTo(new File(file2.getPath() + "." + (a(file, file2) + 1)));
            } catch (SecurityException e) {
            }
        }
        return z;
    }

    private static String b(String str) {
        return a(str, new Date()).substring(0, a(str));
    }

    public static void a(FileChannel fileChannel, WritableByteChannel writableByteChannel) {
        int i = Log.e;
        long j = 0;
        while (j < fileChannel.size()) {
            fileChannel.transferTo(j, Math.min(131072, fileChannel.size() - j), writableByteChannel);
            j += 131072;
            if (i != 0) {
                return;
            }
        }
    }

    private static boolean a(File file, int i) {
        float currentTimeMillis = (float) ((System.currentTimeMillis() - file.lastModified()) / 86400000);
        try {
            if (file.exists()) {
                if ((System.currentTimeMillis() - file.lastModified()) / 86400000 <= ((long) i)) {
                    return true;
                }
            }
            try {
                return false;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    private static String a(String str, Date date) {
        return str.substring(0, str.indexOf(46)) + "-" + a().format(date);
    }

    public static File b(File file, String str) {
        Date date = new Date();
        String a = a(file.getName(), date);
        String a2 = a(file.getName(), str);
        String str2 = "1";
        String a3 = a(file, date, str);
        if (a3 != null) {
            int length = a.length() + 1;
            int length2 = a3.length() - a2.length();
            if (length < length2) {
                try {
                    str2 = Integer.toString(Integer.parseInt(a3.substring(length, length2)) + 1);
                } catch (NumberFormatException e) {
                }
            }
        }
        File file2 = new File(file.getParent(), a + "." + str2 + a2);
        file2.createNewFile();
        return file2;
    }

    private static int a(File file, File file2) {
        int i = 0;
        int i2 = Log.e;
        String name = file2.getName();
        int length = name.length() + 1;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            int length2 = listFiles.length;
            int i3 = 0;
            while (i3 < length2) {
                int parseInt;
                String name2 = listFiles[i3].getName();
                if (name2.startsWith(name)) {
                    int length3 = name2.length();
                    try {
                        if (length3 <= name2.length() && length < length3) {
                            try {
                                parseInt = Integer.parseInt(name2.substring(length, length3));
                                if (parseInt <= i) {
                                    parseInt = i;
                                }
                                i = parseInt;
                            } catch (NumberFormatException e) {
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                parseInt = i3 + 1;
                if (i2 != 0) {
                    break;
                }
                i3 = parseInt;
            }
        }
        return i;
    }

    public static ArrayList a(File file, int i, String str) {
        int i2 = Log.e;
        SimpleDateFormat a = a();
        ArrayList arrayList = new ArrayList();
        Date date = new Date();
        String toPattern = a.toPattern();
        String a2 = a(file.getName(), str);
        String b = b(file.getName());
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            Arrays.sort(listFiles);
            int length = listFiles.length;
            int i3 = 0;
            while (i3 < length) {
                File file2 = listFiles[i3];
                String name = file2.getName();
                try {
                    if (name.startsWith(b) && name.endsWith(a2)) {
                        try {
                            if ((date.getTime() - a.parse(name.substring(b.length(), b.length() + toPattern.length())).getTime()) / 86400000 < ((long) i)) {
                                arrayList.add(file2);
                            }
                        } catch (ParseException e) {
                            throw e;
                        } catch (ParseException e2) {
                        }
                    }
                    i3++;
                    if (i2 != 0) {
                        break;
                    }
                } catch (ParseException e3) {
                    throw e3;
                }
            }
        }
        return arrayList;
    }

    private static int a(String str) {
        return str.indexOf(46) + "-".length();
    }

    public static ArrayList a(ArrayList arrayList) {
        Collections.sort(arrayList, new bs(null));
        return arrayList;
    }

    public static String a(File file, Date date, String str) {
        int i = Log.e;
        String a = a(file.getName(), date);
        String a2 = a(file.getName(), str);
        File file2 = null;
        File[] listFiles = file.getParentFile().listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                File file3 = listFiles[i2];
                String name = file3.getName();
                try {
                    if (name.startsWith(a) && name.endsWith(a2)) {
                        int length2 = a.length() + 1;
                        int length3 = name.length() - a2.length();
                        try {
                            if (length3 < name.length() && length2 < length3) {
                                try {
                                    int i4;
                                    int parseInt = Integer.parseInt(name.substring(length2, length3));
                                    if (parseInt > i3) {
                                        i4 = parseInt;
                                    } else {
                                        file3 = file2;
                                        i4 = i3;
                                    }
                                    i3 = i4;
                                    file2 = file3;
                                } catch (NumberFormatException e) {
                                }
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    int i5 = i2 + 1;
                    if (i != 0) {
                        break;
                    }
                    i2 = i5;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        }
        if (file2 == null) {
            return a + z[1] + a2;
        }
        try {
            return file2.getName();
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    public static ArrayList c(File file, File file2) {
        int i = Log.e;
        ArrayList arrayList = new ArrayList();
        int a = a(file, file2);
        String parent = file.getParent();
        int i2 = 1;
        while (i2 <= a) {
            File file3 = new File(parent, file2.getName() + "." + i2);
            try {
                if (file3.exists()) {
                    arrayList.add(file3);
                }
                i2++;
                if (i != 0) {
                    break;
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return arrayList;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void b(java.io.File r18, int r19, java.lang.String r20) {
        /*
        r4 = com.whatsapp.util.Log.e;
        r5 = a();
        r6 = new java.util.Date;
        r6.<init>();
        r7 = r5.toPattern();
        r2 = r18.getName();
        r0 = r20;
        r8 = a(r2, r0);
        r2 = r18.getName();
        r9 = b(r2);
        r2 = 0;
        if (r19 >= 0) goto L_0x003b;
    L_0x0024:
        r2 = r18.getName();
        r3 = 46;
        r2 = r2.indexOf(r3);
        r3 = -1;
        if (r2 != r3) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r3 = r18.getName();
        r10 = 0;
        r2 = r3.substring(r10, r2);
    L_0x003b:
        r3 = r18.getParentFile();
        r10 = r3.listFiles();
        if (r10 == 0) goto L_0x0031;
    L_0x0045:
        r11 = r10.length;
        r3 = 0;
    L_0x0047:
        if (r3 >= r11) goto L_0x0031;
    L_0x0049:
        r12 = r10[r3];
        r13 = r12.getName();
        if (r19 >= 0) goto L_0x0066;
    L_0x0051:
        r14 = r13.startsWith(r2);	 Catch:{ SecurityException -> 0x005f }
        if (r14 == 0) goto L_0x005a;
    L_0x0057:
        r12.delete();	 Catch:{ SecurityException -> 0x0063 }
    L_0x005a:
        r3 = r3 + 1;
        if (r4 == 0) goto L_0x0047;
    L_0x005e:
        goto L_0x0031;
    L_0x005f:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x0061 }
    L_0x0061:
        r2 = move-exception;
        throw r2;
    L_0x0063:
        r14 = move-exception;
        if (r4 == 0) goto L_0x005a;
    L_0x0066:
        r14 = r13.startsWith(r9);	 Catch:{ SecurityException -> 0x00af }
        if (r14 == 0) goto L_0x005a;
    L_0x006c:
        r14 = r13.endsWith(r8);	 Catch:{ SecurityException -> 0x00b1 }
        if (r14 == 0) goto L_0x005a;
    L_0x0072:
        r14 = r9.length();
        r15 = r7.length();
        r14 = r14 + r15;
        r15 = r13.length();	 Catch:{ SecurityException -> 0x00b3 }
        if (r14 <= r15) goto L_0x0083;
    L_0x0081:
        if (r4 == 0) goto L_0x005a;
    L_0x0083:
        r15 = r9.length();
        r13 = r13.substring(r15, r14);
        r13 = r5.parse(r13);	 Catch:{ ParseException -> 0x00ad, SecurityException -> 0x00b5 }
        r14 = r6.getTime();	 Catch:{ ParseException -> 0x00ad, SecurityException -> 0x00b5 }
        r16 = r13.getTime();	 Catch:{ ParseException -> 0x00ad, SecurityException -> 0x00b5 }
        r14 = r14 - r16;
        r16 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r14 = r14 / r16;
        r0 = r19;
        r0 = (long) r0;
        r16 = r0;
        r13 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1));
        if (r13 <= 0) goto L_0x005a;
    L_0x00a7:
        r12.delete();	 Catch:{ SecurityException -> 0x00ab, ParseException -> 0x00ad }
        goto L_0x005a;
    L_0x00ab:
        r12 = move-exception;
        throw r12;	 Catch:{ ParseException -> 0x00ad, SecurityException -> 0x00b5 }
    L_0x00ad:
        r12 = move-exception;
        goto L_0x005a;
    L_0x00af:
        r2 = move-exception;
        throw r2;	 Catch:{ SecurityException -> 0x00b1 }
    L_0x00b1:
        r2 = move-exception;
        throw r2;
    L_0x00b3:
        r2 = move-exception;
        throw r2;
    L_0x00b5:
        r12 = move-exception;
        goto L_0x005a;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.at.b(java.io.File, int, java.lang.String):void");
    }

    private static String a(String str, String str2) {
        return str.substring(str.indexOf(46)) + str2;
    }

    private static SimpleDateFormat a() {
        return new SimpleDateFormat(z[0], Locale.US);
    }

    public static boolean a(File file, String str) {
        boolean z = false;
        if (file.exists()) {
            try {
                z = file.renameTo(new File(file.getParentFile(), a(file, new Date(), str)));
            } catch (SecurityException e) {
            }
        }
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList a(java.io.File r20, int r21, java.lang.String[] r22) {
        /*
        r5 = com.whatsapp.util.Log.e;
        r6 = a();
        r7 = new java.util.ArrayList;
        r7.<init>();
        r8 = new java.util.Date;
        r8.<init>();
        r9 = r6.toPattern();
        r2 = r20.getName();
        r10 = b(r2);
        r2 = r20.getName();
        r3 = "";
        r11 = a(r2, r3);
        r0 = r22;
        r2 = r0.length;
        r12 = new java.lang.String[r2];
        r2 = 0;
    L_0x002c:
        r3 = r12.length;
        if (r2 >= r3) goto L_0x003f;
    L_0x002f:
        r3 = r20.getName();
        r4 = r22[r2];
        r3 = a(r3, r4);
        r12[r2] = r3;
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x002c;
    L_0x003f:
        r2 = r20.getParentFile();
        r13 = r2.listFiles();
        if (r13 == 0) goto L_0x00c3;
    L_0x0049:
        r14 = r13.length;
        r2 = 0;
        r4 = r2;
    L_0x004c:
        if (r4 >= r14) goto L_0x00c3;
    L_0x004e:
        r15 = r13[r4];
        r16 = r15.getName();
        r0 = r16;
        r2 = r0.startsWith(r10);	 Catch:{ ParseException -> 0x0119 }
        if (r2 != 0) goto L_0x005e;
    L_0x005c:
        if (r5 == 0) goto L_0x00bf;
    L_0x005e:
        r0 = r16;
        r3 = r0.endsWith(r11);
        r0 = r12.length;
        r17 = r0;
        r2 = 0;
        r19 = r2;
        r2 = r3;
        r3 = r19;
    L_0x006d:
        r0 = r17;
        if (r3 >= r0) goto L_0x0088;
    L_0x0071:
        r18 = r12[r3];
        if (r2 == 0) goto L_0x0077;
    L_0x0075:
        if (r5 == 0) goto L_0x0088;
    L_0x0077:
        if (r2 != 0) goto L_0x0083;
    L_0x0079:
        r0 = r16;
        r1 = r18;
        r2 = r0.endsWith(r1);	 Catch:{ ParseException -> 0x011b }
        if (r2 == 0) goto L_0x011f;
    L_0x0083:
        r2 = 1;
    L_0x0084:
        r3 = r3 + 1;
        if (r5 == 0) goto L_0x006d;
    L_0x0088:
        if (r2 == 0) goto L_0x00bf;
    L_0x008a:
        r2 = r10.length();
        r3 = r10.length();
        r17 = r9.length();
        r3 = r3 + r17;
        r0 = r16;
        r2 = r0.substring(r2, r3);
        r2 = r6.parse(r2);	 Catch:{ ParseException -> 0x0124 }
        r16 = r8.getTime();	 Catch:{ ParseException -> 0x0124 }
        r2 = r2.getTime();	 Catch:{ ParseException -> 0x0124 }
        r2 = r16 - r2;
        r16 = 86400000; // 0x5265c00 float:7.82218E-36 double:4.2687272E-316;
        r2 = r2 / r16;
        if (r21 < 0) goto L_0x00bc;
    L_0x00b3:
        r0 = r21;
        r0 = (long) r0;
        r16 = r0;
        r2 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1));
        if (r2 >= 0) goto L_0x00bf;
    L_0x00bc:
        r7.add(r15);	 Catch:{ ParseException -> 0x0122 }
    L_0x00bf:
        r2 = r4 + 1;
        if (r5 == 0) goto L_0x012e;
    L_0x00c3:
        if (r21 >= 0) goto L_0x00cb;
    L_0x00c5:
        r2 = r20.exists();	 Catch:{ ParseException -> 0x0126 }
        if (r2 != 0) goto L_0x00d1;
    L_0x00cb:
        r2 = a(r20, r21);	 Catch:{ ParseException -> 0x0128 }
        if (r2 == 0) goto L_0x00d6;
    L_0x00d1:
        r0 = r20;
        r7.add(r0);	 Catch:{ ParseException -> 0x0128 }
    L_0x00d6:
        r0 = r22;
        r3 = r0.length;
        r2 = 0;
    L_0x00da:
        if (r2 >= r3) goto L_0x010f;
    L_0x00dc:
        r4 = r22[r2];
        r6 = new java.io.File;
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r9 = r20.getPath();
        r8 = r8.append(r9);
        r4 = r8.append(r4);
        r4 = r4.toString();
        r6.<init>(r4);
        if (r21 >= 0) goto L_0x0100;
    L_0x00fa:
        r4 = r6.exists();	 Catch:{ ParseException -> 0x012a }
        if (r4 != 0) goto L_0x0108;
    L_0x0100:
        r0 = r21;
        r4 = a(r6, r0);	 Catch:{ ParseException -> 0x012c }
        if (r4 == 0) goto L_0x010b;
    L_0x0108:
        r7.add(r6);	 Catch:{ ParseException -> 0x012c }
    L_0x010b:
        r2 = r2 + 1;
        if (r5 == 0) goto L_0x00da;
    L_0x010f:
        r2 = new com.whatsapp.util.bs;
        r3 = 0;
        r2.<init>(r3);
        java.util.Collections.sort(r7, r2);
        return r7;
    L_0x0119:
        r2 = move-exception;
        throw r2;
    L_0x011b:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x011d }
    L_0x011d:
        r2 = move-exception;
        throw r2;
    L_0x011f:
        r2 = 0;
        goto L_0x0084;
    L_0x0122:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x0124 }
    L_0x0124:
        r2 = move-exception;
        goto L_0x00bf;
    L_0x0126:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x0128 }
    L_0x0128:
        r2 = move-exception;
        throw r2;
    L_0x012a:
        r2 = move-exception;
        throw r2;	 Catch:{ ParseException -> 0x012c }
    L_0x012c:
        r2 = move-exception;
        throw r2;
    L_0x012e:
        r4 = r2;
        goto L_0x004c;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.at.a(java.io.File, int, java.lang.String[]):java.util.ArrayList");
    }
}
