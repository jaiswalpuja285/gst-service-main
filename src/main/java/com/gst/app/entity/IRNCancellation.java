package com.gst.app.entity;

import java.util.Date;

public class IRNCancellation {
    private String irn;
    private String cancelDate;

    public  IRNCancellation() {}

    public  IRNCancellation(String irn, String cancelDate){

        this.irn = irn;
        this.cancelDate = cancelDate;
    }

    public String getIrn() {
        return irn;
    }

    public void setIrn(String irn) {
        this.irn = irn;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }
}
