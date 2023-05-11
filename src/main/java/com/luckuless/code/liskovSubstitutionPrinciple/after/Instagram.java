package com.luckuless.code.liskovSubstitutionPrinciple.after;

public class Instagram implements ISocialMedia, ISocialPostAndMediaManager {

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
