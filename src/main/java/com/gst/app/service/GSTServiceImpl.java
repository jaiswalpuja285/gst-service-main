package com.gst.app.service;

import com.gst.app.entity.GSTDetail;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class GSTServiceImpl implements GSTService {

    List<GSTDetail> gstDetails = Arrays.asList(new GSTDetail[]{
            new GSTDetail("29AWGPV7107B1Z1","VIKAS EXPORTS","VIKASEXPORTS","RAMANAGARA", "562160","1st floor","6th main","CHANNAPATNA",29L,562160L,"REG","ACT",null,"05/04/2021","05/04/2021"),
            new GSTDetail("29AWGPV7107B1Z2","VIKAS EXPORTS","VIKASEXPORTS","RAMANAGARA", "562160","1st floor","6th main","CHANNAPATNA",29L,562160L,"REG","ACT",null,"05/04/2021","05/04/2021")
    });

    @Override
    public GSTDetail getGSTDetails(String gstin) {
        GSTDetail neededGSTDetails = new GSTDetail();
        for(int i=0; i<gstDetails.size(); i++) {
            if(gstDetails.get(i).getGstin().equals(gstin))
                neededGSTDetails = gstDetails.get(i);
        }
        return neededGSTDetails;
    }
}

