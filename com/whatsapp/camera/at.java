package com.whatsapp.camera;

import com.actionbarsherlock.R;
import com.whatsapp.App;

class at implements z {
    final CameraActivity a;

    public void a(float f) {
        CameraActivity.g(this.a).a(f);
    }

    public void a(boolean z) {
        CameraActivity.s(this.a).a(z);
    }

    public void b(float f) {
        CameraActivity.g(this.a).b();
    }

    public void b() {
        CameraActivity.e(this.a);
    }

    at(CameraActivity cameraActivity) {
        this.a = cameraActivity;
    }

    public void c(float f) {
        float a = CameraActivity.g(this.a).a();
        if (a >= 1.0f) {
            if (f > a) {
                f = a;
            }
            CameraActivity.g(this.a).a(f, ((float) CameraActivity.d(this.a).setZoomLevel(Math.round((((float) CameraActivity.d(this.a).h()) * (f - 1.0f)) / (a - 1.0f)))) / 100.0f);
        }
    }

    public void a(float f, float f2) {
        CameraActivity.s(this.a).a(f, f2);
    }

    public void a() {
        App.b(this.a, (int) R.string.cannot_start_camera, 1);
        this.a.finish();
    }
}
