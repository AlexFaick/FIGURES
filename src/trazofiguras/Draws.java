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
public class Draws  extends JPanel{
    private JFrame ventana;
    private Container contenedor;
    
public Draws(){
 ventana = new JFrame("FIGURAS");
 ventana.setSize(750, 415);
 ventana.setVisible(true);
 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 ventana.setResizable(false);
 ventana.setBackground(Color.black);

        //contenedor
 contenedor = ventana.getContentPane();
 contenedor.setSize(750, 415);
 contenedor.add(this, BorderLayout.CENTER);  
    
}

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        
       //dibujo de cuadros
        g.drawRect(10, 10, 200, 150);
        
         //primer dibujo
      g.setColor(Color.orange);
      g.drawRect(50, 70, 120, 60);
      g.drawRect(80, 90, 20, 40);
      g.drawLine(50, 70, 120, 30);
      g.drawLine(120, 30, 170, 70);
      g.drawLine(80, 130, 60, 150);
      g.drawLine(100, 130, 80, 150);
      g.drawString("DIBUJO DE LINEAS ",55,175);
      
      //segundo dibujo 
      g.setColor(Color.black);
      g.drawRect(250, 10, 200, 150);
      g.setColor(Color.blue);
      g.drawRect(280, 100, 15, 35);
      g.drawRect(305, 80, 15, 55);
      g.drawRect(330, 60, 15, 75);
      g.drawRect(355, 40, 15, 95);
      g.drawRect(380, 20, 15, 115);
      g.drawString("DIBUJO DE RECTANGULOS ",255,175);
        
      //tercer dibujo  
      g.setColor(Color.black);
  
      g.drawRect(490, 10, 200, 150);
      g.setColor(Color.GRAY);
      g.drawRoundRect(540, 60,100, 30,100,90);
      g.drawRoundRect(560, 40,60, 30,100,90);
      g.drawRoundRect(575, 30,30, 90,100,100);
    
      g.drawString("DIBUJO DE OVALOS CON RECTANGULOS ",495,175);
    
      //cuarto dibujo
      g.setColor(Color.black);
      g.drawRect(10,200, 200, 150);
      g.setColor(Color.red);
      g.drawOval(45,210, 130, 130);
      g.drawOval(80,240, 25, 25);
      g.drawOval(120,240, 25, 25);
      g.fillOval(125,245, 15, 15);
      g.fillOval(85,245, 15, 15);
      g.drawOval(85,275, 50, 55);
      g.drawString("DIBUJO DE LINEAS ",55,365);
      
      //quinta figura
      g.setColor(Color.black);
      g.drawRect(250,200, 200, 150);
      g.setColor(Color.cyan);
      g.drawOval(330, 220, 30,100);
      g.drawOval(315, 240, 60,30);
      g.drawOval(300, 260, 100,30);
      g.drawString("DIBUJO DE CIRCULOS ",255,365);
      
      //sexta figura
      g.setColor(Color.black);
      g.drawRect(490,200, 200, 150);
      g.setColor(Color.MAGENTA);
      g.drawLine(510, 220, 510, 260);
      g.drawLine(510, 220, 530, 260);
      g.drawLine(510, 260, 530, 260);
      
      
      g.drawLine(510, 280, 580, 240);
      g.drawLine(580, 240, 630, 280);
      g.drawLine(510, 280, 630, 280);
      
      g.drawLine(580, 240, 580, 220);
      g.drawLine(580, 220, 630, 240);
      g.drawLine(580, 240, 630, 240);
      
      g.drawString("DIBUJO DE TRIANGULOS ",496,365);
      
      
        
    }


}
