package com.whatsapp;

class p_ implements Runnable {
    final GroupChatLiveLocationsActivity a;

    public void run() {
        if (GroupChatLiveLocationsActivity.g(this.a).i.size() == 0) {
            GroupChatLiveLocationsActivity.c(this.a).a(GroupChatLiveLocationsActivity.b(this.a).getMyLocation());
        }
    }

    p_(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.a = groupChatLiveLocationsActivity;
    }
}
