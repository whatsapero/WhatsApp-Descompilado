package com.actionbarsherlock.internal.nineoldandroids.animation;

import java.util.ArrayList;

public abstract class Animator implements Cloneable {
    public static boolean a;
    ArrayList mListeners;

    public interface AnimatorListener {
        void onAnimationCancel(Animator animator);

        void onAnimationEnd(Animator animator);

        void onAnimationRepeat(Animator animator);

        void onAnimationStart(Animator animator);
    }

    public Animator clone() {
        boolean z = a;
        try {
            Animator animator = (Animator) super.clone();
            if (this.mListeners != null) {
                ArrayList arrayList = this.mListeners;
                animator.mListeners = new ArrayList();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    animator.mListeners.add(arrayList.get(i));
                    i++;
                    if (z) {
                        break;
                    }
                }
            }
            return animator;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Animator() {
        this.mListeners = null;
    }

    public ArrayList getListeners() {
        return this.mListeners;
    }

    public void end() {
    }

    public void cancel() {
    }

    public void start() {
    }

    public void removeListener(AnimatorListener animatorListener) {
        if (this.mListeners != null) {
            this.mListeners.remove(animatorListener);
            if (this.mListeners.size() == 0) {
                this.mListeners = null;
            }
        }
    }

    public Object clone() {
        return clone();
    }

    public void addListener(AnimatorListener animatorListener) {
        if (this.mListeners == null) {
            this.mListeners = new ArrayList();
        }
        this.mListeners.add(animatorListener);
    }
}
