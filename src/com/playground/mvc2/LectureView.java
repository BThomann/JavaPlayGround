package com.playground.mvc2;

public class LectureView {

    public LectureView(LectureModel model) {
        model.addViewListener(event -> {
            Object newData = event.getNewValue();
            Object oldData = event.getOldValue();
            String propName = event.getPropertyName();

            if (newData instanceof String) {
                print(((String) newData));
            }
        });
    }

    private void print(String data){
        System.out.println(data);
    }

}
