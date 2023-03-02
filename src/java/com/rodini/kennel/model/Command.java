package com.rodini.kennel.module;

/**
 * Команда
 */
public class Command {
    private  String name;
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Command(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName();
    }
}