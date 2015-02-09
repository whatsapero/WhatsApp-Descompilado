package com.google.android.gms.tagmanager;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class PreviewActivity extends Activity {
    private void d(String str, String str2, String str3) {
        AlertDialog create = new Builder(this).create();
        create.setTitle(str);
        create.setMessage(str2);
        create.setButton(-1, str3, new OnClickListener() {
            final PreviewActivity asl;

            {
                this.asl = r1;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        create.show();
    }

    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            bh.U("Preview activity");
            Uri data = getIntent().getData();
            if (!TagManager.getInstance(this).i(data)) {
                String str = "Cannot preview the app with the uri: " + data + ". Launching current version instead.";
                bh.W(str);
                d("Preview failure", str, "Continue");
            }
            Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
            if (launchIntentForPackage != null) {
                bh.U("Invoke the launch activity for package name: " + getPackageName());
                startActivity(launchIntentForPackage);
                if (DataLayer.a == 0) {
                    return;
                }
            }
            bh.U("No launch activity found for package name: " + getPackageName());
        } catch (Exception e) {
            throw e;
        } catch (Exception e2) {
            bh.T("Calling preview threw an exception: " + e2.getMessage());
        }
    }
}
