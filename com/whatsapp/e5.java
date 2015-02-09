package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Handler;
import com.actionbarsherlock.R;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;
import com.google.android.maps.MyLocationOverlay;
import com.google.android.maps.Projection;

public class e5 extends MyLocationOverlay {
    private Handler a;
    private Drawable b;
    private Point c;
    private Point d;
    private Paint e;
    private Drawable f;
    private Drawable g;

    static Drawable a(e5 e5Var, Drawable drawable) {
        e5Var.g = drawable;
        return drawable;
    }

    static Drawable b(e5 e5Var) {
        return e5Var.f;
    }

    protected void drawMyLocation(Canvas canvas, MapView mapView, Location location, GeoPoint geoPoint, long j) {
        int intrinsicWidth = this.g.getIntrinsicWidth();
        int intrinsicHeight = this.g.getIntrinsicHeight();
        Projection projection = mapView.getProjection();
        double latitude = location.getLatitude();
        double longitude = location.getLongitude();
        float accuracy = location.getAccuracy();
        float[] fArr = new float[1];
        Location.distanceBetween(latitude, longitude, latitude, longitude + 1.0d, fArr);
        projection.toPixels(new GeoPoint((int) (latitude * 1000000.0d), (int) ((longitude - ((double) (accuracy / fArr[0]))) * 1000000.0d)), this.c);
        projection.toPixels(geoPoint, this.d);
        int i = this.d.x - this.c.x;
        this.e.setColor(-10066177);
        this.e.setStyle(Style.STROKE);
        canvas.drawCircle((float) this.d.x, (float) this.d.y, (float) i, this.e);
        this.e.setColor(409364223);
        this.e.setStyle(Style.FILL);
        canvas.drawCircle((float) this.d.x, (float) this.d.y, (float) i, this.e);
        this.g.setBounds(this.d.x - (intrinsicWidth / 2), this.d.y - (intrinsicHeight / 2), this.d.x + (intrinsicWidth / 2), this.d.y + (intrinsicHeight / 2));
        this.g.draw(canvas);
    }

    public void disableMyLocation() {
        super.disableMyLocation();
        this.a.removeMessages(0);
    }

    static Drawable a(e5 e5Var) {
        return e5Var.g;
    }

    public e5(Context context, MapView mapView) {
        super(context, mapView);
        this.d = new Point();
        this.c = new Point();
        this.f = context.getResources().getDrawable(R.drawable.location_blue);
        this.b = context.getResources().getDrawable(R.drawable.location_blue_1);
        this.g = this.f;
        this.e = new Paint();
        this.e.setAntiAlias(true);
        this.e.setStrokeWidth(2.0f);
        this.a = new a8a(this, mapView);
        this.a.sendEmptyMessageDelayed(0, 500);
    }

    static Drawable c(e5 e5Var) {
        return e5Var.b;
    }
}
