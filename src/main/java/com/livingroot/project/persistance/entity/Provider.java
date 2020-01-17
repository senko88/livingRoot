package com.livingroot.project.persistance.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;


@Data
@Embeddable
public class Provider implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "contact")
    private Contact contact;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Provider provider = (Provider) o;
        return Objects.equals(id, provider.id) &&
                contact.equals(provider.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, contact);
    }

}
