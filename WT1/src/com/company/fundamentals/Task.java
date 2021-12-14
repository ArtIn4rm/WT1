package com.company.fundamentals;
public abstract class Task {
    public int taskCode;

    abstract public void runTask();

    public void setTaskCode(int taskCode) {
        this.taskCode = taskCode;
    }
}
