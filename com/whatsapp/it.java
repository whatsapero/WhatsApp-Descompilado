package com.whatsapp;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ListView;
import com.actionbarsherlock.R;

class it extends PagerAdapter {
    final c_ a;

    public boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    it(c_ c_Var, m5 m5Var) {
        this(c_Var);
    }

    public int getCount() {
        return c_.f(this.a).length;
    }

    public void destroyItem(View view, int i, Object obj) {
        ((ViewPager) view).removeView((View) obj);
    }

    public Object instantiateItem(View view, int i) {
        View inflate = c_.c(this.a).inflate(R.layout.emoji_list, null);
        ListView listView = (ListView) inflate.findViewById(16908298);
        if (!App.as()) {
            i = (c_.f(this.a).length - 1) - i;
        }
        if (c_.f(this.a)[i] == null) {
            c_.f(this.a)[i] = new xy(this.a, c_.b(this.a), i);
        }
        listView.setAdapter(c_.f(this.a)[i]);
        listView.setEmptyView(inflate.findViewById(16908292));
        ((ViewPager) view).addView(inflate, 0);
        return inflate;
    }

    private it(c_ c_Var) {
        this.a = c_Var;
    }
}
