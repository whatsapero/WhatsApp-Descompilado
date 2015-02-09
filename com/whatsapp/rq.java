package com.whatsapp;

class rq implements asx {
    final ListChatInfo a;

    public void a(String str) {
        if (!ListChatInfo.d(this.a).a(this.a).equals(str)) {
            ListChatInfo.d(this.a).N = str;
            App.P.o(ListChatInfo.d(this.a));
            App.aJ.a(ListChatInfo.d(this.a).e, str);
            ListChatInfo.g(this.a);
            App.p(ListChatInfo.d(this.a).e);
            App.c(ListChatInfo.d(this.a));
        }
    }

    rq(ListChatInfo listChatInfo) {
        this.a = listChatInfo;
    }
}
