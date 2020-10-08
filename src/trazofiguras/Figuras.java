/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trazofiguras;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author ale
 */
public class Figuras  extends JPanel{
    private JFrame ventana;
    private Container contenedor;
    
    public Figuras(){
      ventana = new JFrame("FIGURAS");
        // Definir tamaño de ventana
        ventana.setSize(800, 600);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setResizable(false);
        ventana.setBackground(Color.black);
        //creamos contenedor
        contenedor = ventana.getContentPane();
        contenedor.setSize(800, 600);
        
        //Agregar la ventana en el contenedor
        contenedor.add(this, BorderLayout.CENTER);
        
    
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawLine(100, 50, 200, 50);
        g.drawLine(200, 50, 200, 100);
        g.drawLine(100, 50, 100, 100);
        g.drawLine(100, 100, 200, 100);
        
        g.setColor(Color.BLACK);
         g.drawLine(100, 50, 100, 50);
         g.drawLine(100, 100, 200, 100);
        
        //draw rectangulo
        g.setColor(Color.blue);
        g.drawRect(280, 50, 100, 50);
        
        //rectangulo relleno
        g.fillRect(280, 110, 100, 50);
        
        
        //dibujar el ovalo
        g.setColor(Color.black);
        g.drawRoundRect(450, 50, 100, 50, 50, 50);
        g.fillRoundRect(450, 110, 100, 50, 20, 20);
        
        //trazo de circulos
        g.setColor(Color.yellow);
        g.drawOval(100,200, 80, 80);
        g.fillOval(100, 290, 50, 50);
        
        //TRAZO DE OVALOS -CIRCUNFERENCIAS
        g.setColor(Color.green);
        g.drawOval(280, 200, 80,40);
        g.fillOval(280, 290, 40, 80);
        
        //dibujar triangulo
        g.setColor(Color.pink);
        g.drawLine(450, 300, 550, 300);
        g.drawLine(450, 300, 500, 250);
        g.drawLine(550, 300, 500, 250);
        
        //dibujar una cadena  de texto
        g.setColor(Color.MAGENTA);
        g.drawString("EJEMPLO DEL TRAZO DE LAS FIGURAS ",200,400);
        
        //COMO TRAZAR UN ARCO
        //contorno
        g.setColor(Color.red);
        g.drawArc(50, 420, 170, 150, -30, 250);
        
        //relleno del arco
        g.setColor(Color.blue);
        g.fillArc(350, 420, 170, 150, -30, 250);
        
    }
    
}
