/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aec1colas;

import com.rafaeloga.colas.QueueWithList;
import com.rafaeloga.colas.QueueWithVector;
import com.rafaeloga.exceptions.DesbordamientoSuperior;
import com.rafaeloga.model.Destiny;
import com.rafaeloga.model.Reserve;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rafael.lopez
 */
public class AEC1Colas extends JFrame implements ActionListener{

    /**
     */
    
    @SuppressWarnings("FieldMayBeFinal")
    private JMenuBar mb;
    @SuppressWarnings("FieldMayBeFinal")
    private JMenu menu1;
    private JMenuItem mi1,mi2;
    private final int queueLenght = 30;
    private QueueWithList queueList;
    private QueueWithVector queueVector;
    
    @SuppressWarnings("LeakingThisInConstructor")
    public AEC1Colas (){
        setLayout(null);
         mb=new JMenuBar();
        setJMenuBar(mb);
        menu1=new JMenu("Cargar Datos Prueba");
        mb.add(menu1);
        mi1=new JMenuItem("Cargar Cola con vector");
        mi1.addActionListener(this);
        menu1.add(mi1);
        mi2=new JMenuItem("Cargar Cola con lista enlazada");
        mi2.addActionListener(this);
        menu1.add(mi2);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    	Container f=this.getContentPane();
        if (e.getSource()==mi1) {
            queueVector = new QueueWithVector(queueLenght);
            for (int i=0; i< queueLenght; i++){
                Reserve reserve = new Reserve("Name" + i, "Surname " + i, new Destiny("Hotel"+i, "Description"  + i, "Company " + i, "City " + i, "Country " + i));
                try {
                    queueVector.insert(reserve);
                } catch (DesbordamientoSuperior ex) {
                    Logger.getLogger(AEC1Colas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            genUIVector();
        }
        if (e.getSource()==mi2) {
            f.setBackground(new Color(0,255,0));
        }
         
    }
    public static void main(String[] args) {
        // TODO code application logic here
        AEC1Colas interfaz = new AEC1Colas();
        
        interfaz.setBounds(10,20,1000,700);
        interfaz.setVisible(true);
        
    }

    private void genUIVector() {
        

    }
    
}
