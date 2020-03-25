package com.playground.mvc2;

import java.beans.PropertyChangeSupport;

public class LectureController {
    private LectureModel model;

    public LectureController(LectureModel model) {
        this.model = model;
    }

    public void changeModel(String data){
        model.setData(data);
    }
}
