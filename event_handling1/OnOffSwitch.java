import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class OnOffSwitch {
  
  //all of these fields must be declared here so that the inner class can "see" 
  //them
  private JFrame frame;
  private JButton button;
  private String onText = "On";
  private String offText = "Off";
  private boolean isOn = false;
 
  public OnOffSwitch () {
   frame = new JFrame("On/Off Switch"); // frame title
   
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   button = new JButton("Off");  
   
   button.setForeground(Color.black);
   button.setBackground(Color.white);
   button.addActionListener(new Switcher());//add the Switcher to the button
   frame.add(button, BorderLayout.CENTER);//remember BorderLayout is default for JFrame
   frame.setSize(400, 400);
   frame.setVisible(true);
 }
 
  //here is the inner class 
  class Switcher implements ActionListener {
    //we must implement this method to use the interface ActionListener
    public void actionPerformed (ActionEvent e) {
  
      Color oldForeground = button.getForeground();//we access the private fields in the enclosing class
      button.setForeground(button.getBackground());
      button.setBackground(oldForeground);
      if(isOn){
        button.setText(offText);
        isOn = false;
      }
      else{
        button.setText(onText);
        isOn = true;
      }
    }
 }//end of Switcher (inner class)
}//end of OnOffSwitch


