package android.support.v4.view;

import android.content.Context;
import android.support.v4.app.NotificationCompatApi21.Builder;
import android.support.v4.app.RemoteInputCompatBase.RemoteInput;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

class PagerTitleStripIcs {

    class SingleLineAllCapsTransform extends SingleLineTransformationMethod {
        private Locale mLocale;

        public SingleLineAllCapsTransform(Context context) {
            boolean z = Builder.a;
            this.mLocale = context.getResources().getConfiguration().locale;
            if (RemoteInput.a != 0) {
                Builder.a = !z;
            }
        }

        public CharSequence getTransformation(CharSequence charSequence, View view) {
            boolean z = Builder.a;
            CharSequence transformation = super.getTransformation(charSequence, view);
            transformation = transformation != null ? transformation.toString().toUpperCase(this.mLocale) : null;
            if (z) {
                RemoteInput.a++;
            }
            return transformation;
        }
    }

    public static void setSingleLineAllCaps(TextView textView) {
        textView.setTransformationMethod(new SingleLineAllCapsTransform(textView.getContext()));
    }
}
