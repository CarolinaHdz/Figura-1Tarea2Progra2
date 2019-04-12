/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import domain.Line;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Caro
 */
public class PaintLinesArtWork extends JPanel {

    public PaintLinesArtWork() {
        this.setPreferredSize(new Dimension(600, 600));
    }

    private int generateRandomNum(int number) {
        return (int) (Math.random() * number) + 1;
    } // numRandom
    
    private void draw(Graphics g) {
        for (int i = 0; i <=1000; i++) {//se controla la cantidad de lineas a mil pero al instanciar dos veces a la linea se hacen 2000 lineas
        Line line= new Line();
        Line line2= new Line();
        g.setColor(new Color(generateRandomNum(255), generateRandomNum(255), generateRandomNum(255)));//le damos un color aleatorio
        line.linearFunction(g, generateRandomNum(600),generateRandomNum(600),generateRandomNum(600),generateRandomNum(600));
        line2.linearFunction(g, generateRandomNum(600),generateRandomNum(600),generateRandomNum(600),generateRandomNum(600));
        } // for
    } // draw

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g); // se llama al metodo draw
    } // paintComponent
    
    public static void main(String[] args) {
        JFrame window = new JFrame("ARTWORK PAINTING LINES ");
        window.setContentPane(new PaintLinesArtWork());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.pack();
        window.setResizable(false);
        window.setLocation(300,50);
        window.setVisible(true);         
    }
}//class
