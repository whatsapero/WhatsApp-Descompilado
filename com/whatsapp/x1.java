package com.whatsapp;

import org.apache.http.entity.ContentProducer;
import org.apache.http.entity.EntityTemplate;

class x1 extends EntityTemplate {
    final va a;
    long b;

    public x1(va vaVar, ContentProducer contentProducer, long j) {
        this.a = vaVar;
        super(contentProducer);
        this.b = j;
    }

    public long getContentLength() {
        return this.b;
    }
}
