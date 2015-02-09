package com.whatsapp.util;

import android.util.AttributeSet;
import android.view.InflateException;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import java.io.InputStream;
import java.io.Reader;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class ah implements XmlPullParser {
    private static final String z;
    final AttributeSet a;
    final String b;
    final View[] c;
    final LayoutInflater d;

    static {
        char[] toCharArray = "&hxB".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 67;
                    break;
                case ay.f /*1*/:
                    i2 = 16;
                    break;
                case ay.n /*2*/:
                    i2 = 17;
                    break;
                case ay.p /*3*/:
                    i2 = 54;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public void setInput(Reader reader) {
    }

    public int getAttributeCount() {
        return 0;
    }

    public String getText() {
        return null;
    }

    public void setInput(InputStream inputStream, String str) {
    }

    public int getNamespaceCount(int i) {
        return 0;
    }

    public String getPositionDescription() {
        return null;
    }

    public String getPrefix() {
        return null;
    }

    public String getAttributeName(int i) {
        return null;
    }

    public void defineEntityReplacementText(String str, String str2) {
    }

    public String getAttributeValue(int i) {
        return null;
    }

    public int nextTag() {
        return 0;
    }

    public String getInputEncoding() {
        return null;
    }

    public String getAttributeType(int i) {
        return null;
    }

    public int getColumnNumber() {
        return 0;
    }

    public String getNamespace(String str) {
        return null;
    }

    public boolean isEmptyElementTag() {
        return false;
    }

    public void setProperty(String str, Object obj) {
    }

    public String getAttributeNamespace(int i) {
        return null;
    }

    public String getNamespacePrefix(int i) {
        return null;
    }

    public String getNamespace() {
        return null;
    }

    public int getLineNumber() {
        return 0;
    }

    ah(View[] viewArr, LayoutInflater layoutInflater, String str, AttributeSet attributeSet) {
        this.c = viewArr;
        this.d = layoutInflater;
        this.b = str;
        this.a = attributeSet;
    }

    public char[] getTextCharacters(int[] iArr) {
        return null;
    }

    public Object getProperty(String str) {
        return null;
    }

    public String getName() {
        return null;
    }

    public String nextText() {
        return null;
    }

    public boolean isWhitespace() {
        return false;
    }

    public boolean getFeature(String str) {
        return false;
    }

    public String getAttributePrefix(int i) {
        return null;
    }

    public void setFeature(String str, boolean z) {
    }

    public int getEventType() {
        return 0;
    }

    public boolean isAttributeDefault(int i) {
        return false;
    }

    public String getAttributeValue(String str, String str2) {
        return null;
    }

    public int next() {
        try {
            this.c[0] = (TextView) this.d.createView(this.b, null, this.a);
        } catch (InflateException e) {
        } catch (ClassNotFoundException e2) {
        }
        throw new XmlPullParserException(z);
    }

    public void require(int i, String str, String str2) {
    }

    public int nextToken() {
        return 0;
    }

    public int getDepth() {
        return 0;
    }

    public String getNamespaceUri(int i) {
        return null;
    }
}
