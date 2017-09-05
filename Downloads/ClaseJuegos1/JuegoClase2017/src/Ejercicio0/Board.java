/*
PLANTILLA BASE PARA CREACION DE ESCENARIOS.
 */
package Ejercicio0;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Estudiante
 */
public class Board extends JPanel implements ActionListener{
    private int xref=10;
    private int delay=25;
    private Timer timer;
    
    public Board (){
        timer = new Timer (this.delay,this);
        timer.start();
    }
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.drawOval(40+xref, 30, 10, 10);
        g.drawOval(20+xref, 30, 10, 10);
        int x[] = {10+xref,10+xref,60+xref,60+xref,50+xref,40+xref,30+xref,20+xref,10+xref};
        int y[] = {20,30,30,20,20,10,10,20};
        g.drawPolygon(x, y, 8);
        int z[] = {200-xref,200-xref,210-xref,210-xref};
        int w[] = {30,20,20,30};
        g.drawPolygon(z, w, 4);
    }
    
        @Override
    public void actionPerformed(ActionEvent e) {
        this.xref+=1;
        repaint();
    }
}
   

        

