package com.livingroot.project.persistance.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
public class CatalogItem implements Serializable {

    @Column(nullable = false)
    private Integer price;
}
