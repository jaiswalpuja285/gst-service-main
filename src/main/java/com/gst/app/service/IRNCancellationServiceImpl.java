package com.gst.app.service;


import com.gst.app.entity.IRNCancellation;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IRNCancellationServiceImpl implements IRNCancellationService{
    List<IRNCancellation> irnCancellations = Arrays.asList(new IRNCancellation[]{
            new IRNCancellation("a5c12dca80e743321740b001fd70953e8738d109865d28ba4013750f2046f229", "29-12-05 14:26:00"),
            new IRNCancellation("a5c12dca80e743321740b001fd70953e8738d109865d28ba4013750f2046f229", "29-12-05 14:26:00")
    });
    @Override
    public IRNCancellation getIRNCancellations(String cancel) {
        IRNCancellation neededIRNCancellations = new IRNCancellation();
        for(int i=0; i<irnCancellations.size(); i++) {
            if(irnCancellations.get(i).getIrn().equals(cancel))
                neededIRNCancellations = irnCancellations.get(i);
        }
        return neededIRNCancellations;
    }
}
