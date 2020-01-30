/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

/**
 *
 * @author PSKdream
 */
public class calculat  {

    private double DigitUnit(String[] ColorTab) {
        double sum = 0;
        if (ColorTab[2] != null) {
            int multiple = 100; //ตำแหน่ง
            for (int i = 0; i <= 2; i++) {
                switch (ColorTab[i]) {
                    case "Brown":
                        sum = sum + (multiple * 1);
                        multiple = multiple / 10;
                        break;
                    case "Red":
                        sum = sum + (multiple * 2);
                        multiple = multiple / 10;
                        break;
                    case "Orange":
                        sum = sum + (multiple * 3);
                        multiple = multiple / 10;
                        break;
                    case "Yellow":
                        sum = sum + (multiple * 4);
                        multiple = multiple / 10;
                        break;
                    case "Green":
                        sum = sum + (multiple * 5);
                        multiple = multiple / 10;
                        break;
                    case "Blue":
                        sum = sum + (multiple * 6);
                        multiple = multiple / 10;
                        break;
                    case "Violet":
                        sum = sum + (multiple * 7);
                        multiple = multiple / 10;
                        break;
                    case "Grey":
                        sum = sum + (multiple * 8);
                        multiple = multiple / 10;
                        break;
                    case "White":
                        sum = sum + (multiple * 9);
                        multiple = multiple / 10;
                        break;
                }
            }
        } else if (ColorTab[2] == null) {
            int multiple = 10;
            for (int i = 0; i <= 1; i++) {
                switch (ColorTab[i]) {
                    case "Brown":
                        sum = sum + (multiple * 1);
                        multiple = multiple / 10;
                        break;
                    case "Red":
                        sum = sum + (multiple * 2);
                        multiple = multiple / 10;
                        break;
                    case "Orange":
                        sum = sum + (multiple * 3);
                        multiple = multiple / 10;
                        break;
                    case "Yellow":
                        sum = sum + (multiple * 4);
                        multiple = multiple / 10;
                        break;
                    case "Green":
                        sum = sum + (multiple * 5);
                        multiple = multiple / 10;
                        break;
                    case "Blue":
                        sum = sum + (multiple * 6);
                        multiple = multiple / 10;
                        break;
                    case "Violet":
                        sum = sum + (multiple * 7);
                        multiple = multiple / 10;
                        break;
                    case "Grey":
                        sum = sum + (multiple * 8);
                        multiple = multiple / 10;
                        break;
                    case "White":
                        sum = sum + (multiple * 9);
                        multiple = multiple / 10;
                        break;
                }
            }
        }
        return sum;
    }

    private double multiple(String[] color) {
        double multiple = 0;
        switch (color[3]) {
            case "Black":
                multiple = 1;
                break;
            case "Brown":
                multiple = 10;
                break;
            case "Red":
                multiple = 100;
                break;
            case "Orange":
                multiple = 1000;
                break;
            case "Yellow":
                multiple = 10000;
                break;
            case "Green":
                multiple = 100000;
                break;
            case "Blue":
                multiple = 1000000;
                break;
            case "Violet":
                multiple = 10000000;
                break;
            case "Gold":
                multiple = 0.1;
                break;
            case "Silver":
                multiple = 0.01;
                break;
        }
        return multiple;
    }

    public double error(String[] color) {
        double error = 0;
        switch (color[4]) {
            case "Brown":
                error = 1;
                break;
            case "Red":
                error = 2;
                break;
            case "Green":
                error = 0.5;
                break;
            case "Blue":
                error = 0.25;
                break;
            case "Violet":
                error = 0.10;
                break;
            case "Grey":
                error = 0.05;
                break;
            case "Gold":
                error = 5;
                break;
            case "Silver":
                error = 10;
                break;
        }
        return error;
    }

    public double var_Resitor(String[] color) {
        double sum = DigitUnit(color)*multiple(color);
        return sum;
    }
    public double Max_Error(double var_Resitor,double error) {
        double sum = var_Resitor +((error / 100) * var_Resitor);
        return sum;
    }
    public double Min_Error(double var_Resitor,double error) {
        double sum = var_Resitor - ((error / 100) * var_Resitor);
        return sum;
    }
}
