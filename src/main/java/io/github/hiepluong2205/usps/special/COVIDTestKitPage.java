package io.github.hiepluong2205.usps.special;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class COVIDTestKitPage {
    private String url = "https://special.usps.com/testkits";
    @FindBy(xpath = "")
    WebElement txtContactFirstName;
    @FindBy(xpath = "")
    WebElement txtContactLastName;
    @FindBy(xpath = "")
    WebElement txtContactEmail;
    @FindBy(xpath = "")
    WebElement txtShippingFirstName;
    @FindBy(xpath = "")
    WebElement txtShippingLastName;
    @FindBy(xpath = "")
    WebElement txtShippingStreetAddress;

    public void setShippingDetails() {
    }

    public void setContactDetails() {
    }
}
