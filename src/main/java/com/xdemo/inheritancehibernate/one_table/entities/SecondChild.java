package com.xdemo.inheritancehibernate.one_table.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("second") // Значение, проставляемое в колонке "ENTITY_TYPE" (см. @DiscriminatorColumn)
public class SecondChild extends Parent {

    @Column(name = "second_child_field")
    boolean secondChildField;

    @Builder
    public SecondChild(String commonField, boolean secondChildField) {
        super(commonField);
        this.secondChildField = secondChildField;
    }
}
