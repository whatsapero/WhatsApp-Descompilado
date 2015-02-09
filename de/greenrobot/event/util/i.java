package de.greenrobot.event.util;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;

@TargetApi(11)
public class i extends h {
    protected Fragment a(b bVar, Bundle bundle) {
        Fragment errorDialogFragments$Honeycomb = new ErrorDialogFragments$Honeycomb();
        errorDialogFragments$Honeycomb.setArguments(bundle);
        return errorDialogFragments$Honeycomb;
    }

    public i(d dVar) {
        super(dVar);
    }

    protected Object a(b bVar, Bundle bundle) {
        return a(bVar, bundle);
    }
}
