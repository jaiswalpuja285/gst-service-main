package com.gst.app.entity;

public class GSTDetail {

    private String gstin;
    private String tradeName;
    private String legalName;
    private String addrBnm;
    private String addrBno;
    private String addrFlno;
    private String addrSt;
    private String addrLoc;
    private Long stateCode;
    private Long addrPncd;
    private String txpType;
    private String status;
    private String blkStatus;
    private String dtReg;
    private String dtDReg;

    public GSTDetail() {}

    public GSTDetail(String gstin, String tradeName, String legalName, String addrBnm, String addrBno, String addrFlno, String addrSt, String addrLoc, Long stateCode, Long addrPncd, String txpType, String status, String blkStatus, String dtReg, String dtDReg) {
        this.gstin = gstin;
        this.tradeName = tradeName;
        this.legalName = legalName;
        this.addrBnm = addrBnm;
        this.addrBno = addrBno;
        this.addrFlno = addrFlno;
        this.addrSt = addrSt;
        this.addrLoc = addrLoc;
        this.stateCode = stateCode;
        this.addrPncd = addrPncd;
        this.txpType = txpType;
        this.status = status;
        this.blkStatus = blkStatus;
        this.dtReg = dtReg;
        this.dtDReg = dtDReg;
    }

    public String getGstin() {
        return gstin;
    }

    public void setGstin(String gstin) {
        this.gstin = gstin;
    }

    public String getTradeName() {
        return tradeName;
    }

    public void setTradeName(String tradeName) {
        this.tradeName = tradeName;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getAddrBnm() {
        return addrBnm;
    }

    public void setAddrBnm(String addrBnm) {
        this.addrBnm = addrBnm;
    }

    public String getAddrBno() {
        return addrBno;
    }

    public void setAddrBno(String addrBno) {
        this.addrBno = addrBno;
    }

    public String getAddrFlno() {
        return addrFlno;
    }

    public void setAddrFlno(String addrFlno) {
        this.addrFlno = addrFlno;
    }

    public String getAddrSt() {
        return addrSt;
    }

    public void setAddrSt(String addrSt) {
        this.addrSt = addrSt;
    }

    public String getAddrLoc() {
        return addrLoc;
    }

    public void setAddrLoc(String addrLoc) {
        this.addrLoc = addrLoc;
    }

    public Long getStateCode() {
        return stateCode;
    }

    public void setStateCode(Long stateCode) {
        this.stateCode = stateCode;
    }

    public Long getAddrPncd() {
        return addrPncd;
    }

    public void setAddrPncd(Long addrPncd) {
        this.addrPncd = addrPncd;
    }

    public String getTxpType() {
        return txpType;
    }

    public void setTxpType(String txpType) {
        this.txpType = txpType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBlkStatus() {
        return blkStatus;
    }

    public void setBlkStatus(String blkStatus) {
        this.blkStatus = blkStatus;
    }

    public String getDtReg() {
        return dtReg;
    }

    public void setDtReg(String dtReg) {
        this.dtReg = dtReg;
    }

    public String getDtDReg() {
        return dtDReg;
    }

    public void setDtDReg(String dtDReg) {
        this.dtDReg = dtDReg;
    }

    @Override
    public String toString() {
        return "GSTDetails{" +
                "gstin='" + gstin + '\'' +
                ", tradeName='" + tradeName + '\'' +
                ", legalName='" + legalName + '\'' +
                ", addrBnm='" + addrBnm + '\'' +
                ", addrBno='" + addrBno + '\'' +
                ", addrFlno='" + addrFlno + '\'' +
                ", addrSt='" + addrSt + '\'' +
                ", addrLoc='" + addrLoc + '\'' +
                ", stateCode=" + stateCode +
                ", addrPncd=" + addrPncd +
                ", txpType='" + txpType + '\'' +
                ", status='" + status + '\'' +
                ", blkStatus='" + blkStatus + '\'' +
                ", dtReg='" + dtReg + '\'' +
                ", dtDReg='" + dtDReg + '\'' +
                '}';
    }
}
