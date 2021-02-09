package com.example.cprogrammingresoursces;

public class ImageInformation {
    String name,desc;
    int image;

    public ImageInformation(String name, String desc, int image) {
        this.name = name;
        this.desc = desc;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public int getImage() {
        return image;
    }
}
