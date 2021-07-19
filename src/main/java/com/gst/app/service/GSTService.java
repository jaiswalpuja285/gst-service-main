package com.gst.app.service;

import com.gst.app.entity.GSTDetail;

public interface GSTService {
    GSTDetail getGSTDetails(String gstin);
}
