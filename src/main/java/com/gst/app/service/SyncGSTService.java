package com.gst.app.service;

import com.gst.app.entity.GSTDetail;

public interface SyncGSTService {
    public  GSTDetail  getGSTDetails(String gstin);

}
