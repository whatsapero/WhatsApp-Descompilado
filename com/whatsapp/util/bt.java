package com.whatsapp.util;

import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;

class bt extends bl {
    private OpusPlayer a;

    public void g() {
        try {
            this.a.stop();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void a() {
        this.a.close();
    }

    public void d() {
        try {
            this.a.start();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public int i() {
        return 0;
    }

    public void h() {
        this.a.prepare();
    }

    public int e() {
        try {
            return (int) this.a.getLength();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void b(int i) {
        try {
            this.a.seek((long) i);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public int f() {
        try {
            return (int) this.a.getCurrentPosition();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void a(int i) {
    }

    public boolean c() {
        try {
            return this.a.isPlaying();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public bt(String str) {
        this.a = new OpusPlayer(str);
    }

    public void b() {
        try {
            this.a.pause();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public void a(OnPreparedListener onPreparedListener) {
    }

    public void a(OnErrorListener onErrorListener) {
    }
}
