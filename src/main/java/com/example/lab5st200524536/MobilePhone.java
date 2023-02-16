package com.example.lab5st200524536;
import javafx.scene.image.Image;

public class MobilePhone {
    private String phoneName;
    private String imagePath;

    public MobilePhone(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Image getPhoneImage(){

        return new Image(MobilePhone.class.getResourceAsStream(imagePath));
    }
}
