package com.starwars.rebellion.ComponentInfoAPI.dao.request;

import com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables.TacticType;
import lombok.Data;

@Data
public class TacticCardRequest {
    private Integer id;
    private String title;
    private TacticType tacticType;
}
