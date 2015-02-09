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
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaView extends FrameLayout {
    private final b aly;

    class a implements StreetViewLifecycleDelegate {
        private final ViewGroup akZ;
        private View alA;
        private final IStreetViewPanoramaViewDelegate alz;

        class AnonymousClass_1 extends com.google.android.gms.maps.internal.u.a {
            final a alB;
            final OnStreetViewPanoramaReadyCallback alo;

            AnonymousClass_1(a aVar, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
                this.alB = aVar;
                this.alo = onStreetViewPanoramaReadyCallback;
            }

            public void a(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
                this.alo.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
            }
        }

        public a(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.alz = (IStreetViewPanoramaViewDelegate) jx.i(iStreetViewPanoramaViewDelegate);
            this.akZ = (ViewGroup) jx.i(viewGroup);
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.alz.getStreetViewPanoramaAsync(new AnonymousClass_1(this, onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                this.alz.onCreate(bundle);
                this.alA = (View) e.f(this.alz.getView());
                this.akZ.removeAllViews();
                this.akZ.addView(this.alA);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onDestroy() {
            try {
                this.alz.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        public void onLowMemory() {
            try {
                this.alz.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.alz.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.alz.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.alz.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    class b extends com.google.android.gms.dynamic.a {
        protected f akW;
        private final StreetViewPanoramaOptions alC;
        private final ViewGroup ald;
        private final List alq;
        private final Context mContext;

        b(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.alq = new ArrayList();
            this.ald = viewGroup;
            this.mContext = context;
            this.alC = streetViewPanoramaOptions;
        }

        protected void a(f fVar) {
            this.akW = fVar;
            nO();
        }

        public void nO() {
            boolean z = MapView.a;
            try {
                if (this.akW != null && je() == null) {
                    try {
                        this.akW.a(new a(this.ald, x.S(this.mContext).a(e.k(this.mContext), this.alC)));
                        for (OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback : this.alq) {
                            ((a) je()).getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
                            if (z) {
                                break;
                            }
                        }
                        this.alq.clear();
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

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.aly = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.aly = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.aly = new b(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.aly = new b(this, context, streetViewPanoramaOptions);
    }
}
