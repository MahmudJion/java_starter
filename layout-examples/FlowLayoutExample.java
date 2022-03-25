import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample
{
    private JFrame frame = new JFrame ("Flow Layout Example");

    private JButton button1 = new JButton ("Button 1");
    private JButton button2 = new JButton ("Button 2");    
    private JButton button3 = new JButton ("Button 3");    
    private JButton button4 = new JButton ("Long-named Button 4");    
    private JButton button5 = new JButton ("5");     
    
    public FlowLayoutExample() 
    {       
        
        frame.setLayout (new FlowLayout());
        
        frame.add (button1);
        frame.add (button2);        
        frame.add (button3);        
        frame.add (button4);        
        frame.add (button5);
        
        frame.pack();
        frame.setVisible (true);
    }        
}
