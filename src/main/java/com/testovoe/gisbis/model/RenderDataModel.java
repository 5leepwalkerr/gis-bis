package com.testovoe.gisbis.model;

import doodle.algebra.generic.BoundingBox;
import doodle.core.Color;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "renderData")
public class RenderDataModel {
    @Id
    private Long renderDataId;
    @Column("colorIdentity")
    private Color colorIdentity;
    @Column("width")
    private Long width;
    @Column("height")
    private Long height;
    @Column("boundingBox")
    private BoundingBox boundingBox;

}
