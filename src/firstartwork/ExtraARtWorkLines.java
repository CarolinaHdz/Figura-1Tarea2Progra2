/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstartwork;

import domain.Line;
import gui.PaintLinesArtWork;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Caro
 */
public class ExtraARtWorkLines extends JPanel {
    
    ExtraARtWorkLines() {
        this.setPreferredSize(new Dimension(600,600));
    }

    private int generateRandomNum(int number) {
        return (int) (Math.random() * number) + 1;
    } // numRandom
    
    private void draw2(Graphics g) {
        for (int i = 0; i <=800; i++) {//se controla que se haga minimo 800 lineas
        
        g.setColor(new Color(generateRandomNum(255), generateRandomNum(255), generateRandomNum(255)));//le damos un color aleatorio
        int x = (int) (Math.random() * (600 - 0) + 0);
        int y = (int) (Math.random() * (600 - 0) + 0);
       
        g.drawLine(x, y, x,5);
        g.drawLine(5, y, x,y);

        } // for
    
    } // draw

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw2(g); // se llama al metodo draw
    } // paintComponent
    
    public static void main(String[] args) {
        JFrame window2 = new JFrame("EXTRA ARTWORK PAINT LINES");
        window2.setContentPane(new ExtraARtWorkLines());
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window2.pack();
        window2.setResizable(false);
        window2.setLocation(350,50);
        window2.setVisible(true);         
    }
    
}
