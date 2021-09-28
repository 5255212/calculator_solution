/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package au.edu.unsw.infs2605.calculator_solution;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author malshika
 */
public class CalculatorController {
    
    @FXML
    TextField number1;
    
    @FXML
    TextField number2;
    
    @FXML
    Label result;
    
    double num1;
    double num2;
    
    public void getUserInput() {
      num1 = Double.parseDouble(number1.getText());
      num2 = Double.parseDouble(number2.getText());
      result.setVisible(true);
    }
 
    @FXML
    public void addition() {
        getUserInput();
        result.setText(Double.toString(num1+num2));
    }
    
    @FXML
    public void subtraction() {
        getUserInput();
        result.setText(Double.toString(num1-num2));
    }
    
    @FXML
    public void multiplication() {
        getUserInput();
        result.setText(Double.toString(num1*num2));
    }
    
     @FXML
    public void division() {
        getUserInput();
        result.setText(Double.toString(num1/num2));
    }
    
    @FXML
     public void initialize() {
        result.setVisible(false);
    }
    
}
