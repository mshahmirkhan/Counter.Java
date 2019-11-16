package inc.dec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class IncDec extends JFrame {
    private int x=0;
    IncDec(){
        
        //CREATING WINDOW
        setTitle("COUNTER");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,150);
        setVisible(true);
        
        //SETTION LAYOUT
        setLayout(new FlowLayout());
        
        //CREATING BUTTON & LABLES 
         JButton btn1 =new JButton("INCREMENT");
         JButton btn2 =new JButton("DECREMENT");
         JLabel lbl = new JLabel(""+x);
         
        //ADDING THE COMPONENT
         add(lbl);
         add(btn1);
         add(btn2);
        
        //ADDING EVENT TO BUTTON 1
         btn1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                x++;
                lbl.setText(""+x);
                
            }//btn1 action perform
         });//btn1 event
         
        //ADDING EVENT TO BUTTON 
         btn2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                x--;
                lbl.setText(""+x);
                
            }//btn2 action perform
         });//btn2 event
        
        
    }//constructor
    public static void main(String[] args) {
        IncDec obj =new IncDec();
    }//main
    
}//class IncDec
