package com.whatsapp;

import com.whatsapp.protocol.b;
import com.whatsapp.protocol.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class av4 {
    private static final HashMap a;
    public String b;
    public m c;
    public String[] d;

    static {
        a = new HashMap();
    }

    public static void a(m mVar) {
        synchronized (a) {
            cu cuVar = (cu) a.get(mVar.c);
            if (cuVar != null) {
                cuVar.b.remove(mVar.a);
                if (cuVar.b.isEmpty()) {
                    App.aJ.a(mVar.c, cuVar.a);
                    a.remove(mVar.c);
                }
            }
        }
    }

    public static void a(b bVar) {
        Collection arrayList = new ArrayList();
        arrayList.add(new h1(bVar, App.aJ.e(bVar)));
        a(arrayList);
    }

    public static void a(Collection collection) {
        int i = App.az;
        HashMap hashMap = new HashMap();
        for (h1 h1Var : collection) {
            b bVar = h1Var.a;
            afd com_whatsapp_afd = new afd(bVar.e.c, bVar.F);
            ArrayList arrayList = (ArrayList) hashMap.get(com_whatsapp_afd);
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put(com_whatsapp_afd, arrayList);
            }
            arrayList.add(h1Var);
            if (i != 0) {
                break;
            }
        }
        synchronized (a) {
            for (ArrayList arrayList2 : hashMap.values()) {
                av4 com_whatsapp_av4 = new av4();
                b bVar2 = ((h1) arrayList2.get(0)).a;
                com_whatsapp_av4.c = bVar2.e;
                com_whatsapp_av4.b = bVar2.F;
                long j = ((h1) arrayList2.get(0)).b;
                if (arrayList2.size() > 1) {
                    com_whatsapp_av4.d = new String[(arrayList2.size() - 1)];
                    int i2 = 1;
                    while (i2 < arrayList2.size()) {
                        com_whatsapp_av4.d[i2 - 1] = ((h1) arrayList2.get(i2)).a.e.a;
                        j = Math.max(j, ((h1) arrayList2.get(i2)).b);
                        int i3 = i2 + 1;
                        if (i != 0) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                cu cuVar = (cu) a.get(bVar2.e.c);
                if (cuVar == null) {
                    cuVar = new cu();
                    a.put(bVar2.e.c, cuVar);
                }
                cuVar.b.put(bVar2.e.a, com_whatsapp_av4);
                cuVar.a = Math.max(cuVar.a, j);
                App.a(com_whatsapp_av4);
                if (i != 0) {
                    break;
                }
            }
        }
    }
}
