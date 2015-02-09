package com.whatsapp.fieldstats;

import android.content.Context;
import com.whatsapp.DialogToastActivity;

public final class e extends c {
    public Double a;
    public Double b;
    public Double c;
    public Double d;
    public Double e;
    public Double f;
    public Double g;
    public Double h;
    public Double i;
    public String j;
    public Double k;
    public Double l;
    public Double m;
    public Double n;
    public Double o;

    void updateFields(Context context) {
        int i = a1.a;
        al.a(context, y.EVENT, Integer.valueOf(ar.CONTACT_US_SESSION.getCode()));
        al.a(context, y.CONTACT_US_EXIT_STATE, this.n);
        al.a(context, y.CONTACT_US_FAQ, this.l);
        al.a(context, y.CONTACT_US_AUTOMATIC_EMAIL, this.g);
        al.a(context, y.CONTACT_US_LOGS, this.c);
        al.a(context, y.CONTACT_US_OUTAGE, this.o);
        al.a(context, y.CONTACT_US_OUTAGE_EMAIL, this.f);
        al.a(context, y.CONTACT_US_PROBLEM_DESCRIPTION, this.j);
        al.a(context, y.SEARCH_FAQ_RESULTS_BEST_ID, this.h);
        if (this.k != null) {
            al.a(context, b.CONTACT_US_T, this.k);
        }
        if (this.m != null) {
            al.a(context, b.CONTACT_US_MENU_FAQ_T, this.m);
        }
        if (this.b != null) {
            al.a(context, b.SEARCH_FAQ_RESULTS_GENERATED_C, this.b);
        }
        if (this.i != null) {
            al.a(context, b.SEARCH_FAQ_RESULTS_READ_C, this.i);
        }
        if (this.a != null) {
            al.a(context, b.SEARCH_FAQ_RESULTS_BEST_READ_T, this.a);
        }
        if (this.d != null) {
            al.a(context, b.SEARCH_FAQ_RESULTS_READ_T, this.d);
        }
        if (this.e != null) {
            al.a(context, b.CONTACT_US_SCREENSHOT_C, this.e);
        }
        al.a(context, y.EVENT);
        if (DialogToastActivity.i) {
            a1.a = i + 1;
        }
    }
}
