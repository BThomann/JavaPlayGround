package com.playground.mvc2;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class LectureModel {

    private String data;

    // kommt von Java
    private PropertyChangeSupport notifyViews = new PropertyChangeSupport(this);

    public String getData() {
        return data;
    }

    public void setData(String data) {
        String old = this.data;
        this.data = data;
        notifyViews.firePropertyChange("data", old, this.data);
    }

    public void addViewListener (PropertyChangeListener listener) {
        notifyViews.addPropertyChangeListener(listener);
    }
}
