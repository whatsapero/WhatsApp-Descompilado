package com.googlecode.mp4parser.srt;

public class SrtParser {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.googlecode.mp4parser.authoring.tracks.TextTrackImpl parse(java.io.InputStream r11_is) throws java.io.IOException {
        /*
        r0 = new java.io.LineNumberReader;
        r1 = new java.io.InputStreamReader;
        r10 = "UTF-8";
        r1.<init>(r11, r10);
        r0.<init>(r1);
        r9 = new com.googlecode.mp4parser.authoring.tracks.TextTrackImpl;
        r9.<init>();
    L_0x0011:
        r1 = r0.readLine();
        if (r1 != 0) goto L_0x0018;
    L_0x0017:
        return r9;
    L_0x0018:
        r8 = r0.readLine();
        r6 = "";
    L_0x001e:
        r7 = r0.readLine();
        if (r7 == 0) goto L_0x0030;
    L_0x0024:
        r1 = r7.trim();
        r10 = "";
        r1 = r1.equals(r10);
        if (r1 == 0) goto L_0x0057;
    L_0x0030:
        r1 = "-->";
        r1 = r8.split(r1);
        r10 = 0;
        r1 = r1[r10];
        r2 = parse(r1);
        r1 = "-->";
        r1 = r8.split(r1);
        r10 = 1;
        r1 = r1[r10];
        r4 = parse(r1);
        r10 = r9.getSubs();
        r1 = new com.googlecode.mp4parser.authoring.tracks.TextTrackImpl$Line;
        r1.<init>(r2, r4, r6);
        r10.add(r1);
        goto L_0x0011;
    L_0x0057:
        r1 = new java.lang.StringBuilder;
        r10 = java.lang.String.valueOf(r6);
        r1.<init>(r10);
        r1 = r1.append(r7);
        r10 = "\n";
        r1 = r1.append(r10);
        r6 = r1.toString();
        goto L_0x001e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.googlecode.mp4parser.srt.SrtParser.parse(java.io.InputStream):com.googlecode.mp4parser.authoring.tracks.TextTrackImpl");
    }

    private static long parse(String in) {
        long hours = Long.parseLong(in.split(":")[0].trim());
        long minutes = Long.parseLong(in.split(":")[1].trim());
        long seconds = Long.parseLong(in.split(":")[2].split(",")[0].trim());
        return (((((60 * hours) * 60) * 1000) + ((60 * minutes) * 1000)) + (1000 * seconds)) + Long.parseLong(in.split(":")[2].split(",")[1].trim());
    }
}
