package com.taskmanager.DTO;

import com.taskmanager.models.Task;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.List;

public class TaskDTO {
    private final SessionFactory sessionFactory;
    private Long id;
    private String title;
    private String description;
    private String status;
    private String priority;
    private Long authorId;
    private Long assigneeId;

    public TaskDTO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getStatus() {
        return status;
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

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(Long assigneeId) {
        this.assigneeId = assigneeId;
    }

    public void create(Task task){

    }

    public void update(Task task){

    }

    public void deleteById(long id){

    }

    public List<Task> findAll(){
        return null;
    }

    public Task findById(long id){
        return null;
    }

    public void savaOrUpdate(Task task){
        getSession().persist(task);
    }

    public Session getSession(){
        return sessionFactory.getCurrentSession();
    }

}
