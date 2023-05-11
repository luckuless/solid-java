package com.luckuless.code.liskovSubstitutionPrinciple.before;

public class Whatsapp extends SocialMedia {

    @Override
    public void chatWithFriend() {
        // logic
    }

    @Override
    public void publishPost(Object post) {
        throw new UnsupportedOperationException("Unimplemented method 'publishPost'");
    }

    @Override
    public void sendPhotosAndVideos() {
         // logic
    }

    @Override
    public void groupVideoCall(String... users) {
         // logic
    }
    
}
