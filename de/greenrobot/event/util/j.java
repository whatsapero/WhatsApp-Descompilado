package de.greenrobot.event.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public class j extends h {
    public j(d dVar) {
        super(dVar);
    }

    protected Object a(b bVar, Bundle bundle) {
        return a(bVar, bundle);
    }

    protected Fragment a(b bVar, Bundle bundle) {
        Fragment errorDialogFragments$Support = new ErrorDialogFragments$Support();
        errorDialogFragments$Support.setArguments(bundle);
        return errorDialogFragments$Support;
    }
}
