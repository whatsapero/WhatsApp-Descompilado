package com.google.android.gms.tagmanager;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tagmanager.ContainerHolder.ContainerAvailableListener;
import org.whispersystems.libaxolotl.ay;

class n implements ContainerHolder {
    private Status Eb;
    private boolean Pf;
    private Container aqu;
    private Container aqv;
    private b aqw;
    private a aqx;
    private TagManager aqy;

    public interface a {
        void ct(String str);

        String pl();

        void pn();
    }

    class b extends Handler {
        final n aqA;
        private final ContainerAvailableListener aqz;

        protected void cv(String str) {
            this.aqz.onContainerAvailable(this.aqA, str);
        }

        public void handleMessage(Message message) {
            switch (message.what) {
                case ay.f /*1*/:
                    cv((String) message.obj);
                default:
                    bh.T("Don't know how to handle this message.");
            }
        }
    }

    public synchronized void cr(String str) {
        if (!this.Pf) {
            this.aqu.cr(str);
        }
    }

    void ct(String str) {
        if (this.Pf) {
            bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        } else {
            this.aqx.ct(str);
        }
    }

    String getContainerId() {
        if (!this.Pf) {
            return this.aqu.getContainerId();
        }
        bh.T("getContainerId called on a released ContainerHolder.");
        return "";
    }

    public Status getStatus() {
        return this.Eb;
    }

    String pl() {
        if (!this.Pf) {
            return this.aqx.pl();
        }
        bh.T("setCtfeUrlPathAndQuery called on a released ContainerHolder.");
        return "";
    }

    public synchronized void refresh() {
        if (this.Pf) {
            bh.T("Refreshing a released ContainerHolder.");
        } else {
            this.aqx.pn();
        }
    }

    public synchronized void release() {
        if (this.Pf) {
            bh.T("Releasing a released ContainerHolder.");
        } else {
            this.Pf = true;
            this.aqy.b(this);
            this.aqu.release();
            this.aqu = null;
            this.aqv = null;
            this.aqx = null;
            this.aqw = null;
        }
    }
}
