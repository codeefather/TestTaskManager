package com.taskmanager.models;

public class Task {
    private long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private User author;
    private User assignee;

    public Task() {

    }

    public Task(String title, String description, String status, String priority, User author, User assignee) {
        this.title = title;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.author = author;
        this.assignee = assignee;
    }

    public Task(TaskInfo info){
        this.title = info.getTitle();
        this.description = info.getDescription();
        this.status = info.getStatus();
        this.priority = info.getPriority();
        this.author = info.getAuthor();
        this.assignee = info.getAssignee();
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus(String status) {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public User getAssignee() {
        return assignee;
    }

    public void setAssignee(User assignee) {
        this.assignee = assignee;
    }
}