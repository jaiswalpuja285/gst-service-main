package com.gst.app.service;

import com.gst.app.entity.GSTDetail;

public interface SyncGSTService {

    GSTDetail getGstDetail(String gstin);
}
