package com.whatsapp.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.actionbarsherlock.R;

public class WaPrivacyPreference extends WaListPreference {
    private ProgressBar b;
    private boolean c;

    public WaPrivacyPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onBindView(View view) {
        super.onBindView(view);
        this.b = (ProgressBar) view.findViewById(R.id.privacy_progress);
        this.b.setVisibility(this.c ? 0 : 8);
    }

    public WaPrivacyPreference(Context context) {
        super(context);
    }

    public void a(boolean z) {
        this.c = z;
        if (this.b != null) {
            this.b.setVisibility(this.c ? 0 : 8);
        }
    }
}
