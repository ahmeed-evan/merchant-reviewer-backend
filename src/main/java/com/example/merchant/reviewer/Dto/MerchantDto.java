package com.example.merchant.reviewer.Dto;

import java.io.Serializable;

public class MerchantDto {

    private String merchantId;
    private String merchantBusinessName;
    private String merchantPhoneNumber;
    private String merchantAddress;
    private String merchantEmail;
    private double merchantReview;
    private String merchantFacebookLink;

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

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
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

    public String getMerchantFacebookLink() {
        return merchantFacebookLink;
    }

    public void setMerchantFacebookLink(String merchantFacebookLink) {
        this.merchantFacebookLink = merchantFacebookLink;
    }
}
