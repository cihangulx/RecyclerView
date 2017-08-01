package com.cihangul.recylerview;

/**
 * Created by Cihan on 25.06.2017.
 */

public class Item {
    private String image;
    private String text;

    public Item(String image, String text) {
        this.image = image;
        this.text = text;
    }

    public Item() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
