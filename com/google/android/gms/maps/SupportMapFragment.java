package com.google.android.gms.maps;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.w;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class SupportMapFragment extends Fragment {
    private final b alD;

    class a implements MapLifecycleDelegate {
        private final Fragment Mx;
        private final IMapFragmentDelegate akT;

        class AnonymousClass_1 extends com.google.android.gms.maps.internal.m.a {
            final OnMapReadyCallback akU;
            final a alE;

            AnonymousClass_1(a aVar, OnMapReadyCallback onMapReadyCallback) {
                this.alE = aVar;
                this.akU = onMapReadyCallback;
            }

            public void a(IGoogleMapDelegate iGoogleMapDelegate) {
                this.akU.onMapReady(new GoogleMap(iGoogleMapDelegate));
            }
        }

        public a(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.akT = (IMapFragmentDelegate) jx.i(iMapFragmentDelegate);
            this.Mx = (Fragment) jx.i(fragment);
        }

        public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            try {
                this.akT.getMapAsync(new AnonymousClass_1(this, onMapReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle arguments = this.Mx.getArguments();
                if (arguments != null) {
                    try {
                        if (arguments.containsKey("MapOptions")) {
                            w.a(bundle, "MapOptions", arguments.getParcelable("MapOptions"));
                        }
                    } catch (RemoteException e) {
                        throw e;
                    } catch (RemoteException e2) {
                        throw e2;
                    }
                }
                this.akT.onCreate(bundle);
            } catch (RemoteException e22) {
                throw new RuntimeRemoteException(e22);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) e.f(this.akT.onCreateView(e.k(layoutInflater), e.k(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.akT.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.akT.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.akT.onInflate(e.k(activity), (GoogleMapOptions) bundle.getParcelable("MapOptions"), bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.akT.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.akT.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.akT.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.akT.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    class b extends com.google.android.gms.dynamic.a {
        private final Fragment Mx;
        protected f akW;
        private final List akX;
        private Activity nB;

        b(Fragment fragment) {
            this.akX = new ArrayList();
            this.Mx = fragment;
        }

        static void a(b bVar, Activity activity) {
            bVar.setActivity(activity);
        }

        private void setActivity(Activity activity) {
            this.nB = activity;
            nO();
        }

        protected void a(f fVar) {
            this.akW = fVar;
            nO();
        }

        public void nO() {
            boolean z = MapView.a;
            try {
                if (this.nB != null && this.akW != null) {
                    if (je() == null) {
                        try {
                            MapsInitializer.initialize(this.nB);
                            this.akW.a(new a(this.Mx, x.S(this.nB).j(e.k(this.nB))));
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
                }
            } catch (RemoteException e3) {
                throw e3;
            } catch (RemoteException e32) {
                throw e32;
            }
        }
    }

    public SupportMapFragment() {
        this.alD = new b(this);
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        b.a(this.alD, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.alD.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.alD.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.alD.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.alD.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        b.a(this.alD, activity);
        Parcelable createFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MapOptions", createFromAttributes);
        this.alD.onInflate(activity, bundle2, bundle);
    }

    public void onLowMemory() {
        this.alD.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.alD.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.alD.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.alD.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
