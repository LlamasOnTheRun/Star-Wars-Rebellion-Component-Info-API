package com.starwars.rebellion.ComponentInfoAPI.dao;

import lombok.Data;

import javax.persistence.Embeddable;

@Data
@Embeddable
public class CardText {
    private String title;
    private String cardType;
    private String description;
}
