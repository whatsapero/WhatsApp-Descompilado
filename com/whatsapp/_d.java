package com.whatsapp;

import android.view.View;
import android.view.View.OnClickListener;
import com.actionbarsherlock.R;

class _d implements OnClickListener {
    final DescribeProblemActivity a;

    _d(DescribeProblemActivity describeProblemActivity) {
        this.a = describeProblemActivity;
    }

    public void onClick(View view) {
        int i = App.az;
        int length = DescribeProblemActivity.b(this.a).getText().toString().trim().getBytes().length;
        if (length < 10) {
            if (length == 0) {
                App.a(this.a.getBaseContext(), this.a.getString(R.string.describe_problem_description), 0);
                if (i == 0) {
                    return;
                }
            }
            App.a(this.a.getBaseContext(), this.a.getString(R.string.describe_problem_description_further), 0);
            if (i == 0) {
                return;
            }
        }
        DescribeProblemActivity.f(this.a).j = DescribeProblemActivity.b(this.a).getText().toString().trim();
        a5w.a(DescribeProblemActivity.g(this.a), new Void[0]);
    }
}
