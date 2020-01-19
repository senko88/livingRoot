package com.livingroot.project.persistance.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class OrderItem implements Serializable {

    @Column(nullable = false)
    private Integer amount;

    @OneToOne(optional = true)
    @JoinColumn(name = "order")
    private Order order;

    @OneToOne(optional = true)
    @JoinColumn(name = "catalog_item")
    private CatalogItem catalogItem;
}
