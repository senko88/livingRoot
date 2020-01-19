package com.livingroot.project.persistance.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, length = 50)
    private String name;

    @Column(nullable = false, length = 50)
    private String description;

    @OneToMany(fetch = FetchType.EAGER)
    private Set<CatalogItem> catalogItems;

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Item item = (Item) obj;
        return Objects.equals(id, item.id) &&
                name.equals(item.name) &&
                description.equals(item.description);
    }
}
