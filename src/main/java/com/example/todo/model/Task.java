package com.example.todo.model;
import jakarta.persistence.*;

    @Entity
    public class Task {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String description;

        private boolean completed;

        public Long getId() { return id; }
        public void setId(Long id) { this.id = id; }

        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }

        public boolean isCompleted() { return completed; }
        public void setCompleted(boolean completed) { this.completed = completed; }
    }

