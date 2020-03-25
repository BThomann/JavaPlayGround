package com.playground.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController  {

    private CalcView theView;
    private CalcModel theModel;

    public CalcController(CalcView theView, CalcModel theModel) {
        this.theView = theView;
        this.theModel = theModel;

        this.theView.addCalculationListener(new CalculateListener());
    }

    private class CalculateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            int firstNumber, secondNumber = 0;

            try {
                firstNumber = theView.getFirstNumber();
                secondNumber = theView.getSecondNumber();

                theModel.addTwoNumbers(firstNumber, secondNumber);

                theView.setCalcSolution(theModel.getValue());
            } catch (NumberFormatException e) {
                theView.displayErrorMessage("You need to insert two error Messages");
            }
        }
    }
}
