package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class MapView extends FrameLayout {
    public static boolean a;
    private GoogleMap akS;
    private final b akY;

    class a implements MapLifecycleDelegate {
        private final ViewGroup akZ;
        private final IMapViewDelegate ala;
        private View alb;

        class AnonymousClass_1 extends com.google.android.gms.maps.internal.m.a {
            final OnMapReadyCallback akU;
            final a alc;

            AnonymousClass_1(a aVar, OnMapReadyCallback onMapReadyCallback) {
                this.alc = aVar;
                this.akU = onMapReadyCallback;
            }

            public void a(IGoogleMapDelegate iGoogleMapDelegate) {
                this.akU.onMapReady(new GoogleMap(iGoogleMapDelegate));
            }
        }

        public a(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.ala = (IMapViewDelegate) jx.i(iMapViewDelegate);
            this.akZ = (ViewGroup) jx.i(viewGroup);
        }

        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            try {
                this.ala.getMapAsync(new AnonymousClass_1(this, onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public IMapViewDelegate nP() {
            return this.ala;
        }

        public void onCreate(Bundle bundle) {
            try {
                this.ala.onCreate(bundle);
                this.alb = (View) e.f(this.ala.getView());
                this.akZ.removeAllViews();
                this.akZ.addView(this.alb);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        public void onDestroy() {
            try {
                this.ala.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.ala.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.ala.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.ala.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.ala.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    class b extends com.google.android.gms.dynamic.a {
        protected f akW;
        private final List akX;
        private final ViewGroup ald;
        private final GoogleMapOptions ale;
        private final Context mContext;

        b(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.akX = new ArrayList();
            this.ald = viewGroup;
            this.mContext = context;
            this.ale = googleMapOptions;
        }

        protected void a(f fVar) {
            this.akW = fVar;
            nO();
        }

        public void nO() {
            boolean z = a;
            try {
                if (this.akW != null && je() == null) {
                    try {
                        this.akW.a(new a(this.ald, x.S(this.mContext).a(e.k(this.mContext), this.ale)));
                        for (OnMapReadyCallback onMapReadyCallback : this.akX) {
                            ((a) je()).getMapAsync(onMapReadyCallback);
                            if (z) {
                                break;
                            }
                        }
                        this.akX.clear();
                    } catch (RemoteException e) {
                        throw new RuntimeRemoteException(e);
                    } catch (GooglePlayServicesNotAvailableException e2) {
                    }
                }
            } catch (RemoteException e3) {
                throw e3;
            }
        }
    }

    public MapView(Context context) {
        super(context);
        this.akY = new b(this, context, null);
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.akY = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.akY = new b(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.akY = new b(this, context, googleMapOptions);
    }

    @Deprecated
    public final GoogleMap getMap() {
        try {
            if (this.akS != null) {
                return this.akS;
            }
            try {
                this.akY.nO();
                if (this.akY.je() == null) {
                    return null;
                }
                try {
                    this.akS = new GoogleMap(((a) this.akY.je()).nP().getMap());
                    return this.akS;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (RemoteException e2) {
                throw e2;
            }
        } catch (RemoteException e22) {
            throw e22;
        }
    }

    public final void onCreate(Bundle bundle) {
        try {
            this.akY.onCreate(bundle);
            if (this.akY.je() == null) {
                com.google.android.gms.dynamic.a.b((FrameLayout) this);
            }
        } catch (RuntimeRemoteException e) {
            throw e;
        }
    }

    public final void onDestroy() {
        this.akY.onDestroy();
    }

    public final void onLowMemory() {
        this.akY.onLowMemory();
    }

    public final void onPause() {
        this.akY.onPause();
    }

    public final void onResume() {
        this.akY.onResume();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.akY.onSaveInstanceState(bundle);
    }
}
