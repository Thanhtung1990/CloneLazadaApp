package com.tung.volleyrestapi.model;

import java.util.List;

public class ShoeItem {

    private String shoeName, shoeBrandName;
    private String shoeImgURL, shoeCode, shoeStatus, tags;
    private double shoePrice;
    private List<String> listImgURL;

    // constructor
    public ShoeItem(String shoeName, String shoeBrandName, String shoeCode, double shoePrice, String shoeStatus, String tags, String shoeImgURL, List<String> listImgURL) {
        this.shoeName = shoeName;
        this.shoeBrandName = shoeBrandName;
        this.shoeImgURL = shoeImgURL;
        this.shoeCode = shoeCode;
        this.shoeStatus = shoeStatus;
        this.tags = tags;
        this.shoePrice = shoePrice;
        this.listImgURL = listImgURL;
    }


    public String getShoeName() {
        return shoeName;
    }

    public void setShoeName(String shoeName) {
        this.shoeName = shoeName;
    }

    public String getShoeBrandName() {
        return shoeBrandName;
    }

    public void setShoeBrandName(String shoeBrandName) {
        this.shoeBrandName = shoeBrandName;
    }

    public String getShoeImgURL() {
        return shoeImgURL;
    }

    public void setShoeImgURL(String shoeImgURL) {
        this.shoeImgURL = shoeImgURL;
    }

    public String getShoeCode() {
        return shoeCode;
    }

    public void setShoeCode(String shoeCode) {
        this.shoeCode = shoeCode;
    }

    public String getShoeStatus() {
        return shoeStatus;
    }

    public void setShoeStatus(String shoeStatus) {
        this.shoeStatus = shoeStatus;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public double getShoePrice() {
        return shoePrice;
    }

    public void setShoePrice(double shoePrice) {
        this.shoePrice = shoePrice;
    }

    public List<String> getListImgURL() {
        return listImgURL;
    }

    public void setListImgURL(List<String> listImgURL) {
        this.listImgURL = listImgURL;
    }
}
