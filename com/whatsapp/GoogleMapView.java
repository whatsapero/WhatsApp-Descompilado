package com.whatsapp;

import android.content.Context;
import android.graphics.Canvas;
import android.location.Location;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import com.actionbarsherlock.R;
import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapView;

public class GoogleMapView extends MapView implements OnDoubleTapListener, OnGestureListener {
    private int a;
    private int b;
    private GeoPoint c;
    private on d;
    private GestureDetector e;

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    private void a() {
        this.e = new GestureDetector(this);
        this.e.setOnDoubleTapListener(this);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        this.e.onTouchEvent(motionEvent);
        return super.dispatchTouchEvent(motionEvent);
    }

    public int b() {
        Location b = b(getMapCenter());
        return (int) Math.min(b.distanceTo(b(getProjection().fromPixels(getWidth() / 2, 0))), b.distanceTo(b(getProjection().fromPixels(0, getHeight() / 2))));
    }

    public GoogleMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new GeoPoint(0, 0);
        this.a = 0;
        this.b = 0;
        a();
    }

    public Location c() {
        return b(getMapCenter());
    }

    public void a(GeoPoint geoPoint) {
        if (geoPoint != null) {
            try {
                getController().animateTo(geoPoint);
            } catch (Exception e) {
                try {
                    getController().setCenter(geoPoint);
                } catch (Exception e2) {
                }
            }
        }
    }

    public void setMapListener(on onVar) {
        this.d = onVar;
    }

    public static Location b(GeoPoint geoPoint) {
        Location location = new Location("");
        location.setLatitude(((double) geoPoint.getLatitudeE6()) / 1000000.0d);
        location.setLongitude(((double) geoPoint.getLongitudeE6()) / 1000000.0d);
        return location;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return getController().zoomInFixing((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.d != null) {
            GeoPoint mapCenter = getMapCenter();
            int latitudeSpan = getLatitudeSpan();
            int longitudeSpan = getLongitudeSpan();
            if (!this.c.equals(mapCenter) || this.a != latitudeSpan || this.b != longitudeSpan) {
                this.c = mapCenter;
                this.a = latitudeSpan;
                this.b = longitudeSpan;
                this.d.a(mapCenter, latitudeSpan, longitudeSpan);
            }
        }
    }

    public GoogleMapView(Context context) {
        super(context, context.getString(R.string.maps_key));
        this.c = new GeoPoint(0, 0);
        this.a = 0;
        this.b = 0;
        a();
    }

    public GoogleMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new GeoPoint(0, 0);
        this.a = 0;
        this.b = 0;
        a();
    }

    public static GeoPoint a(Location location) {
        return new GeoPoint((int) (location.getLatitude() * 1000000.0d), (int) (location.getLongitude() * 1000000.0d));
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }
}
