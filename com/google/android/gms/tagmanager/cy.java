package com.google.android.gms.tagmanager;

import android.os.Handler;

class cy extends cx {
    private static cy atJ;
    private static final Object yT;
    private at atA;
    private volatile ar atB;
    private int atC;
    private boolean atD;
    private boolean atE;
    private boolean atF;
    private au atG;
    private boolean atI;
    private boolean connected;
    private Handler handler;

    static {
        yT = new Object();
    }

    private cy() {
        this.atC = 1800000;
        this.atD = true;
        this.atE = false;
        this.connected = true;
        this.atF = true;
        this.atG = new au() {
            final cy atK;

            {
                this.atK = r1;
            }
        };
        this.atI = false;
    }

    static at e(cy cyVar) {
        return cyVar.atA;
    }

    public static cy qN() {
        if (atJ == null) {
            atJ = new cy();
        }
        return atJ;
    }

    synchronized void C(boolean z) {
        a(this.atI, z);
    }

    synchronized void a(boolean z, boolean z2) {
        if (!(this.atI == z && this.connected == z2)) {
            if (z || !z2) {
                if (this.atC > 0) {
                    this.handler.removeMessages(1, yT);
                }
            }
            if (!z && z2 && this.atC > 0) {
                this.handler.sendMessageDelayed(this.handler.obtainMessage(1, yT), (long) this.atC);
            }
            StringBuilder append = new StringBuilder().append("PowerSaveMode ");
            String str = (z || !z2) ? "initiated." : "terminated.";
            bh.V(append.append(str).toString());
            this.atI = z;
            this.connected = z2;
        }
    }

    public synchronized void dispatch() {
        if (this.atE) {
            this.atB.b(new Runnable() {
                final cy atK;

                {
                    this.atK = r1;
                }

                public void run() {
                    cy.e(this.atK).dispatch();
                }
            });
        } else {
            bh.V("Dispatch call queued. Dispatch will run once initialization is complete.");
            this.atD = true;
        }
    }

    synchronized void ey() {
        if (!this.atI && this.connected && this.atC > 0) {
            this.handler.removeMessages(1, yT);
            this.handler.sendMessage(this.handler.obtainMessage(1, yT));
        }
    }
}
