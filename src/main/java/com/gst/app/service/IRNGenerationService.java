package com.gst.app.service;


import com.gst.app.entity.IRNGeneration;

public interface IRNGenerationService {
    IRNGeneration getIRNGenerations(String invoice);
}
