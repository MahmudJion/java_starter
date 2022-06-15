import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class BorderEventExample
{
    //good practise is to declare the fields but only initialise them in the constructor
    private JFrame frame;

    private JButton northButton;
    private JButton eastButton;
    private JButton southButton;
    private JButton westButton;
    private BorderEventListener listener;//this class the inner class to handle the events

    private JTextField textField;

    public BorderEventExample()
    {
        frame = new JFrame ("Border Event Example");
        northButton = new JButton ("North Button");
        eastButton = new JButton ("East Button");
        southButton = new JButton ("South Button");
        westButton = new JButton ("West Button");
        listener = new BorderEventListener();
        northButton.addActionListener(listener);//we need to add a listener to each button
        eastButton.addActionListener(listener);
        southButton.addActionListener(listener);
        westButton.addActionListener(listener);

        textField = new JTextField(20);//constructor takes an int the determines the initial size of the field

        //BorderLayout is the default layout for JFrame so we don't need to set the layout
        frame.add (northButton, BorderLayout.NORTH);
        frame.add (eastButton, BorderLayout.EAST);
        frame.add (southButton, BorderLayout.SOUTH);
        frame.add (westButton, BorderLayout.WEST);

        frame.add (textField, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible (true);
    }

    class BorderEventListener implements ActionListener{

        public void actionPerformed (ActionEvent e){
            /*
             * We need to check the source of an event and then, depending on the source, react accordingly
             * Another way of doing this would have been to write a separate event-handling class for each JButton.
             * This would have generated four classes and a solution that is less efficient for writing and running
             */
            if (e.getSource() == northButton){
                textField.setText("North button calling!");
            }
            else if (e.getSource() == westButton){
                textField.setText("A message from the west...");
            }
             else if (e.getSource() == southButton){
                textField.setText("..from the south..");
            }
             else if (e.getSource() == eastButton){
                textField.setText("where the sun rises");
            }
        }
    }
}
