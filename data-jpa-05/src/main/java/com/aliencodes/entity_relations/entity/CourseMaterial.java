package com.aliencodes.entity_relations.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@AttributeOverrides({
        @AttributeOverride(name = "courseMaterialId", column = @Column(name = "COURSE_MATERIAL_ID")),
        @AttributeOverride(name = "url", column = @Column(name = "COURSE_MAT_URL"))
})
@Table(name = "COURSE_MATERIAL")
public class CourseMaterial {
    @Id
    @SequenceGenerator(name = "course_material_sequence", sequenceName = "course_material_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_material_sequence")
    private Long courseMaterialId;
    private String url;

    // 1. OneToOne-Mapping relation : course material cannot exists without a course.
    // cascade = passing permission from parent to child here course to courseMaterial 
    // 2. JoinColumn : is used to select a column to define a foreign key.
    @OneToOne(
        cascade = CascadeType.ALL
    )
    @JoinColumn(
    name = "COURSE_ID",
    referencedColumnName = "COURSE_ID"
    )
    private Course course;
}
