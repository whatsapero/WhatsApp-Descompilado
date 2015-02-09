package com.whatsapp;

import android.backport.util.Base64;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.actionbarsherlock.R;
import com.whatsapp.protocol.b;
import com.whatsapp.util.Log;
import com.whatsapp.util.a5;
import com.whatsapp.util.b0;
import com.whatsapp.util.bd;
import defpackage.o;
import java.io.UnsupportedEncodingException;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public class ConversationRowContact extends ConversationRow {
    private static final String N;
    private final ImageView J;
    private final Button K;
    private final TextView L;
    private final ImageView M;

    static {
        char[] toCharArray = "_d\u0018R{Nx\u0017PwSe[VqK&\u0015KpHj\u0015P1_d\u0018P\u007f_\u007f[PvIf\u0014\u000b|]x\u0013\u0012*\u0011o\u0013GqXnYAlNd\u0004".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 60;
                    break;
                case ay.f /*1*/:
                    i2 = 11;
                    break;
                case ay.n /*2*/:
                    i2 = 118;
                    break;
                case ay.p /*3*/:
                    i2 = 36;
                    break;
                default:
                    i2 = 30;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        N = new String(cArr).intern();
    }

    protected int l() {
        return R.layout.conversation_contact_row_right;
    }

    private void b(b bVar) {
        o a;
        Throwable e;
        ImageView imageView;
        Bitmap bitmap = null;
        this.L.setText(a5.b(bVar.H, getContext(), this.L.getPaint()));
        try {
            a = o.a(bVar.f());
        } catch (Throwable e2) {
            Log.b(e2);
            a = null;
        } catch (Throwable e22) {
            Log.c(e22);
            a = null;
        } catch (Throwable e222) {
            Log.b(e222);
            a = null;
        }
        if (a != null) {
            try {
                if (a.f != null) {
                    if (a.f.length > 0) {
                        try {
                            byte[] decode = Base64.decode(a.f, 0);
                            bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                        } catch (ArrayIndexOutOfBoundsException e3) {
                            e222 = e3;
                            Log.b(N, e222);
                            try {
                                if (bitmap != null) {
                                    this.J.setImageDrawable(new ex(getContext(), b0.e(getContext()), bVar.e.b));
                                    imageView = (ImageView) findViewById(R.id.picture);
                                    imageView.setImageBitmap(bitmap);
                                    imageView.setVisibility(0);
                                    if (App.az == 0) {
                                        return;
                                    }
                                }
                                this.J.setImageDrawable(new ex(getContext(), b0.b(getContext()), bVar.e.b));
                                this.M.setVisibility(8);
                            } catch (UnsupportedEncodingException e4) {
                                throw e4;
                            }
                        } catch (StringIndexOutOfBoundsException e5) {
                            e222 = e5;
                            Log.b(N, e222);
                            if (bitmap != null) {
                                this.J.setImageDrawable(new ex(getContext(), b0.e(getContext()), bVar.e.b));
                                imageView = (ImageView) findViewById(R.id.picture);
                                imageView.setImageBitmap(bitmap);
                                imageView.setVisibility(0);
                                if (App.az == 0) {
                                    return;
                                }
                            }
                            this.J.setImageDrawable(new ex(getContext(), b0.b(getContext()), bVar.e.b));
                            this.M.setVisibility(8);
                        } catch (IllegalArgumentException e6) {
                            e222 = e6;
                            Log.b(N, e222);
                            if (bitmap != null) {
                                this.J.setImageDrawable(new ex(getContext(), b0.e(getContext()), bVar.e.b));
                                imageView = (ImageView) findViewById(R.id.picture);
                                imageView.setImageBitmap(bitmap);
                                imageView.setVisibility(0);
                                if (App.az == 0) {
                                    return;
                                }
                            }
                            this.J.setImageDrawable(new ex(getContext(), b0.b(getContext()), bVar.e.b));
                            this.M.setVisibility(8);
                        }
                    }
                }
            } catch (UnsupportedEncodingException e42) {
                throw e42;
            } catch (UnsupportedEncodingException e422) {
                throw e422;
            }
        }
        if (bitmap != null) {
            this.J.setImageDrawable(new ex(getContext(), b0.e(getContext()), bVar.e.b));
            imageView = (ImageView) findViewById(R.id.picture);
            imageView.setImageBitmap(bitmap);
            imageView.setVisibility(0);
            if (App.az == 0) {
                return;
            }
        }
        this.J.setImageDrawable(new ex(getContext(), b0.b(getContext()), bVar.e.b));
        this.M.setVisibility(8);
    }

    protected int d() {
        return R.layout.conversation_contact_row_left;
    }

    ConversationRowContact(Context context, b bVar) {
        super(context, bVar);
        this.L = (TextView) findViewById(R.id.vcard_btn);
        this.K = (Button) findViewById(R.id.thumb_button);
        this.J = (ImageView) findViewById(R.id.thumb);
        this.M = (ImageView) findViewById(R.id.picture);
        this.K.setBackgroundDrawable(new bd(context.getResources().getDrawable(bVar.e.b ? R.drawable.media_overlay_outgoing : R.drawable.media_overlay_incoming)));
        OnClickListener qgVar = new qg(this, null);
        this.L.setOnClickListener(qgVar);
        this.K.setOnClickListener(qgVar);
        b(bVar);
    }

    public void a(b bVar, boolean z) {
        try {
            if (this.w != bVar || z) {
                b(bVar);
            }
            super.a(bVar, z);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw e2;
        }
    }
}
