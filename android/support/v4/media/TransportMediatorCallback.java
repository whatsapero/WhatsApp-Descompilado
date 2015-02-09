package android.support.v4.media;

import android.view.KeyEvent;

interface TransportMediatorCallback {
    long getPlaybackPosition();

    void handleKey(KeyEvent keyEvent);

    void playbackPositionUpdate(long j);
}
