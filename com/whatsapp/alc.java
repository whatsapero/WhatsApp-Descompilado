package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.EmailConversationMediaChoiceDialogFragment;

class alc implements OnClickListener {
    final m8 a;
    final EmailConversationMediaChoiceDialogFragment b;

    public void onClick(DialogInterface dialogInterface, int i) {
        this.b.dismiss();
        Conversation.a(this.b.getActivity(), (ho) this.b.getActivity(), this.a, true);
    }

    alc(EmailConversationMediaChoiceDialogFragment emailConversationMediaChoiceDialogFragment, m8 m8Var) {
        this.b = emailConversationMediaChoiceDialogFragment;
        this.a = m8Var;
    }
}
