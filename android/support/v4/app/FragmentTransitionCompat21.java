package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.app.FragmentTransitionCompat21.EpicenterView;
import android.support.v4.app.FragmentTransitionCompat21.ViewRetriever;
import android.support.v4.app.NotificationCompatBase.Action;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

class FragmentTransitionCompat21 {

    public interface ViewRetriever {
        View getView();
    }

    final class AnonymousClass_1 extends EpicenterCallback {
        final Rect val$epicenter;

        public Rect onGetEpicenter(Transition transition) {
            return this.val$epicenter;
        }

        AnonymousClass_1(Rect rect) {
            this.val$epicenter = rect;
        }
    }

    final class AnonymousClass_2 implements OnPreDrawListener {
        final View val$container;
        final Transition val$enterTransition;
        final ArrayList val$enteringViews;
        final ViewRetriever val$inFragment;
        final Map val$nameOverrides;
        final Map val$renamedViews;

        AnonymousClass_2(View view, ViewRetriever viewRetriever, Map map, Map map2, Transition transition, ArrayList arrayList) {
            this.val$container = view;
            this.val$inFragment = viewRetriever;
            this.val$nameOverrides = map;
            this.val$renamedViews = map2;
            this.val$enterTransition = transition;
            this.val$enteringViews = arrayList;
        }

        public boolean onPreDraw() {
            int i = Action.a;
            this.val$container.getViewTreeObserver().removeOnPreDrawListener(this);
            View view = this.val$inFragment.getView();
            if (view != null) {
                if (!this.val$nameOverrides.isEmpty()) {
                    FragmentTransitionCompat21.findNamedViews(this.val$renamedViews, view);
                    this.val$renamedViews.keySet().retainAll(this.val$nameOverrides.values());
                    for (Entry entry : this.val$nameOverrides.entrySet()) {
                        View view2 = (View) this.val$renamedViews.get((String) entry.getValue());
                        if (view2 != null) {
                            view2.setTransitionName((String) entry.getKey());
                            continue;
                        }
                        if (i != 0) {
                            break;
                        }
                    }
                }
                if (this.val$enterTransition != null) {
                    FragmentTransitionCompat21.access$000(this.val$enteringViews, view);
                    this.val$enteringViews.removeAll(this.val$renamedViews.values());
                    FragmentTransitionCompat21.addTargets(this.val$enterTransition, this.val$enteringViews);
                }
            }
            return true;
        }
    }

    final class AnonymousClass_3 extends EpicenterCallback {
        private Rect mEpicenter;
        final EpicenterView val$epicenterView;

        public Rect onGetEpicenter(Transition transition) {
            if (this.mEpicenter == null && this.val$epicenterView.epicenter != null) {
                this.mEpicenter = FragmentTransitionCompat21.access$100(this.val$epicenterView.epicenter);
            }
            return this.mEpicenter;
        }

        AnonymousClass_3(EpicenterView epicenterView) {
            this.val$epicenterView = epicenterView;
        }
    }

    final class AnonymousClass_4 implements OnPreDrawListener {
        final Transition val$enterTransition;
        final ArrayList val$enteringViews;
        final Transition val$exitTransition;
        final ArrayList val$exitingViews;
        final ArrayList val$hiddenViews;
        final View val$nonExistentView;
        final Transition val$overallTransition;
        final Map val$renamedViews;
        final View val$sceneRoot;
        final ArrayList val$sharedElementTargets;
        final Transition val$sharedElementTransition;

        AnonymousClass_4(View view, Transition transition, View view2, ArrayList arrayList, Transition transition2, ArrayList arrayList2, Transition transition3, ArrayList arrayList3, Map map, ArrayList arrayList4, Transition transition4) {
            this.val$sceneRoot = view;
            this.val$enterTransition = transition;
            this.val$nonExistentView = view2;
            this.val$enteringViews = arrayList;
            this.val$exitTransition = transition2;
            this.val$exitingViews = arrayList2;
            this.val$sharedElementTransition = transition3;
            this.val$sharedElementTargets = arrayList3;
            this.val$renamedViews = map;
            this.val$hiddenViews = arrayList4;
            this.val$overallTransition = transition4;
        }

        public boolean onPreDraw() {
            int i = Action.a;
            this.val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.val$enterTransition != null) {
                this.val$enterTransition.removeTarget(this.val$nonExistentView);
                FragmentTransitionCompat21.removeTargets(this.val$enterTransition, this.val$enteringViews);
            }
            if (this.val$exitTransition != null) {
                FragmentTransitionCompat21.removeTargets(this.val$exitTransition, this.val$exitingViews);
            }
            if (this.val$sharedElementTransition != null) {
                FragmentTransitionCompat21.removeTargets(this.val$sharedElementTransition, this.val$sharedElementTargets);
            }
            for (Entry entry : this.val$renamedViews.entrySet()) {
                ((View) entry.getValue()).setTransitionName((String) entry.getKey());
                if (i != 0) {
                    break;
                }
            }
            int size = this.val$hiddenViews.size();
            int i2 = 0;
            while (i2 < size) {
                this.val$overallTransition.excludeTarget((View) this.val$hiddenViews.get(i2), false);
                int i3 = i2 + 1;
                if (i != 0) {
                    break;
                }
                i2 = i3;
            }
            this.val$overallTransition.excludeTarget(this.val$nonExistentView, false);
            return true;
        }
    }

    public class EpicenterView {
        public static boolean a;
        public View epicenter;
    }

    public static void addTransitionTargets(Object obj, Object obj2, View view, ViewRetriever viewRetriever, View view2, EpicenterView epicenterView, Map map, ArrayList arrayList, Map map2, ArrayList arrayList2) {
        if (obj != null || obj2 != null) {
            Transition transition = (Transition) obj;
            if (transition != null) {
                transition.addTarget(view2);
            }
            if (obj2 != null) {
                addTargets((Transition) obj2, arrayList2);
            }
            if (viewRetriever != null) {
                view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass_2(view, viewRetriever, map, map2, transition, arrayList));
            }
            setSharedElementEpicenter(transition, epicenterView);
        }
    }

    static Rect access$100(View view) {
        return getBoundsOnScreen(view);
    }

    public static void excludeTarget(Object obj, View view, boolean z) {
        ((Transition) obj).excludeTarget(view, z);
    }

    public static void removeTargets(Object obj, ArrayList arrayList) {
        int i = Action.a;
        Transition transition = (Transition) obj;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            transition.removeTarget((View) arrayList.get(i2));
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public static void findNamedViews(Map map, View view) {
        int i = Action.a;
        if (view.getVisibility() == 0) {
            String transitionName = view.getTransitionName();
            if (transitionName != null) {
                map.put(transitionName, view);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    findNamedViews(map, viewGroup.getChildAt(i2));
                    i2++;
                    if (i != 0) {
                        return;
                    }
                }
            }
        }
    }

    public static void addTargets(Object obj, ArrayList arrayList) {
        int i = Action.a;
        Transition transition = (Transition) obj;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            transition.addTarget((View) arrayList.get(i2));
            int i3 = i2 + 1;
            if (i == 0) {
                i2 = i3;
            } else {
                return;
            }
        }
    }

    public static Object captureExitingViews(Object obj, View view, ArrayList arrayList, Map map) {
        if (obj == null) {
            return obj;
        }
        captureTransitioningViews(arrayList, view);
        if (map != null) {
            arrayList.removeAll(map.values());
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        addTargets((Transition) obj, arrayList);
        return obj;
    }

    public static Object cloneTransition(Object obj) {
        return obj != null ? ((Transition) obj).clone() : obj;
    }

    public static String getTransitionName(View view) {
        return view.getTransitionName();
    }

    static void access$000(ArrayList arrayList, View view) {
        captureTransitioningViews(arrayList, view);
    }

    public static void setEpicenter(Object obj, View view) {
        ((Transition) obj).setEpicenterCallback(new AnonymousClass_1(getBoundsOnScreen(view)));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void captureTransitioningViews(java.util.ArrayList r5, android.view.View r6) {
        /*
        r2 = android.support.v4.app.NotificationCompatBase.Action.a;
        r0 = r6.getVisibility();
        if (r0 != 0) goto L_0x0031;
    L_0x0008:
        r0 = r6 instanceof android.view.ViewGroup;
        if (r0 == 0) goto L_0x002e;
    L_0x000c:
        r0 = r6;
        r0 = (android.view.ViewGroup) r0;
        r1 = r0.isTransitionGroup();
        if (r1 == 0) goto L_0x001a;
    L_0x0015:
        r5.add(r0);
        if (r2 == 0) goto L_0x002c;
    L_0x001a:
        r3 = r0.getChildCount();
        r1 = 0;
    L_0x001f:
        if (r1 >= r3) goto L_0x002c;
    L_0x0021:
        r4 = r0.getChildAt(r1);
        captureTransitioningViews(r5, r4);
        r1 = r1 + 1;
        if (r2 == 0) goto L_0x001f;
    L_0x002c:
        if (r2 == 0) goto L_0x0031;
    L_0x002e:
        r5.add(r6);
    L_0x0031:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.FragmentTransitionCompat21.captureTransitioningViews(java.util.ArrayList, android.view.View):void");
    }

    private static void setSharedElementEpicenter(Transition transition, EpicenterView epicenterView) {
        if (transition != null) {
            transition.setEpicenterCallback(new AnonymousClass_3(epicenterView));
        }
    }

    public static Object mergeTransitions(Object obj, Object obj2, Object obj3, boolean z) {
        Object transitionSet;
        int i = Action.a;
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition == null || transition2 == null) {
            z = true;
        }
        if (z) {
            transitionSet = new TransitionSet();
            if (transition != null) {
                transitionSet.addTransition(transition);
            }
            if (transition2 != null) {
                transitionSet.addTransition(transition2);
            }
            if (transition3 != null) {
                transitionSet.addTransition(transition3);
            }
            if (i == 0) {
                return transitionSet;
            }
        }
        Transition transition4 = null;
        if (transition2 != null && transition != null) {
            transition4 = new TransitionSet().addTransition(transition2).addTransition(transition).setOrdering(1);
        } else if (transition2 != null) {
            transition4 = transition2;
        } else if (transition != null) {
            transition4 = transition;
        }
        if (transition3 != null) {
            transitionSet = new TransitionSet();
            if (transition4 != null) {
                transitionSet.addTransition(transition4);
            }
            transitionSet.addTransition(transition3);
            if (i == 0) {
                return transitionSet;
            }
        }
        return transition4;
    }

    public static void beginDelayedTransition(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    public static void cleanupTransitions(View view, View view2, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3, Object obj4, ArrayList arrayList4, Map map) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        Transition transition4 = (Transition) obj4;
        if (transition4 != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass_4(view, transition, view2, arrayList, transition2, arrayList2, transition3, arrayList3, map, arrayList4, transition4));
        }
    }

    private static Rect getBoundsOnScreen(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }
}
