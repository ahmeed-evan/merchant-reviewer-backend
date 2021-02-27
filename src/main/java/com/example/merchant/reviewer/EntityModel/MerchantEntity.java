package com.example.merchant.reviewer.EntityModel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "MERCHANTS")
public class MerchantEntity {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "Merchant_Id", length = 50)
    private String merchantId;

    @Column(name = "Merchant_BusinessName", nullable = false)
    private String merchantBusinessName;

    @Column(name = "Merchant_FacebookLink", nullable = false)
    private String merchantFacebookLink;

    @Column(name = "Merchant_Address")
    private String merchantAddress;

    @Column(name = "Merchant_Email", nullable = false, length = 120)
    private String merchantEmail;

    @Column(name = "Merchant_PhoneNumber", nullable = false, length = 20)
    private String merchantPhoneNumber;

    @Column(name = "Merchant_Review")
    private double merchantReview = 0;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public String getMerchantFacebookLink() {
        return merchantFacebookLink;
    }

    public void setMerchantFacebookLink(String merchantFacebookLink) {
        this.merchantFacebookLink = merchantFacebookLink;
    }

    public String getMerchantAddress() {
        return merchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    public String getMerchantEmail() {
        return merchantEmail;
    }

    public void setMerchantEmail(String merchantEmail) {
        this.merchantEmail = merchantEmail;
    }

    public String getMerchantPhoneNumber() {
        return merchantPhoneNumber;
    }

    public void setMerchantPhoneNumber(String merchantPhoneNumber) {
        this.merchantPhoneNumber = merchantPhoneNumber;
    }

    public double getMerchantReview() {
        return merchantReview;
    }

    public void setMerchantReview(double merchantReview) {
        this.merchantReview = merchantReview;
    }

}
