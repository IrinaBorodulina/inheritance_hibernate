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
@DiscriminatorValue("first") // Значение, проставляемое в колонке "ENTITY_TYPE" (см. @DiscriminatorColumn)
public class FirstChild extends Parent {

    @Column(name = "first_child_field")
    Integer firstChildField;

    @Builder
    public FirstChild(String commonField, Integer firstChildField) {
        super(commonField);
        this.firstChildField = firstChildField;
    }
}
