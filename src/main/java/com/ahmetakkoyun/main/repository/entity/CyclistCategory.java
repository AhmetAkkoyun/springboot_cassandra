package com.ahmetakkoyun.main.repository.entity;

import org.springframework.data.cassandra.core.cql.Ordering;
import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table(value = "cyclist_category")
public class CyclistCategory {
    @PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    private String category;
    @PrimaryKeyColumn(ordinal = 0, type = PrimaryKeyType.CLUSTERED, ordering = Ordering.DESCENDING)
    private int points;
    private UUID id;
    private String lastname;

    public CyclistCategory(String category, int points, UUID id, String lastname) {
        this.category = category;
        this.points = points;
        this.id = id;
        this.lastname = lastname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "CyclistCategory{" +
                "category='" + category + '\'' +
                ", points=" + points +
                ", id=" + id +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
