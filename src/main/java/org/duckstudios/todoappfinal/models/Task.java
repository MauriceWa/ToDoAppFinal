package org.duckstudios.todoappfinal.models;

public class Task {
    private String name;
    private String description;
    private boolean isFinished = false;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
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
