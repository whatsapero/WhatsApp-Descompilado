package com.whatsapp;

class gx implements Runnable {
    final m8 a;
    final ContactsFragment b;

    gx(ContactsFragment contactsFragment, m8 m8Var) {
        this.b = contactsFragment;
        this.a = m8Var;
    }

    public void run() {
        try {
            Thread.sleep(300);
            App.a(this.b.getActivity(), false, this.a.e);
        } catch (InterruptedException e) {
        }
    }
}
