package com.gst.app.entity;

import java.util.Date;

public class IRNGeneration {

    private Long ackNo;
    private String ackDt;
    private String irn;
    private String signedInvoice;
    private String signedQRCode;
    private String status;
    private Long ewbNo;
    private String ewbDt;
    private String ewbValidTill;

    public  IRNGeneration() {}

    public  IRNGeneration(Long ackNo, String ackDt, String irn, String signedInvoice, String signedQRCode, String status, Long ewbNo, String ewbDt, String ewbValidTill) {

        this.ackNo = ackNo;
        this.ackDt = ackDt;
        this.irn = irn;
        this.signedInvoice = signedInvoice;
        this.signedQRCode = signedQRCode;
        this.status = status;
        this.ewbNo = ewbNo;
        this.ewbDt = ewbDt;
        this.ewbValidTill = ewbValidTill;

    }

    public Long getAckNo() {
        return ackNo;
    }

    public void setAckNo(Long ackNo) {
        this.ackNo = ackNo;
    }

    public String getAckDt() {
        return ackDt;
    }

    public void setAckDt(String ackDt) {
        this.ackDt = ackDt;
    }

    public String getIrn() {
        return irn;
    }

    public void setIrn(String irn) {
        this.irn = irn;
    }

    public String getSignedInvoice() {
        return signedInvoice;
    }

    public void setSignedInvoice(String signedInvoice) {
        this.signedInvoice = signedInvoice;
    }

    public String getSignedQRCode() {
        return signedQRCode;
    }

    public void setSignedQRCode(String signedQRCode) {
        this.signedQRCode = signedQRCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getEwbNo() {
        return ewbNo;
    }

    public void setEwbNo(Long ewbNo) {
        this.ewbNo = ewbNo;
    }

    public String getEwbDt() {
        return ewbDt;
    }

    public void setEwbDt(String ewbDt) {
        this.ewbDt = ewbDt;
    }

    public String getEwbValidTill() {
        return ewbValidTill;
    }

    public void setEwbValidTill(String ewbValidTill) {
        this.ewbValidTill = ewbValidTill;
    }
}

