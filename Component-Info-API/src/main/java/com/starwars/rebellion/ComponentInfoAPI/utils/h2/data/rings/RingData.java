package com.starwars.rebellion.ComponentInfoAPI.utils.h2.data.rings;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.Ring;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RingData {
   public static final Ring C3PO = createRingData("C3PO");
   public static final Ring YODA = createRingData("Master Yoda");
   public static final Ring MILLENNIUM_FALCON = createRingData("Millennium Falcon");
   public static final Ring CAPTURED = createRingData("Captured");
   public static final Ring LURED_TO_DARK_SIDE = createRingData("Lured to Dark Side");
   public static final Ring R2D2 = createRingData("R2D2");
   public static final Ring FROZEN_IN_CARBONITE = createRingData("Frozen in Carbonite");

    public static List<Ring> fetch(){
        List<Ring> ringList = new ArrayList<>();
        ringList.add(C3PO);
        ringList.add(YODA);
        ringList.add(MILLENNIUM_FALCON);
        ringList.add(CAPTURED);
        ringList.add(LURED_TO_DARK_SIDE);
        ringList.add(R2D2);
        ringList.add(FROZEN_IN_CARBONITE);

        return ringList;
    }

    private static Ring createRingData(String title){
        Ring ring = new Ring();
        ring.setTitle(title);
        return ring;
    }
}
