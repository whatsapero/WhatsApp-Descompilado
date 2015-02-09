package com.whatsapp.util;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import android.media.MediaPlayer.OnPreparedListener;

class bv extends bl {
    MediaPlayer a;

    public void h() {
        this.a.prepare();
    }

    public void a(OnErrorListener onErrorListener) {
        this.a.setOnErrorListener(onErrorListener);
    }

    public void b(int i) {
        this.a.seekTo(i);
    }

    public int f() {
        return this.a.getCurrentPosition();
    }

    public boolean c() {
        return this.a.isPlaying();
    }

    public bv(String str) {
        this.a = new MediaPlayer();
        this.a.setDataSource(str);
    }

    public void g() {
        this.a.stop();
    }

    public int e() {
        return this.a.getDuration();
    }

    public void d() {
        this.a.start();
    }

    public int i() {
        return this.a.getAudioSessionId();
    }

    public void a(OnPreparedListener onPreparedListener) {
        this.a.setOnPreparedListener(onPreparedListener);
    }

    public void a(int i) {
        this.a.setAudioStreamType(i);
    }

    public void a() {
        this.a.release();
    }

    public void b() {
        this.a.pause();
    }
}
