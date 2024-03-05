package org.duckstudios.todoappfinal.models;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String description;
    private boolean isFinished = false;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JsonBackReference
    private Category category;

    public Task() {
    }


    public Task(String name, String description, Category category) {
        this.name = name;
        this.description = description;
        this.category = category;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isFinished() {
        return isFinished;
    }
}
