package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.rings;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RingData {
    public static List<Ring> fetch(){
        List<Ring> ringList = new ArrayList<>();
        Ring ring = new Ring();
        ring.setTitle("C3PO");
        ringList.add(ring);

        return ringList;
    }
}
