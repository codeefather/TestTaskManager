package com.taskmanager.models;

public class TaskInfo {

    private long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private User author;
    private User assignee;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getPriority() {
        return priority;
    }

    public User getAuthor() {
        return author;
    }

    public User getAssignee() {
        return assignee;
    }
}
