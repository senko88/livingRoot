package com.livingroot.project.persistance.entity;

import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@Entity
@Table(name = "order_")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "customer")
    private Customer customer;

    @Column
    private LocalDateTime creationDateTime;

    @Column
    private LocalDateTime resolutionDateTime;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "order_item", joinColumns = @JoinColumn(name = "order_id"))
    private Set<CatalogItem> catalogItemSet;
}
