package com.example.lab5st200524536;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class MobilePhoneViewController implements Initializable{
    @FXML
    private ImageView phoneImage;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        MobilePhone mobilePhone = new MobilePhone("VivoV23");
        phoneImage.setImage(mobilePhone.getPhoneImage());
    }
}
