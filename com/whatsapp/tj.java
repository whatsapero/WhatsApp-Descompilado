package com.whatsapp;

class tj implements Runnable {
    final az5 a;

    public void run() {
        GroupChatRecentLocationsActivity.b(this.a.a).getController().animateTo(GroupChatRecentLocationsActivity.i(this.a.a).getMyLocation());
        GroupChatRecentLocationsActivity.b(this.a.a).getController().setZoom(17);
        this.a.a.runOnUiThread(new avd(this));
    }

    tj(az5 com_whatsapp_az5) {
        this.a = com_whatsapp_az5;
    }
}
