import java.awt.*;
import java.awt.event.*;

/**
 * Write a description of class EvEx1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EvEx1
{
    /**
     * Constructor for objects of class EvEx1
     */
    public EvEx1()
    {
        // Constructor for objects of class EvEx1
    }

    public static void main(String[] args)
    {
        Event1 ev1Obj = new Event1();
    }

}
class Event1 implements ActionListener
{
    Button but1;
    public Event1()
    {
        Frame f = new Frame("Button tester");
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        but1 = new Button("Press");
        but1.addActionListener(this);
        f.add(but1);
        f.pack();
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae)
    {
        System.out.println("you pressed the button");
        System.out.println("Labelled: " +ae.getActionCommand());
    }
}

        