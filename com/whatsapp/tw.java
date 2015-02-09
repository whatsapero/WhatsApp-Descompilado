package com.whatsapp;

class tw implements Runnable {
    final anc a;

    tw(anc com_whatsapp_anc) {
        this.a = com_whatsapp_anc;
    }

    public void run() {
        GroupChatLiveLocationsActivity.c(this.a.a).getController().animateTo(GroupChatLiveLocationsActivity.b(this.a.a).getMyLocation());
        if (GroupChatLiveLocationsActivity.c(this.a.a).getZoomLevel() < 17) {
            GroupChatLiveLocationsActivity.c(this.a.a).getController().setZoom(17);
        }
    }
}
