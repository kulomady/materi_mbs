package com.kulomady.pertemuankedua.home;

/**
 *
 * Created by kulomady on 5/31/16.
 */
public class Task {
    private int id;
    private String task;
    private int status;
    private String taskTitle;
    private String taskPhoto;

    private String createAt;

    public void setId(int id) {
        this.id = id;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public void setTaskPhoto(String taskPhoto) {
        this.taskPhoto = taskPhoto;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public int getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public int getStatus() {
        return status;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskPhoto() {
        return taskPhoto;
    }

    public String getCreateAt() {
        return createAt;
    }
}
