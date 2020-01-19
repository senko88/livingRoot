package com.livingroot.project.persistance.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class CatalogItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private Integer price;

    @ManyToOne(optional = true)
    @JoinColumn(name = "item")
    private Item item;

    @OneToOne(optional = false)
    @JoinColumn(name = "provider")
    private Provider povider;

}
