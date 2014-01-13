package org.jboss.aerogear.integration.model;

public class Developer {

    private String name;
    private String twitter;
    private String photoURL;

    public Developer(String name, String twitter, String photoURL) {
        this.name = name;
        this.twitter = twitter;
        this.photoURL = photoURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getPhotoURL() {
        return photoURL;
    }

    public void setPhotoURL(String photoURL) {
        this.photoURL = photoURL;
    }

}
