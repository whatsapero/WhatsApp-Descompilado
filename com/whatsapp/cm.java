package com.whatsapp;

import android.location.Address;
import android.location.Geocoder;
import java.util.List;
import java.util.Locale;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

class cm implements Runnable {
    private static final String z;
    double a;
    double b;
    final LocationPicker2 c;

    static {
        char[] toCharArray = "RL".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 126;
                    break;
                case ay.f /*1*/:
                    i2 = 108;
                    break;
                case ay.n /*2*/:
                    i2 = 92;
                    break;
                case ay.p /*3*/:
                    i2 = 106;
                    break;
                default:
                    i2 = 9;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    cm(LocationPicker2 locationPicker2, double d, double d2) {
        this.c = locationPicker2;
        this.a = d;
        this.b = d2;
    }

    public void run() {
        int i = App.az;
        try {
            List fromLocation = new Geocoder(App.p, Locale.getDefault()).getFromLocation(this.a, this.b, 1);
            if (fromLocation != null) {
                if (!fromLocation.isEmpty()) {
                    Address address = (Address) fromLocation.get(0);
                    StringBuilder stringBuilder = new StringBuilder();
                    int i2 = 0;
                    do {
                        if (i2 >= address.getMaxAddressLineIndex()) {
                            break;
                        }
                        if (i2 != 0) {
                            stringBuilder.append(z);
                        }
                        stringBuilder.append(address.getAddressLine(i2));
                        i2++;
                        break;
                    } while (i == 0);
                    break;
                    this.c.runOnUiThread(new cj(this, address, stringBuilder));
                    if (i == 0) {
                        return;
                    }
                }
            }
            this.c.runOnUiThread(new yk(this));
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            throw e2;
        } catch (Exception e22) {
            throw e22;
        } catch (Exception e3) {
            this.c.runOnUiThread(new a_z(this));
        }
    }
}
