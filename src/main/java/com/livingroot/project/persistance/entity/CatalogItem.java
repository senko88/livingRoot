package com.livingroot.project.persistance.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class CatalogItem implements Serializable {

    @OneToOne(optional = false)
    @JoinColumn(name = "provider")
    private Provider provider;

    @ManyToOne
    @JoinColumn(name = "item")
    private Item item;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer amount;

}
