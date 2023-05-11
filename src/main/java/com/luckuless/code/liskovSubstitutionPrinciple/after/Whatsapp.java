package com.luckuless.code.liskovSubstitutionPrinciple.after;

public class Whatsapp implements ISocialMedia, IVideoCallManager {

    @Override
    public void groupVideoCall(String... users) {
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
