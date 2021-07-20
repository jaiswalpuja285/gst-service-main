package com.gst.app.controller;

import java.util.List;

import com.gst.app.entity.GSTDetail;
import com.gst.app.entity.IRNCancellation;
import com.gst.app.entity.IRNGeneration;
import com.gst.app.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    @Autowired
    private GSTService gstService;
    @Autowired
    private SyncGSTService syncGSTService;
    @Autowired
    private IRNGenerationService irnGenerationService;
    @Autowired
    private IRNCancellationService irnCancellationService;


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
    @GetMapping("/get_sync_gst_detail/{syncgstin}")
    public  GSTDetail getGSTDetails(@PathVariable String syncgstin) { return syncGSTService.getGSTDetails(syncgstin);}

    // Post IRN Generation
    @PostMapping("/post_irn_generation/{invoice}")
     public IRNGeneration getIRNGenerations(@PathVariable String invoice) {return irnGenerationService.getIRNGenerations(invoice);}

    // Post IRN Cancellation
    @PostMapping("/post_irn_cancellation/{cancal}")
    public IRNCancellation getIRNCancellations(@PathVariable String cancel) {return irnCancellationService.getIRNCancellations(cancel);}
    }



