package com.gst.app.controller;

import java.util.List;

import com.gst.app.entity.GSTDetail;
import com.gst.app.service.GSTService;
import com.gst.app.service.SyncGSTService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    private GSTService gstService;

    // test
    @GetMapping("/test")
    public String home() {
        return "This is for testing if app is working...";
    }


    // Get gst details
    @GetMapping("/get_gst_detail/{gstin}")
    public GSTDetail getGstDetails(@PathVariable String gstin) {
        return gstService.getGSTDetails(gstin);
    }


    // Get sync gst details
    @GetMapping("/get_sync_gst_detail/{gstin}")
    public SyncGSTDetail getGstDetails(@PathVariable String gstin) { return SyncGSTService.getSyncGstDetail(gstin);
    }

}
