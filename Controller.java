package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.fxml.FXML;
import javafx.scene.layout.Pane;

public class Controller {
    @FXML
    private Label vivod;
    @FXML
    private Pane calc;
    private String num1 = "";
    public void fullclear(ActionEvent actionEvent) {
        vivod.setText("0");
        num1="";
    }

    public void clear(ActionEvent actionEvent) {
        if (num1.contains(" ")){
            String[] gbuf=num1.split(" ");
            num1=gbuf[0]+" "+gbuf[1]+" ";
            vivod.setText(num1);
        }
    }

    public void delete(ActionEvent actionEvent) {
        if (num1!=null&&num1.length()>0&&num1.endsWith(" ")){
            num1=num1.substring(0,num1.length()-2);
        }
        if (num1 != null && num1.length() > 0) {
            num1 = num1.substring(0, num1.length() - 1);
            vivod.setText(num1);
        }
        if (num1.length()==0){
            vivod.setText("0");
        }


    }

    public void delenie(ActionEvent actionEvent) {
            if(num1.contains(" ")){

            }
            else {num1 = num1 + " / ";
                vivod.setText(num1);}

        }

    public void ymnosh(ActionEvent actionEvent) {
        if(num1.contains(" ")){

        }
        else {num1 = num1 + " * ";
        vivod.setText(num1);}
    }

    public void three(ActionEvent actionEvent) {
        num1 = num1 + "3";
        vivod.setText(num1);
    }

    public void two(ActionEvent actionEvent) {
        num1 = num1 + "2";
        vivod.setText(num1);
    }

    public void one(ActionEvent actionEvent) {
        num1 = num1 + "1";
        vivod.setText(num1);
    }

    public void vich(ActionEvent actionEvent) {
        if(num1.contains(" ")){

        }
        else {num1 = num1 + " - ";
        vivod.setText(num1);}
    }

    public void plus(ActionEvent actionEvent) {
        if(num1.contains(" ")){

        }
        else {num1 = num1 + " + ";
        vivod.setText(num1);}
    }

    public void six(ActionEvent actionEvent) {
        num1 = num1 + "6";
        vivod.setText(num1);
    }

    public void five(ActionEvent actionEvent) {
        num1 = num1 + "5";
        vivod.setText(num1);
    }

    public void four(ActionEvent actionEvent) {
        num1 = num1 + "4";
        vivod.setText(num1);
    }

    public void nine(ActionEvent actionEvent) {
        num1 = num1 + "9";
        vivod.setText(num1);
    }

    public void eight(ActionEvent actionEvent) {
        num1 = num1 + "8";
        vivod.setText(num1);
    }

    public void seven(ActionEvent actionEvent) {
        num1 = num1 + "7";
        vivod.setText(num1);
    }

    public void kockae(ActionEvent actionEvent) {
        num1=vivod.getText();
        num1=num1+".";
        vivod.setText(num1);
    }

    public void zero(ActionEvent actionEvent) {
            num1 = num1 + "0";
            vivod.setText(num1);
    }

    public void minusplus(ActionEvent actionEvent) {
        if (vivod.getText().startsWith("0")||vivod.getText().startsWith("1")||vivod.getText().startsWith("2")||vivod.getText().startsWith("3")||vivod.getText().startsWith("4")||vivod.getText().startsWith("5")||vivod.getText().startsWith("6")||vivod.getText().startsWith("7")||vivod.getText().startsWith("8")||vivod.getText().startsWith("9")||vivod.getText().endsWith(" ")){
        num1=num1+"-";
        vivod.setText(num1);}
    }

    public void ravn(ActionEvent actionEvent) {
        if (num1.contains("+")) {
            String zn = " ";
            String[] gbuf = num1.split(zn);
            double num2 = Double.valueOf(gbuf[0]);
            double num3 = Double.valueOf(gbuf[2]);
            double s = num2 + num3;
            String str = Double.toString(s);
            num1=str;
            if(str.endsWith(".0")){
                str=str.substring(0,str.length()-2);
                num1=num1.substring(0,num1.length()-2);
            }
            vivod.setText(str);
        }
        if (num1.contains("-")) {
            String zn = " ";
            String[] gbuf = num1.split(zn);
            double num2 = Double.valueOf(gbuf[0]);
            double num3 = Double.valueOf(gbuf[2]);
            double s = num2 - num3;
            String str = Double.toString(s);
            num1=str;
            if(str.endsWith(".0")){
                str=str.substring(0,str.length()-2);
                num1=num1.substring(0,num1.length()-2);
            }
            vivod.setText(str);
        }
        if (num1.contains("*")) {
            String zn = " ";
            String[] gbuf = num1.split(zn);
            double num2 = Double.valueOf(gbuf[0]);
            double num3 = Double.valueOf(gbuf[2]);
            double s = num2 * num3;
            String str = Double.toString(s);
            num1=str;
            if(str.endsWith(".0")){
                str=str.substring(0,str.length()-2);
                num1=num1.substring(0,num1.length()-2);
            }
            vivod.setText(str);
        }
        if (num1.contains("/")) {
            String zn = " ";
            String[] gbuf = num1.split(zn);
            double num2 = Double.valueOf(gbuf[0]);
            double num3 = Double.valueOf(gbuf[2]);
            double s = num2 / num3;
            String str =Double.toString(s);
            num1=str;
            if(str.endsWith(".0")){
                str=str.substring(0,str.length()-2);
                num1=num1.substring(0,num1.length()-2);
            }
            vivod.setText(str);
        }
    }

    public void Calc(ActionEvent actionEvent) {
        calc.setVisible(true);
        calc.setDisable(false);
    }

    public void Weigth(ActionEvent actionEvent) {
        calc.setVisible(false);
        calc.setDisable(true);

    }
}
