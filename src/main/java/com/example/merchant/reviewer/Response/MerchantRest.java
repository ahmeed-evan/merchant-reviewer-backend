package com.example.merchant.reviewer.Response;

import java.io.Serializable;

public class MerchantRest implements Serializable {

    private static final long serialVersionUID = 5528984191649173845L;
    private String merchantId;
    private String merchantBusinessName;
    private String merchantPhoneNumber;
    private String merchantAddress;
    private double merchantReview;

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getMerchantBusinessName() {
        return merchantBusinessName;
    }

    public void setMerchantBusinessName(String merchantBusinessName) {
        this.merchantBusinessName = merchantBusinessName;
    }

    public String getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    public void setMerchantPhoneNumber(String merchantPhoneNumber) {
        this.merchantPhoneNumber = merchantPhoneNumber;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public double getMerchantReview() {
        return merchantReview;
    }

    public void setMerchantReview(double merchantReview) {
        this.merchantReview = merchantReview;
    }
}
