package org.ericwubbo.seederdemo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@Getter
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private BigDecimal price;

    public Item(String name, String priceAsString) {
        this.name = name;
        this.price = new BigDecimal(priceAsString);
    }
}
