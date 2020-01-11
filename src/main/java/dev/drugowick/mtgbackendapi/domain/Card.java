package dev.drugowick.mtgbackendapi.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String manaCost;

    private BigDecimal cmc;

    private String[] colors;

    private String type;

    private String rarity;

    private String text;

    private String artist;

    private String imageUrl;
}
