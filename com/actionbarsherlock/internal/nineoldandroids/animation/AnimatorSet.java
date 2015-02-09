package com.actionbarsherlock.internal.nineoldandroids.animation;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.spongycastle.jcajce.provider.symmetric.util.PBE;
import org.whispersystems.libaxolotl.ay;

public final class AnimatorSet extends Animator {
    private static final String z;
    private ValueAnimator mDelayAnim;
    private long mDuration;
    private boolean mNeedsSort;
    private HashMap mNodeMap;
    private ArrayList mNodes;
    private ArrayList mPlayingSet;
    private AnimatorSetListener mSetListener;
    private ArrayList mSortedNodes;
    private long mStartDelay;
    private boolean mStarted;
    boolean mTerminated;

    class AnonymousClass_1 extends AnimatorListenerAdapter {
        boolean canceled;
        final AnimatorSet this$0;
        final ArrayList val$nodesToStart;

        public void onAnimationCancel(Animator animator) {
            this.canceled = true;
        }

        public void onAnimationEnd(Animator animator) {
            boolean z = a;
            if (!this.canceled) {
                int size = this.val$nodesToStart.size();
                int i = 0;
                while (i < size) {
                    Node node = (Node) this.val$nodesToStart.get(i);
                    node.animation.start();
                    AnimatorSet.access$000(this.this$0).add(node.animation);
                    int i2 = i + 1;
                    if (!z) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }

        AnonymousClass_1(AnimatorSet animatorSet, ArrayList arrayList) {
            this.this$0 = animatorSet;
            this.val$nodesToStart = arrayList;
            this.canceled = false;
        }
    }

    class AnimatorSetListener implements AnimatorListener {
        private AnimatorSet mAnimatorSet;
        final AnimatorSet this$0;

        public void onAnimationEnd(Animator animator) {
            boolean z = true;
            boolean z2 = a;
            animator.removeListener(this);
            AnimatorSet.access$000(this.this$0).remove(animator);
            ((Node) AnimatorSet.access$100(this.mAnimatorSet).get(animator)).done = true;
            if (!this.this$0.mTerminated) {
                boolean z3;
                int i;
                ArrayList access$200 = AnimatorSet.access$200(this.mAnimatorSet);
                int size = access$200.size();
                int i2 = 0;
                while (i2 < size) {
                    if (!((Node) access$200.get(i2)).done) {
                        if (!z2) {
                            z3 = false;
                            break;
                        }
                        z3 = false;
                    } else {
                        z3 = z;
                    }
                    i = i2 + 1;
                    if (z2) {
                        break;
                    }
                    i2 = i;
                    z = z3;
                }
                z3 = z;
                if (z3) {
                    if (this.this$0.mListeners != null) {
                        ArrayList arrayList = (ArrayList) this.this$0.mListeners.clone();
                        int size2 = arrayList.size();
                        i2 = 0;
                        while (i2 < size2) {
                            ((AnimatorListener) arrayList.get(i2)).onAnimationEnd(this.mAnimatorSet);
                            i = i2 + 1;
                            if (z2) {
                                break;
                            }
                            i2 = i;
                        }
                    }
                    AnimatorSet.access$302(this.mAnimatorSet, false);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        AnimatorSetListener(AnimatorSet animatorSet, AnimatorSet animatorSet2) {
            this.this$0 = animatorSet;
            this.mAnimatorSet = animatorSet2;
        }

        public void onAnimationCancel(Animator animator) {
            boolean z = a;
            if (!this.this$0.mTerminated && AnimatorSet.access$000(this.this$0).size() == 0 && this.this$0.mListeners != null) {
                int size = this.this$0.mListeners.size();
                int i = 0;
                while (i < size) {
                    ((AnimatorListener) this.this$0.mListeners.get(i)).onAnimationCancel(this.mAnimatorSet);
                    int i2 = i + 1;
                    if (!z) {
                        i = i2;
                    } else {
                        return;
                    }
                }
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }
    }

    public class Builder {
        private Node mCurrentNode;
        final AnimatorSet this$0;

        Builder(AnimatorSet animatorSet, Animator animator) {
            this.this$0 = animatorSet;
            this.mCurrentNode = (Node) AnimatorSet.access$100(animatorSet).get(animator);
            if (this.mCurrentNode == null) {
                this.mCurrentNode = new Node(animator);
                AnimatorSet.access$100(animatorSet).put(animator, this.mCurrentNode);
                AnimatorSet.access$400(animatorSet).add(this.mCurrentNode);
            }
        }

        public com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Builder with(Animator animator) {
            Node node = (Node) AnimatorSet.access$100(this.this$0).get(animator);
            if (node == null) {
                node = new Node(animator);
                AnimatorSet.access$100(this.this$0).put(animator, node);
                AnimatorSet.access$400(this.this$0).add(node);
            }
            node.addDependency(new Dependency(this.mCurrentNode, 0));
            return this;
        }
    }

    class Dependency {
        public Node node;
        public int rule;

        public Dependency(Node node, int i) {
            this.node = node;
            this.rule = i;
        }
    }

    class DependencyListener implements AnimatorListener {
        private AnimatorSet mAnimatorSet;
        private Node mNode;
        private int mRule;

        private void startIfReady(Animator animator) {
            if (!this.mAnimatorSet.mTerminated) {
                Object obj;
                int size = this.mNode.tmpDependencies.size();
                for (int i = 0; i < size; i++) {
                    obj = (Dependency) this.mNode.tmpDependencies.get(i);
                    if (obj.rule == this.mRule && obj.node.animation == animator) {
                        animator.removeListener(this);
                        break;
                    }
                }
                obj = null;
                this.mNode.tmpDependencies.remove(obj);
                if (this.mNode.tmpDependencies.size() == 0) {
                    this.mNode.animation.start();
                    AnimatorSet.access$000(this.mAnimatorSet).add(this.mNode.animation);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.mRule == 0) {
                startIfReady(animator);
            }
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public DependencyListener(AnimatorSet animatorSet, Node node, int i) {
            this.mAnimatorSet = animatorSet;
            this.mNode = node;
            this.mRule = i;
        }

        public void onAnimationEnd(Animator animator) {
            if (this.mRule == 1) {
                startIfReady(animator);
            }
        }
    }

    class Node implements Cloneable {
        public Animator animation;
        public ArrayList dependencies;
        public boolean done;
        public ArrayList nodeDependencies;
        public ArrayList nodeDependents;
        public ArrayList tmpDependencies;

        public Node clone() {
            try {
                Node node = (Node) super.clone();
                node.animation = this.animation.clone();
                return node;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }

        public Node(Animator animator) {
            this.dependencies = null;
            this.tmpDependencies = null;
            this.nodeDependencies = null;
            this.nodeDependents = null;
            this.done = false;
            this.animation = animator;
        }

        public void addDependency(Dependency dependency) {
            if (this.dependencies == null) {
                this.dependencies = new ArrayList();
                this.nodeDependencies = new ArrayList();
            }
            this.dependencies.add(dependency);
            if (!this.nodeDependencies.contains(dependency.node)) {
                this.nodeDependencies.add(dependency.node);
            }
            Node node = dependency.node;
            if (node.nodeDependents == null) {
                node.nodeDependents = new ArrayList();
            }
            node.nodeDependents.add(this);
        }

        public Object clone() {
            return clone();
        }
    }

    static {
        char[] toCharArray = "\u0003\fR\u0001:,\u0004RB+%\u0015E\f+%\u000bC\u000b*3EC\u0003!.\nTB*8\fS\u0016o)\u000b\u0000#!)\bA\u0016 26E\u0016".toCharArray();
        int length = toCharArray.length;
        char[] cArr = toCharArray;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case PBE.MD5 /*0*/:
                    i2 = 64;
                    break;
                case ay.f /*1*/:
                    i2 = 101;
                    break;
                case ay.n /*2*/:
                    i2 = 32;
                    break;
                case ay.p /*3*/:
                    i2 = 98;
                    break;
                default:
                    i2 = 79;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        z = new String(cArr).intern();
    }

    public Builder play(Animator animator) {
        if (animator == null) {
            return null;
        }
        try {
            this.mNeedsSort = true;
            return new Builder(this, animator);
        } catch (IllegalStateException e) {
            throw e;
        }
    }

    public AnimatorSet() {
        this.mPlayingSet = new ArrayList();
        this.mNodeMap = new HashMap();
        this.mNodes = new ArrayList();
        this.mSortedNodes = new ArrayList();
        this.mNeedsSort = true;
        this.mSetListener = null;
        this.mTerminated = false;
        this.mStarted = false;
        this.mStartDelay = 0;
        this.mDelayAnim = null;
        this.mDuration = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void end() {
        /*
        r4_this = this;
        r1 = a;
        r0 = 1;
        r4.mTerminated = r0;	 Catch:{ IllegalStateException -> 0x0091 }
        r0 = r4.isStarted();	 Catch:{ IllegalStateException -> 0x0091 }
        if (r0 == 0) goto L_0x0090;
    L_0x000b:
        r0 = r4.mSortedNodes;	 Catch:{ IllegalStateException -> 0x0091 }
        r0 = r0.size();	 Catch:{ IllegalStateException -> 0x0091 }
        r2 = r4.mNodes;	 Catch:{ IllegalStateException -> 0x0091 }
        r2 = r2.size();	 Catch:{ IllegalStateException -> 0x0091 }
        if (r0 == r2) goto L_0x0042;
    L_0x0019:
        r4.sortNodes();
        r0 = r4.mSortedNodes;
        r2 = r0.iterator();
    L_0x0022:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0042;
    L_0x0028:
        r0 = r2.next();
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r3 = r4.mSetListener;	 Catch:{ IllegalStateException -> 0x0093 }
        if (r3 != 0) goto L_0x0039;
    L_0x0032:
        r3 = new com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet$AnimatorSetListener;	 Catch:{ IllegalStateException -> 0x0093 }
        r3.<init>(r4, r4);	 Catch:{ IllegalStateException -> 0x0093 }
        r4.mSetListener = r3;	 Catch:{ IllegalStateException -> 0x0093 }
    L_0x0039:
        r0 = r0.animation;
        r3 = r4.mSetListener;
        r0.addListener(r3);
        if (r1 == 0) goto L_0x0022;
    L_0x0042:
        r0 = r4.mDelayAnim;	 Catch:{ IllegalStateException -> 0x0095 }
        if (r0 == 0) goto L_0x004b;
    L_0x0046:
        r0 = r4.mDelayAnim;	 Catch:{ IllegalStateException -> 0x0095 }
        r0.cancel();	 Catch:{ IllegalStateException -> 0x0095 }
    L_0x004b:
        r0 = r4.mSortedNodes;
        r0 = r0.size();
        if (r0 <= 0) goto L_0x006c;
    L_0x0053:
        r0 = r4.mSortedNodes;
        r2 = r0.iterator();
    L_0x0059:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x006c;
    L_0x005f:
        r0 = r2.next();
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r0 = r0.animation;
        r0.end();
        if (r1 == 0) goto L_0x0059;
    L_0x006c:
        r0 = r4.mListeners;
        if (r0 == 0) goto L_0x008d;
    L_0x0070:
        r0 = r4.mListeners;
        r0 = r0.clone();
        r0 = (java.util.ArrayList) r0;
        r2 = r0.iterator();
    L_0x007c:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x008d;
    L_0x0082:
        r0 = r2.next();
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r0;
        r0.onAnimationEnd(r4);
        if (r1 == 0) goto L_0x007c;
    L_0x008d:
        r0 = 0;
        r4.mStarted = r0;
    L_0x0090:
        return;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r0 = move-exception;
        throw r0;
    L_0x0095:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.end():void");
    }

    static ArrayList access$400(AnimatorSet animatorSet) {
        return animatorSet.mNodes;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
        r4_this = this;
        r2 = a;
        r0 = 1;
        r4.mTerminated = r0;
        r0 = r4.isStarted();
        if (r0 == 0) goto L_0x007c;
    L_0x000b:
        r0 = 0;
        r1 = r4.mListeners;
        if (r1 == 0) goto L_0x0083;
    L_0x0010:
        r0 = r4.mListeners;
        r0 = r0.clone();
        r0 = (java.util.ArrayList) r0;
        r3 = r0.iterator();
    L_0x001c:
        r1 = r3.hasNext();
        if (r1 == 0) goto L_0x002d;
    L_0x0022:
        r1 = r3.next();
        r1 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r1;
        r1.onAnimationCancel(r4);
        if (r2 == 0) goto L_0x001c;
    L_0x002d:
        r1 = r0;
    L_0x002e:
        r0 = r4.mDelayAnim;	 Catch:{ IllegalStateException -> 0x007d }
        if (r0 == 0) goto L_0x0041;
    L_0x0032:
        r0 = r4.mDelayAnim;	 Catch:{ IllegalStateException -> 0x007f }
        r0 = r0.isRunning();	 Catch:{ IllegalStateException -> 0x007f }
        if (r0 == 0) goto L_0x0041;
    L_0x003a:
        r0 = r4.mDelayAnim;	 Catch:{ IllegalStateException -> 0x0081 }
        r0.cancel();	 Catch:{ IllegalStateException -> 0x0081 }
        if (r2 == 0) goto L_0x0062;
    L_0x0041:
        r0 = r4.mSortedNodes;	 Catch:{ IllegalStateException -> 0x0081 }
        r0 = r0.size();	 Catch:{ IllegalStateException -> 0x0081 }
        if (r0 <= 0) goto L_0x0062;
    L_0x0049:
        r0 = r4.mSortedNodes;
        r3 = r0.iterator();
    L_0x004f:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x0062;
    L_0x0055:
        r0 = r3.next();
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r0 = r0.animation;
        r0.cancel();
        if (r2 == 0) goto L_0x004f;
    L_0x0062:
        if (r1 == 0) goto L_0x0079;
    L_0x0064:
        r1 = r1.iterator();
    L_0x0068:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0079;
    L_0x006e:
        r0 = r1.next();
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r0;
        r0.onAnimationEnd(r4);
        if (r2 == 0) goto L_0x0068;
    L_0x0079:
        r0 = 0;
        r4.mStarted = r0;
    L_0x007c:
        return;
    L_0x007d:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x007f }
    L_0x007f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0081 }
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r1 = r0;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.cancel():void");
    }

    public Object clone() {
        return clone();
    }

    public AnimatorSet clone() {
        boolean z = a;
        AnimatorSet animatorSet = (AnimatorSet) super.clone();
        animatorSet.mNeedsSort = true;
        animatorSet.mTerminated = false;
        animatorSet.mStarted = false;
        animatorSet.mPlayingSet = new ArrayList();
        animatorSet.mNodeMap = new HashMap();
        animatorSet.mNodes = new ArrayList();
        animatorSet.mSortedNodes = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator it = this.mNodes.iterator();
        while (it.hasNext()) {
            Node node = (Node) it.next();
            Node clone = node.clone();
            hashMap.put(node, clone);
            animatorSet.mNodes.add(clone);
            animatorSet.mNodeMap.put(clone.animation, clone);
            clone.dependencies = null;
            clone.tmpDependencies = null;
            clone.nodeDependents = null;
            clone.nodeDependencies = null;
            ArrayList listeners = clone.animation.getListeners();
            if (listeners != null) {
                Iterator it2;
                Iterator it3 = listeners.iterator();
                ArrayList arrayList = null;
                while (it3.hasNext()) {
                    AnimatorListener animatorListener = (AnimatorListener) it3.next();
                    try {
                        if (animatorListener instanceof AnimatorSetListener) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(animatorListener);
                            continue;
                        }
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                    if (z) {
                        try {
                            boolean z2;
                            if (SherlockActivity.a) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            SherlockActivity.a = z2;
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                        if (arrayList == null) {
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                listeners.remove((AnimatorListener) it2.next());
                                if (z) {
                                    break;
                                    continue;
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
                if (arrayList == null) {
                    continue;
                } else {
                    it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        listeners.remove((AnimatorListener) it2.next());
                        if (z) {
                            break;
                            continue;
                        }
                    }
                    continue;
                }
            }
            if (z) {
                break;
            }
        }
        Iterator it4 = this.mNodes.iterator();
        while (it4.hasNext()) {
            node = (Node) it4.next();
            clone = (Node) hashMap.get(node);
            if (node.dependencies != null) {
                Iterator it5 = node.dependencies.iterator();
                while (it5.hasNext()) {
                    Dependency dependency = (Dependency) it5.next();
                    clone.addDependency(new Dependency((Node) hashMap.get(dependency.node), dependency.rule));
                    if (z) {
                        break;
                        continue;
                    }
                }
                continue;
            }
            if (z) {
                break;
            }
        }
        return animatorSet;
    }

    static boolean access$302(AnimatorSet animatorSet, boolean z) {
        animatorSet.mStarted = z;
        return z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void sortNodes() {
        /*
        r11_this = this;
        r3 = 0;
        r5 = a;
        r0 = r11.mNeedsSort;
        if (r0 == 0) goto L_0x00ad;
    L_0x0007:
        r0 = r11.mSortedNodes;
        r0.clear();
        r6 = new java.util.ArrayList;
        r6.<init>();
        r0 = r11.mNodes;
        r2 = r0.size();
        r1 = r3;
    L_0x0018:
        if (r1 >= r2) goto L_0x0035;
    L_0x001a:
        r0 = r11.mNodes;
        r0 = r0.get(r1);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r4 = r0.dependencies;	 Catch:{ IllegalStateException -> 0x00a5 }
        if (r4 == 0) goto L_0x002e;
    L_0x0026:
        r4 = r0.dependencies;	 Catch:{ IllegalStateException -> 0x00a7 }
        r4 = r4.size();	 Catch:{ IllegalStateException -> 0x00a7 }
        if (r4 != 0) goto L_0x0031;
    L_0x002e:
        r6.add(r0);	 Catch:{ IllegalStateException -> 0x00a7 }
    L_0x0031:
        r0 = r1 + 1;
        if (r5 == 0) goto L_0x0112;
    L_0x0035:
        r7 = new java.util.ArrayList;
        r7.<init>();
    L_0x003a:
        r0 = r6.size();
        if (r0 <= 0) goto L_0x008a;
    L_0x0040:
        r8 = r6.size();
        r4 = r3;
    L_0x0045:
        if (r4 >= r8) goto L_0x007f;
    L_0x0047:
        r0 = r6.get(r4);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r1 = r11.mSortedNodes;
        r1.add(r0);
        r1 = r0.nodeDependents;
        if (r1 == 0) goto L_0x007b;
    L_0x0056:
        r1 = r0.nodeDependents;
        r9 = r1.size();
        r2 = r3;
    L_0x005d:
        if (r2 >= r9) goto L_0x007b;
    L_0x005f:
        r1 = r0.nodeDependents;
        r1 = r1.get(r2);
        r1 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r1;
        r10 = r1.nodeDependencies;	 Catch:{ IllegalStateException -> 0x00a9 }
        r10.remove(r0);	 Catch:{ IllegalStateException -> 0x00a9 }
        r10 = r1.nodeDependencies;	 Catch:{ IllegalStateException -> 0x00a9 }
        r10 = r10.size();	 Catch:{ IllegalStateException -> 0x00a9 }
        if (r10 != 0) goto L_0x0077;
    L_0x0074:
        r7.add(r1);	 Catch:{ IllegalStateException -> 0x00a9 }
    L_0x0077:
        r1 = r2 + 1;
        if (r5 == 0) goto L_0x010f;
    L_0x007b:
        r0 = r4 + 1;
        if (r5 == 0) goto L_0x010c;
    L_0x007f:
        r6.clear();
        r6.addAll(r7);
        r7.clear();
        if (r5 == 0) goto L_0x003a;
    L_0x008a:
        r0 = 0;
        r11.mNeedsSort = r0;	 Catch:{ IllegalStateException -> 0x00a3 }
        r0 = r11.mSortedNodes;	 Catch:{ IllegalStateException -> 0x00a3 }
        r0 = r0.size();	 Catch:{ IllegalStateException -> 0x00a3 }
        r1 = r11.mNodes;	 Catch:{ IllegalStateException -> 0x00a3 }
        r1 = r1.size();	 Catch:{ IllegalStateException -> 0x00a3 }
        if (r0 == r1) goto L_0x00ab;
    L_0x009b:
        r0 = new java.lang.IllegalStateException;	 Catch:{ IllegalStateException -> 0x00a3 }
        r1 = z;	 Catch:{ IllegalStateException -> 0x00a3 }
        r0.<init>(r1);	 Catch:{ IllegalStateException -> 0x00a3 }
        throw r0;	 Catch:{ IllegalStateException -> 0x00a3 }
    L_0x00a3:
        r0 = move-exception;
        throw r0;
    L_0x00a5:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x00a7 }
    L_0x00a7:
        r0 = move-exception;
        throw r0;
    L_0x00a9:
        r0 = move-exception;
        throw r0;
    L_0x00ab:
        if (r5 == 0) goto L_0x0101;
    L_0x00ad:
        r0 = r11.mNodes;
        r6 = r0.size();
        r4 = r3;
    L_0x00b4:
        if (r4 >= r6) goto L_0x0101;
    L_0x00b6:
        r0 = r11.mNodes;
        r0 = r0.get(r4);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r1 = r0.dependencies;	 Catch:{ IllegalStateException -> 0x0102 }
        if (r1 == 0) goto L_0x00fb;
    L_0x00c2:
        r1 = r0.dependencies;	 Catch:{ IllegalStateException -> 0x0102 }
        r1 = r1.size();	 Catch:{ IllegalStateException -> 0x0102 }
        if (r1 <= 0) goto L_0x00fb;
    L_0x00ca:
        r1 = r0.dependencies;
        r7 = r1.size();
        r2 = r3;
    L_0x00d1:
        if (r2 >= r7) goto L_0x00fb;
    L_0x00d3:
        r1 = r0.dependencies;
        r1 = r1.get(r2);
        r1 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Dependency) r1;
        r8 = r0.nodeDependencies;	 Catch:{ IllegalStateException -> 0x0104 }
        if (r8 != 0) goto L_0x00e6;
    L_0x00df:
        r8 = new java.util.ArrayList;	 Catch:{ IllegalStateException -> 0x0104 }
        r8.<init>();	 Catch:{ IllegalStateException -> 0x0104 }
        r0.nodeDependencies = r8;	 Catch:{ IllegalStateException -> 0x0104 }
    L_0x00e6:
        r8 = r0.nodeDependencies;	 Catch:{ IllegalStateException -> 0x0106 }
        r9 = r1.node;	 Catch:{ IllegalStateException -> 0x0106 }
        r8 = r8.contains(r9);	 Catch:{ IllegalStateException -> 0x0106 }
        if (r8 != 0) goto L_0x00f7;
    L_0x00f0:
        r8 = r0.nodeDependencies;	 Catch:{ IllegalStateException -> 0x0106 }
        r1 = r1.node;	 Catch:{ IllegalStateException -> 0x0106 }
        r8.add(r1);	 Catch:{ IllegalStateException -> 0x0106 }
    L_0x00f7:
        r1 = r2 + 1;
        if (r5 == 0) goto L_0x010a;
    L_0x00fb:
        r0.done = r3;
        r0 = r4 + 1;
        if (r5 == 0) goto L_0x0108;
    L_0x0101:
        return;
    L_0x0102:
        r0 = move-exception;
        throw r0;
    L_0x0104:
        r0 = move-exception;
        throw r0;
    L_0x0106:
        r0 = move-exception;
        throw r0;
    L_0x0108:
        r4 = r0;
        goto L_0x00b4;
    L_0x010a:
        r2 = r1;
        goto L_0x00d1;
    L_0x010c:
        r4 = r0;
        goto L_0x0045;
    L_0x010f:
        r2 = r1;
        goto L_0x005d;
    L_0x0112:
        r1 = r0;
        goto L_0x0018;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.sortNodes():void");
    }

    static ArrayList access$200(AnimatorSet animatorSet) {
        return animatorSet.mSortedNodes;
    }

    static HashMap access$100(AnimatorSet animatorSet) {
        return animatorSet.mNodeMap;
    }

    static ArrayList access$000(AnimatorSet animatorSet) {
        return animatorSet.mPlayingSet;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void start() {
        /*
        r14_this = this;
        r12 = 0;
        r2 = 0;
        r5 = a;
        r14.mTerminated = r2;
        r0 = 1;
        r14.mStarted = r0;
        r14.sortNodes();
        r0 = r14.mSortedNodes;
        r6 = r0.size();
        r3 = r2;
    L_0x0014:
        if (r3 >= r6) goto L_0x0054;
    L_0x0016:
        r0 = r14.mSortedNodes;
        r0 = r0.get(r3);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r1 = r0.animation;
        r1 = r1.getListeners();
        if (r1 == 0) goto L_0x0050;
    L_0x0026:
        r4 = r1.size();	 Catch:{ IllegalStateException -> 0x012d }
        if (r4 <= 0) goto L_0x0050;
    L_0x002c:
        r4 = new java.util.ArrayList;
        r4.<init>(r1);
        r4 = r4.iterator();
    L_0x0035:
        r1 = r4.hasNext();
        if (r1 == 0) goto L_0x0050;
    L_0x003b:
        r1 = r4.next();
        r1 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r1;
        r7 = r1 instanceof com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.DependencyListener;	 Catch:{ IllegalStateException -> 0x012f }
        if (r7 != 0) goto L_0x0049;
    L_0x0045:
        r7 = r1 instanceof com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.AnimatorSetListener;	 Catch:{ IllegalStateException -> 0x0131 }
        if (r7 == 0) goto L_0x004e;
    L_0x0049:
        r7 = r0.animation;	 Catch:{ IllegalStateException -> 0x0131 }
        r7.removeListener(r1);	 Catch:{ IllegalStateException -> 0x0131 }
    L_0x004e:
        if (r5 == 0) goto L_0x0035;
    L_0x0050:
        r0 = r3 + 1;
        if (r5 == 0) goto L_0x016a;
    L_0x0054:
        r7 = new java.util.ArrayList;
        r7.<init>();
        r4 = r2;
    L_0x005a:
        if (r4 >= r6) goto L_0x00b8;
    L_0x005c:
        r0 = r14.mSortedNodes;
        r0 = r0.get(r4);
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r1 = r14.mSetListener;	 Catch:{ IllegalStateException -> 0x0133 }
        if (r1 != 0) goto L_0x006f;
    L_0x0068:
        r1 = new com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet$AnimatorSetListener;	 Catch:{ IllegalStateException -> 0x0133 }
        r1.<init>(r14, r14);	 Catch:{ IllegalStateException -> 0x0133 }
        r14.mSetListener = r1;	 Catch:{ IllegalStateException -> 0x0133 }
    L_0x006f:
        r1 = r0.dependencies;	 Catch:{ IllegalStateException -> 0x0135 }
        if (r1 == 0) goto L_0x007b;
    L_0x0073:
        r1 = r0.dependencies;	 Catch:{ IllegalStateException -> 0x0137 }
        r1 = r1.size();	 Catch:{ IllegalStateException -> 0x0137 }
        if (r1 != 0) goto L_0x0080;
    L_0x007b:
        r7.add(r0);	 Catch:{ IllegalStateException -> 0x0137 }
        if (r5 == 0) goto L_0x00ad;
    L_0x0080:
        r1 = r0.dependencies;
        r8 = r1.size();
        r3 = r2;
    L_0x0087:
        if (r3 >= r8) goto L_0x00a3;
    L_0x0089:
        r1 = r0.dependencies;
        r1 = r1.get(r3);
        r1 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Dependency) r1;
        r9 = r1.node;
        r9 = r9.animation;
        r10 = new com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet$DependencyListener;
        r1 = r1.rule;
        r10.<init>(r14, r0, r1);
        r9.addListener(r10);
        r1 = r3 + 1;
        if (r5 == 0) goto L_0x0167;
    L_0x00a3:
        r1 = r0.dependencies;
        r1 = r1.clone();
        r1 = (java.util.ArrayList) r1;
        r0.tmpDependencies = r1;
    L_0x00ad:
        r0 = r0.animation;
        r1 = r14.mSetListener;
        r0.addListener(r1);
        r0 = r4 + 1;
        if (r5 == 0) goto L_0x0164;
    L_0x00b8:
        r0 = r14.mStartDelay;
        r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1));
        if (r0 > 0) goto L_0x0139;
    L_0x00be:
        r1 = r7.iterator();
    L_0x00c2:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00dc;
    L_0x00c8:
        r0 = r1.next();
        r0 = (com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.Node) r0;
        r3 = r0.animation;
        r3.start();
        r3 = r14.mPlayingSet;
        r0 = r0.animation;
        r3.add(r0);
        if (r5 == 0) goto L_0x00c2;
    L_0x00dc:
        r0 = r14.mListeners;
        if (r0 == 0) goto L_0x00fc;
    L_0x00e0:
        r0 = r14.mListeners;
        r0 = r0.clone();
        r0 = (java.util.ArrayList) r0;
        r4 = r0.size();
        r3 = r2;
    L_0x00ed:
        if (r3 >= r4) goto L_0x00fc;
    L_0x00ef:
        r1 = r0.get(r3);
        r1 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r1;
        r1.onAnimationStart(r14);
        r1 = r3 + 1;
        if (r5 == 0) goto L_0x0162;
    L_0x00fc:
        r0 = r14.mNodes;	 Catch:{ IllegalStateException -> 0x015c }
        r0 = r0.size();	 Catch:{ IllegalStateException -> 0x015c }
        if (r0 != 0) goto L_0x012c;
    L_0x0104:
        r0 = r14.mStartDelay;	 Catch:{ IllegalStateException -> 0x015e }
        r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1));
        if (r0 != 0) goto L_0x012c;
    L_0x010a:
        r0 = 0;
        r14.mStarted = r0;	 Catch:{ IllegalStateException -> 0x015e }
        r0 = r14.mListeners;	 Catch:{ IllegalStateException -> 0x015e }
        if (r0 == 0) goto L_0x012c;
    L_0x0111:
        r0 = r14.mListeners;
        r0 = r0.clone();
        r0 = (java.util.ArrayList) r0;
        r3 = r0.size();
    L_0x011d:
        if (r2 >= r3) goto L_0x012c;
    L_0x011f:
        r1 = r0.get(r2);
        r1 = (com.actionbarsherlock.internal.nineoldandroids.animation.Animator.AnimatorListener) r1;
        r1.onAnimationEnd(r14);
        r1 = r2 + 1;
        if (r5 == 0) goto L_0x0160;
    L_0x012c:
        return;
    L_0x012d:
        r0 = move-exception;
        throw r0;
    L_0x012f:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0131 }
    L_0x0131:
        r0 = move-exception;
        throw r0;
    L_0x0133:
        r0 = move-exception;
        throw r0;
    L_0x0135:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x0137 }
    L_0x0137:
        r0 = move-exception;
        throw r0;
    L_0x0139:
        r0 = 2;
        r0 = new float[r0];
        r0 = new int[]{0, 1065353216};
        r0 = com.actionbarsherlock.internal.nineoldandroids.animation.ValueAnimator.ofFloat(r0);
        r14.mDelayAnim = r0;
        r0 = r14.mDelayAnim;
        r8 = r14.mStartDelay;
        r0.setDuration(r8);
        r0 = r14.mDelayAnim;
        r1 = new com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet$1;
        r1.<init>(r14, r7);
        r0.addListener(r1);
        r0 = r14.mDelayAnim;
        r0.start();
        goto L_0x00dc;
    L_0x015c:
        r0 = move-exception;
        throw r0;	 Catch:{ IllegalStateException -> 0x015e }
    L_0x015e:
        r0 = move-exception;
        throw r0;
    L_0x0160:
        r2 = r1;
        goto L_0x011d;
    L_0x0162:
        r3 = r1;
        goto L_0x00ed;
    L_0x0164:
        r4 = r0;
        goto L_0x005a;
    L_0x0167:
        r3 = r1;
        goto L_0x0087;
    L_0x016a:
        r3 = r0;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.actionbarsherlock.internal.nineoldandroids.animation.AnimatorSet.start():void");
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public Animator clone() {
        return clone();
    }
}
