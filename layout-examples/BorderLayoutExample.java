import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample
{
    private JFrame frame = new JFrame ("Border Layout Example");

    private JButton northButton = new JButton ("North Button");
    private JButton eastButton = new JButton ("East Button");    
    private JButton southButton = new JButton ("South Button");    
    private JButton westButton = new JButton ("West Button");     
    
    private JTextField textField = new JTextField(20);
    
    public BorderLayoutExample() 
    {       
       
        frame.setLayout (new BorderLayout());
        frame.add (northButton, BorderLayout.NORTH);
        frame.add (eastButton, BorderLayout.EAST);        
        frame.add (southButton, BorderLayout.SOUTH);        
        frame.add (westButton, BorderLayout.WEST);
        
        frame.add (textField, BorderLayout.CENTER);     
        
        frame.pack();
        frame.setVisible (true);
    }        
}
