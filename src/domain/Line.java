/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Caro
 */
public class Line {
    
    
    private double aux;
    double hypotenuse;

    public Line() {
      this.aux=0;
      this.hypotenuse=0;
    }

    public Line(double aux, double hypotenuse) {
        this.aux = aux;
        this.hypotenuse = hypotenuse;
    }

    public double getAux() {
        return aux;
    }

    public void setAux(double aux) {
        this.aux = aux;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }
    
    public void linearFunction(Graphics g, double x0, double y0, double x1, double y1) {
        if(y0>y1){
            aux=y0;
            y0=y1;
            y1=aux;
        }//if
        while (y0 <= y1) {
           hypotenuse = Math.sqrt(Math.pow(x1 - x0, 2) + Math.pow(y1 - y0, 2));
            x0 += (x1 - x0) / hypotenuse;
            y0 += (y1 - y0) / hypotenuse;
            g.drawLine((int) x0, (int) y0, (int) x0, (int) y0);
        } // while
        
    }// linearFunction
     
     
    
    
    
    
}
