package com.example.merchant.reviewer.RequestModel;

import java.io.Serializable;

public class MerchantDetails implements Serializable {

    private static final long serialVersionUID = 1098926981689410145L;

    private String merchantBusinessName;
    private String merchantPhoneNumber;
    private String merchantAddress;
    private String merchantEmail;
    private String merchantFacebookLink;

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

    public String getMerchantFacebookLink() {
        return merchantFacebookLink;
    }

    public void setMerchantFacebookLink(String merchantFacebookLink) {
        this.merchantFacebookLink = merchantFacebookLink;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

}
