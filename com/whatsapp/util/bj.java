package com.whatsapp.util;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.io.File;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

public class bj {
    private static final String[] z;
    private int a;
    private int b;
    private File c;
    private int d;
    private int e;
    private long f;

    static {
        String[] strArr = new String[10];
        String str = ".a";
        Object obj = -1;
        String[] strArr2 = strArr;
        String[] strArr3 = strArr;
        int i = 0;
        while (true) {
            char[] toCharArray = str.toCharArray();
            int length = toCharArray.length;
            char[] cArr = toCharArray;
            for (int i2 = 0; length > i2; i2++) {
                int i3;
                char c = cArr[i2];
                switch (i2 % 5) {
                    case PBE.MD5 /*0*/:
                        i3 = 7;
                        break;
                    case ay.f /*1*/:
                        i3 = 65;
                        break;
                    case ay.n /*2*/:
                        i3 = 18;
                        break;
                    case ay.p /*3*/:
                        i3 = 118;
                        break;
                    default:
                        i3 = 96;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = ".a";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    str = "q(v\u0013\u000fj$f\u0017Oi.2\u0012\u0015u f\u001f\u000fi{";
                    i = 3;
                    strArr2 = strArr3;
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    i = 4;
                    strArr2 = strArr3;
                    str = "q(v\u0013\u000fj$f\u0017Oe vV\u0017n%f\u001e@/";
                    obj = 3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    str = "q(v\u0013\u000fj$f\u0017Od |\u0018\u000fsau\u0013\u0014''`\u0017\rb";
                    obj = 4;
                    strArr2 = strArr3;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = ".a}\u0004@o${\u0011\bsa:";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    str = "q(v\u0013\u000fj$f\u0017Od |\u0018\u000fsab\u0004\u000fd$a\u0005@a(~\u0013Z";
                    obj = 6;
                    i = 7;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    strArr2 = strArr3;
                    str = "q(v\u0013\u000fj$f\u0017Od |\u0018\u000fsab\u0017\u0012t$2\u0012\u0015u f\u001f\u000fi{";
                    obj = 7;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "q(v\u0013\u000fj$f\u0017Od |\u0018\u000fsab\u0017\u0012t$2\u0001\tc5zVH";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    z = strArr3;
                default:
                    strArr2[i] = str;
                    str = ".a}\u0004@o${\u0011\bsa:";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }

    public int e() {
        return this.b;
    }

    public bj(File file) {
        this.c = file;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            String extractMetadata2 = mediaMetadataRetriever.extractMetadata(18);
            String extractMetadata3 = mediaMetadataRetriever.extractMetadata(19);
            try {
                this.f = Long.parseLong(extractMetadata);
                if (this.f == 0) {
                    Log.e(z[3] + extractMetadata + " " + this.c.getAbsolutePath() + " " + this.c.length());
                    mediaMetadataRetriever.release();
                    throw new a6();
                }
                try {
                    this.b = Integer.parseInt(extractMetadata2);
                    this.e = Integer.parseInt(extractMetadata3);
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    Log.w(z[9] + extractMetadata2 + z[6] + extractMetadata3 + z[0] + this.c.getAbsolutePath() + " " + this.c.length());
                    Bitmap bitmap = null;
                    try {
                        bitmap = mediaMetadataRetriever.getFrameAtTime(0);
                    } catch (Exception e3) {
                    } catch (NoSuchMethodError e4) {
                    }
                    if (bitmap != null) {
                        this.b = bitmap.getWidth();
                        this.e = bitmap.getHeight();
                        if (Log.e == 0) {
                            try {
                                if (this.b == 0 || this.e == 0) {
                                    Log.e(z[4] + extractMetadata2 + z[1] + extractMetadata3 + z[2] + this.c.getAbsolutePath() + " " + this.c.length());
                                    mediaMetadataRetriever.release();
                                    throw new a6();
                                }
                            } catch (Exception e5) {
                                throw e5;
                            }
                        }
                    }
                    Log.e(z[5] + this.c.getAbsolutePath() + " " + this.c.length());
                    throw new a6();
                } catch (Exception e52) {
                    throw e52;
                }
                try {
                    this.a = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
                } catch (Exception e6) {
                }
                try {
                    this.d = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
                } catch (Exception e7) {
                }
                mediaMetadataRetriever.release();
            } catch (Exception e8) {
                Log.e(z[8] + extractMetadata + " " + this.c.getAbsolutePath() + " " + this.c.length());
                mediaMetadataRetriever.release();
                throw new a6();
            }
        } catch (Exception e9) {
            Log.e(z[7] + this.c.getAbsolutePath() + " " + this.c.length() + " " + this.c.exists());
            mediaMetadataRetriever.release();
            throw new a6();
        }
    }

    public int d() {
        return this.e;
    }

    public boolean f() {
        int i;
        int i2 = 640;
        int i3 = Log.e;
        if (this.b <= 640 && this.e <= 640) {
            int i4 = this.b;
            i = this.e;
            if (i3 == 0) {
                i2 = i4;
                return ((double) (((((long) ((i * i2) * 3)) * (this.f / 1000)) / 8) + ((96000 * (this.f / 1000)) / 8))) < ((double) this.c.length()) * 1.5d;
            }
        }
        if (this.b < this.e) {
            i = (this.b * 640) / this.e;
            if (i3 == 0) {
                i2 = i;
                i = 640;
                if (((double) (((((long) ((i * i2) * 3)) * (this.f / 1000)) / 8) + ((96000 * (this.f / 1000)) / 8))) < ((double) this.c.length()) * 1.5d) {
                }
            }
        }
        i = (this.e * 640) / this.b;
        if (((double) (((((long) ((i * i2) * 3)) * (this.f / 1000)) / 8) + ((96000 * (this.f / 1000)) / 8))) < ((double) this.c.length()) * 1.5d) {
        }
    }

    public int b() {
        return this.a;
    }

    public long c() {
        return this.f;
    }

    public int a() {
        return this.d;
    }
}
