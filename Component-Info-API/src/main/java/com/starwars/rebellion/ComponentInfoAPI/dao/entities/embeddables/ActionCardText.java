package com.starwars.rebellion.ComponentInfoAPI.dao.entities.embeddables;

import lombok.Data;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class ActionCardText {
    private String title;
    private String cardType;
    private String description;
}
