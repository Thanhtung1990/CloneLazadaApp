package com.tung.volleyrestapi.model;

public class DiscountItems {

    private String imageDiscount, percentDiscount;
    private long PriceAfterDiscount;
    private long SoldAmount;

    public DiscountItems(String imageDiscount, String percentDiscount, long priceAfterDiscount, long soldAmount) {
        this.imageDiscount = imageDiscount;
        this.percentDiscount = percentDiscount;
        PriceAfterDiscount = priceAfterDiscount;
        SoldAmount = soldAmount;
    }

    public String getImageDiscount() {
        return imageDiscount;
    }

    public void setImageDiscount(String imageDiscount) {
        this.imageDiscount = imageDiscount;
    }

    public String getPercentDiscount() {
        return percentDiscount;
    }

    public void setPercentDiscount(String percentDiscount) {
        this.percentDiscount = percentDiscount;
    }

    public long getPriceAfterDiscount() {
        return PriceAfterDiscount;
    }

    public void setPriceAfterDiscount(long priceAfterDiscount) {
        PriceAfterDiscount = priceAfterDiscount;
    }

    public long getSoldAmount() {
        return SoldAmount;
    }

    public void setSoldAmount(long soldAmount) {
        SoldAmount = soldAmount;
    }
}
