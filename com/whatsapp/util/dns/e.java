package com.whatsapp.util.dns;

import com.whatsapp.util.Log;
import com.whatsapp.vk;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.a6;
import org.whispersystems.libaxolotl.a8;
import org.whispersystems.libaxolotl.aV;
import org.whispersystems.libaxolotl.aj;
import org.whispersystems.libaxolotl.ay;

class e {
    private static final InetSocketAddress a;
    private static final InetSocketAddress b;
    private static final String[] z;

    static g[] a(String str, int i) {
        boolean z = b.c;
        c a = c.a(str);
        byte[] b = a.b();
        byte[] bArr = new byte[512];
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length);
        try {
            DatagramSocket datagramSocket = new DatagramSocket();
            try {
                Log.i(z[1] + b + z[17] + str + z[9] + i + z[6]);
                datagramSocket.connect(b);
                datagramSocket.setSoTimeout(i / 2);
                datagramSocket.send(new DatagramPacket(b, b.length));
                datagramSocket.receive(datagramPacket);
            } catch (InterruptedIOException e) {
                Log.i(z[25] + b + z[24] + str);
                datagramSocket.disconnect();
                Log.i(z[22] + a + z[13] + str + z[26] + i + z[4]);
                datagramSocket.connect(a);
                datagramSocket.setSoTimeout(i / 2);
                datagramSocket.send(new DatagramPacket(b, b.length));
                datagramSocket.receive(datagramPacket);
            }
            c a2 = c.a(bArr);
            if (a2 == null) {
                try {
                    throw new UnknownHostException(z[15] + str);
                } catch (InterruptedIOException e2) {
                    throw e2;
                }
            }
            try {
                if (a2.a().c() != a.a().c()) {
                    throw new UnknownHostException(z[10] + str);
                }
                try {
                    if (a2.a().f()) {
                        try {
                            if (a2.a().b()) {
                                throw new UnknownHostException(z[16] + str);
                            }
                            try {
                                if (a2.a().g() != (short) 0) {
                                    throw new UnknownHostException(z[14] + str);
                                }
                                try {
                                    if (a2.c().length == 0) {
                                        throw new UnknownHostException(z[0] + str);
                                    }
                                    long currentTimeMillis = System.currentTimeMillis();
                                    g[] gVarArr = new g[a2.c().length];
                                    int i2 = 0;
                                    while (i2 < a2.c().length) {
                                        i iVar = a2.c()[i2];
                                        try {
                                            if (iVar.g() != (short) 1) {
                                                throw new UnknownHostException(z[21] + str);
                                            }
                                            try {
                                                if (iVar.a() != (short) 1) {
                                                    throw new UnknownHostException(z[3] + str);
                                                }
                                                try {
                                                    if (iVar.d() == (short) 4) {
                                                        gVarArr[i2] = new g(InetAddress.getByAddress(a2.a(iVar.c()), iVar.f()), (((long) iVar.e()) * 1000) + currentTimeMillis);
                                                        i2++;
                                                        if (z) {
                                                            break;
                                                        }
                                                    }
                                                    throw new UnknownHostException(z[19] + str);
                                                } catch (InterruptedIOException e22) {
                                                    throw e22;
                                                }
                                            } catch (InterruptedIOException e222) {
                                                throw e222;
                                            }
                                        } catch (InterruptedIOException e2222) {
                                            throw e2222;
                                        }
                                    }
                                    Log.i(z[11] + gVarArr.length + z[12] + str);
                                    return gVarArr;
                                } catch (InterruptedIOException e22222) {
                                    throw e22222;
                                }
                            } catch (InterruptedIOException e222222) {
                                throw e222222;
                            }
                        } catch (InterruptedIOException e2222222) {
                            throw e2222222;
                        }
                    }
                    throw new UnknownHostException(z[8] + str);
                } catch (InterruptedIOException e22222222) {
                    throw e22222222;
                }
            } catch (InterruptedIOException e222222222) {
                throw e222222222;
            }
        } catch (InterruptedIOException e3) {
            Log.i(z[5] + a + z[23] + str);
            throw new UnknownHostException(z[2] + str);
        } catch (IOException e4) {
            Log.w(z[18] + e4 + z[20] + str);
            throw new UnknownHostException(z[7] + str);
        }
    }

    static {
        String[] strArr = new String[27];
        String str = "q%Ay\u0000l=\u0004j\u001d?8\u0004{\u000bv<\u0004|Nh\"\bt\u000b?>\u0013a\u0007q-Al\u0001?8\u0004k\u0001s<\u00048";
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
                        i3 = 31;
                        break;
                    case ay.f /*1*/:
                        i3 = 74;
                        break;
                    case ay.n /*2*/:
                        i3 = 97;
                        break;
                    case ay.p /*3*/:
                        i3 = 24;
                        break;
                    default:
                        i3 = 110;
                        break;
                }
                cArr[i2] = (char) (i3 ^ c);
            }
            str = new String(cArr).intern();
            switch (obj) {
                case PBE.MD5 /*0*/:
                    strArr2[i] = str;
                    str = "k#\f}\u0001j>Ao\u0006v&\u00048\u001am3\bv\t?>\u000e8\u001cz9\u000et\u0018zj";
                    i = 2;
                    strArr2 = strArr3;
                    obj = 1;
                    break;
                case ay.f /*1*/:
                    strArr2[i] = str;
                    i = 3;
                    strArr2 = strArr3;
                    str = "j$\u0004`\u001ez)\u0015}\n?>\u0018h\u000b?8\u0004l\u001bm$\u0004|Nh\"\bt\u000b?>\u0013a\u0007q-Al\u0001?8\u0004k\u0001s<\u00048";
                    obj = 2;
                    break;
                case ay.n /*2*/:
                    strArr2[i] = str;
                    str = "?'\u00128\u001av'\u0004w\u001bk";
                    obj = 3;
                    i = 4;
                    strArr2 = strArr3;
                    break;
                case ay.p /*3*/:
                    strArr2[i] = str;
                    i = 5;
                    strArr2 = strArr3;
                    str = "k#\f}\n?%\u0014lNh\"\bt\u000b?;\u0014}\u001cf#\u000f\u007fN";
                    obj = 4;
                    break;
                case aj.i /*4*/:
                    strArr2[i] = str;
                    i = 6;
                    str = "?'\u00128\u001av'\u0004w\u001bk";
                    obj = 5;
                    strArr2 = strArr3;
                    break;
                case aV.r /*5*/:
                    strArr2[i] = str;
                    i = 7;
                    str = "v%\u0004`\rz:\u0015q\u0001qj\u0016p\u0007s/Al\u001cf#\u000f\u007fNk%Aj\u000bl%\rn\u000b?";
                    obj = 6;
                    strArr2 = strArr3;
                    break;
                case aV.i /*6*/:
                    strArr2[i] = str;
                    i = 8;
                    str = "{#\u00058\u0000p>Aj\u000b|/\bn\u000b?8\u0004k\u001ep$\u0012}Ny8\u000euNl/\u0013n\u000bmj\u0016p\u0007s/Al\u001cf#\u000f\u007fNk%Aj\u000bl%\rn\u000b?";
                    obj = 7;
                    strArr2 = strArr3;
                    break;
                case a8.s /*7*/:
                    strArr2[i] = str;
                    i = 9;
                    str = "?=\bl\u0006?";
                    obj = 8;
                    strArr2 = strArr3;
                    break;
                case a8.n /*8*/:
                    strArr2[i] = str;
                    i = 10;
                    str = "m/\u0002}\u0007i/\u00058\u001cz9\u0011w\u0000l/Ao\u0007k\"Am\u0000z2\u0011}\rk/\u00058\u0007{j\u0016p\u0007s/Al\u001cf#\u000f\u007fNk%Aj\u000bl%\rn\u000b?";
                    obj = 9;
                    strArr2 = strArr3;
                    break;
                case a6.D /*9*/:
                    strArr2[i] = str;
                    i = 11;
                    str = "m/\u0012w\u0002i/\u00058";
                    obj = 10;
                    strArr2 = strArr3;
                    break;
                case a6.h /*10*/:
                    strArr2[i] = str;
                    i = 12;
                    str = "?+\u0005|\u001cz9\u0012}\u001d??\u0012q\u0000xj\u0003y\rt?\u00118*Q\u0019A~\u0001mj";
                    obj = 11;
                    strArr2 = strArr3;
                    break;
                case a6.e /*11*/:
                    strArr2[i] = str;
                    i = 13;
                    str = "?,\u000ejN";
                    obj = 12;
                    strArr2 = strArr3;
                    break;
                case a6.s /*12*/:
                    strArr2[i] = str;
                    i = 14;
                    str = "z8\u0013w\u001c?)\u000e|\u000b?=\u0000kNl/\u00158\u0007qj\u0013}\u001do%\u000fk\u000b?=\tq\u0002zj\u0015j\u0017v$\u00068\u001apj\u0013}\u001dp&\u0017}N";
                    obj = 13;
                    strArr2 = strArr3;
                    break;
                case a6.z /*13*/:
                    strArr2[i] = str;
                    i = 15;
                    str = "z8\u0013w\u001c?:\u0000j\u001dv$\u00068\u001cz9\u0011w\u0000l/Ao\u0006v&\u00048\u001am3\bv\t?>\u000e8\u001cz9\u000et\u0018zj";
                    obj = 14;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseButtonStyle /*14*/:
                    strArr2[i] = str;
                    i = 16;
                    str = "m/\u0002}\u0007i/\u00058\u001am?\u000f{\u000fk/\u00058\u001cz9\u0011w\u0000l/Ao\u0006v&\u00048\u001am3\bv\t?>\u000e8\u001cz9\u000et\u0018zj";
                    obj = 15;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeBackground /*15*/:
                    strArr2[i] = str;
                    i = 17;
                    str = "?,\u000ejN";
                    obj = 16;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeSplitBackground /*16*/:
                    strArr2[i] = str;
                    i = 18;
                    str = "j$\u0004`\u001ez)\u0015}\n?\u0003.]\u0016|/\u0011l\u0007p$A";
                    obj = 17;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeCloseDrawable /*17*/:
                    strArr2[i] = str;
                    i = 19;
                    str = "j$\u0004`\u001ez)\u0015}\n?8\u0004{\u0001m.At\u000bq-\u0015pNm/\u0015m\u001cq/\u00058\u0019w#\r}Nk8\u0018q\u0000xj\u0015wNm/\u0012w\u0002i/A";
                    obj = 18;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModeShareDrawable /*18*/:
                    strArr2[i] = str;
                    i = 20;
                    str = "?=\tq\u0002zj\u0015j\u0017v$\u00068\u001apj\u0013}\u001dp&\u0017}N";
                    obj = 19;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_actionModePopupWindowStyle /*19*/:
                    strArr2[i] = str;
                    i = 21;
                    str = "j$\u0004`\u001ez)\u0015}\n?)\ry\u001dlj\u0013}\u001aj8\u000f}\n?=\tq\u0002zj\u0015j\u0017v$\u00068\u001apj\u0013}\u001dp&\u0017}N";
                    obj = 20;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_buttonStyleSmall /*20*/:
                    strArr2[i] = str;
                    i = 22;
                    str = "n?\u0004j\u0017v$\u00068";
                    obj = 21;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_selectableItemBackground /*21*/:
                    strArr2[i] = str;
                    i = 23;
                    str = "?,\u000ejN";
                    obj = 22;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_windowContentOverlay /*22*/:
                    strArr2[i] = str;
                    str = "?,\u000ejN";
                    obj = 23;
                    i = 24;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceLargePopupMenu /*23*/:
                    strArr2[i] = str;
                    i = 25;
                    strArr2 = strArr3;
                    str = "k#\f}\n?%\u0014lNh\"\bt\u000b?;\u0014}\u001cf#\u000f\u007fN";
                    obj = 24;
                    break;
                case vk.SherlockTheme_textAppearanceSmallPopupMenu /*24*/:
                    strArr2[i] = str;
                    i = 26;
                    str = "?=\bl\u0006?";
                    obj = 25;
                    strArr2 = strArr3;
                    break;
                case vk.SherlockTheme_textAppearanceSmall /*25*/:
                    strArr2[i] = str;
                    z = strArr3;
                    try {
                        b = new InetSocketAddress(InetAddress.getByAddress(new byte[]{(byte) 8, (byte) 8, (byte) 8, (byte) 8}), 53);
                        a = new InetSocketAddress(InetAddress.getByAddress(new byte[]{(byte) 8, (byte) 8, (byte) 4, (byte) 4}), 53);
                    } catch (Throwable e) {
                        throw new Error(e);
                    }
                default:
                    strArr2[i] = str;
                    str = "n?\u0004j\u0017v$\u00068";
                    i = 1;
                    strArr2 = strArr3;
                    obj = null;
                    break;
            }
        }
    }
}
