package com.luckuless.code.liskovSubstitutionPrinciple.after;

public class Facebook implements ISocialMedia, ISocialPostAndMediaManager, IVideoCallManager {

    @Override
    public void groupVideoCall(String... users) {
        // logic
    }

    @Override
    public void publishPost(Object post) {
        // logic
    }

    @Override
    public void chatWithFriend() {
        // logic
    }

    @Override
    public void sendPhotosAndVideos() {
        // logic
    }
    
}
