package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.dynamic.e;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.internal.jx;
import com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
import com.google.android.gms.maps.internal.w;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import java.util.ArrayList;
import java.util.List;

public class StreetViewPanoramaFragment extends Fragment {
    private final b all;

    class a implements StreetViewLifecycleDelegate {
        private final Fragment TG;
        private final IStreetViewPanoramaFragmentDelegate aln;

        class AnonymousClass_1 extends com.google.android.gms.maps.internal.u.a {
            final OnStreetViewPanoramaReadyCallback alo;
            final a alp;

            AnonymousClass_1(a aVar, OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
                this.alp = aVar;
                this.alo = onStreetViewPanoramaReadyCallback;
            }

            public void a(IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) {
                this.alo.onStreetViewPanoramaReady(new StreetViewPanorama(iStreetViewPanoramaDelegate));
            }
        }

        public a(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.aln = (IStreetViewPanoramaFragmentDelegate) jx.i(iStreetViewPanoramaFragmentDelegate);
            this.TG = (Fragment) jx.i(fragment);
        }

        public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            try {
                this.aln.getStreetViewPanoramaAsync(new AnonymousClass_1(this, onStreetViewPanoramaReadyCallback));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onCreate(Bundle bundle) {
            try {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                Bundle arguments = this.TG.getArguments();
                if (arguments != null) {
                    try {
                        if (arguments.containsKey("StreetViewPanoramaOptions")) {
                            w.a(bundle, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                        }
                    } catch (RemoteException e) {
                        throw e;
                    } catch (RemoteException e2) {
                        throw e2;
                    }
                }
                this.aln.onCreate(bundle);
            } catch (RemoteException e22) {
                throw new RuntimeRemoteException(e22);
            }
        }

        public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            try {
                return (View) e.f(this.aln.onCreateView(e.k(layoutInflater), e.k(viewGroup), bundle));
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroy() {
            try {
                this.aln.onDestroy();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onDestroyView() {
            try {
                this.aln.onDestroyView();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            try {
                this.aln.onInflate(e.k(activity), null, bundle2);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onLowMemory() {
            try {
                this.aln.onLowMemory();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onPause() {
            try {
                this.aln.onPause();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onResume() {
            try {
                this.aln.onResume();
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public void onSaveInstanceState(Bundle bundle) {
            try {
                this.aln.onSaveInstanceState(bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    class b extends com.google.android.gms.dynamic.a {
        private final Fragment TG;
        protected f akW;
        private final List alq;
        private Activity nB;

        b(Fragment fragment) {
            this.alq = new ArrayList();
            this.TG = fragment;
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
                            this.akW.a(new a(this.TG, x.S(this.nB).k(e.k(this.nB))));
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
                }
            } catch (RemoteException e3) {
                throw e3;
            } catch (RemoteException e32) {
                throw e32;
            }
        }
    }

    public StreetViewPanoramaFragment() {
        this.all = new b(this);
    }

    public void onActivityCreated(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onActivityCreated(bundle);
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        b.a(this.all, activity);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.all.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.all.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroy() {
        this.all.onDestroy();
        super.onDestroy();
    }

    public void onDestroyView() {
        this.all.onDestroyView();
        super.onDestroyView();
    }

    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        super.onInflate(activity, attributeSet, bundle);
        b.a(this.all, activity);
        this.all.onInflate(activity, new Bundle(), bundle);
    }

    public void onLowMemory() {
        this.all.onLowMemory();
        super.onLowMemory();
    }

    public void onPause() {
        this.all.onPause();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        this.all.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.all.onSaveInstanceState(bundle);
    }

    public void setArguments(Bundle bundle) {
        super.setArguments(bundle);
    }
}
