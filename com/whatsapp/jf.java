package com.whatsapp;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.whatsapp.ConversationsFragment.EmailConversationMediaChoiceDialogFragment;

class jf implements OnClickListener {
    final EmailConversationMediaChoiceDialogFragment a;
    final m8 b;

    jf(EmailConversationMediaChoiceDialogFragment emailConversationMediaChoiceDialogFragment, m8 m8Var) {
        this.a = emailConversationMediaChoiceDialogFragment;
        this.b = m8Var;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.a.dismiss();
        Conversation.a(this.a.getActivity(), (ho) this.a.getActivity(), this.b, false);
    }
}
