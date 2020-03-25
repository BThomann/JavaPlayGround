package com.playground;

import com.playground.mvc.CalcController;
import com.playground.mvc.CalcModel;
import com.playground.mvc.CalcView;
import com.playground.mvc2.LectureController;
import com.playground.mvc2.LectureModel;
import com.playground.mvc2.LectureView;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        CalcView theView = new CalcView();
//        CalcModel theModel = new CalcModel();
//
//        CalcController theController = new CalcController(theView, theModel);
//
//        theView.setVisible(true);
        LectureModel lecModel = new LectureModel();
        LectureView lecVIew = new LectureView(lecModel);
        LectureController lecController = new LectureController(lecModel);

        lecController.changeModel("newData");
        lecController.changeModel("Test2");
    }
}
