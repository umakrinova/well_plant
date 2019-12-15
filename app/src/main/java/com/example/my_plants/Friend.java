package com.example.my_plants;

public class Friend {
    public final String name;
    private final int imageResource;
    private final String imageUrl;

    public Friend(String name, int imageResource, String imageUrl) {
        this.name = name;
        this.imageResource = imageResource;
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}

