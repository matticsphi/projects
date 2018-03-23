package carmodel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CarView extends JPanel
{
    private CarModel model;
    public void setModel(CarModel newModel) 
    {
    model = newModel;
    if (model != null)
        model.addActionListener(new ActionListener() 
        {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
          repaint();
        }
        });
    }
    public CarModel getModel() 
    {
       return model;
    }
    protected void paintComponent(Graphics g) 
    {
        if (model != null) 
        {
           super.paintComponent(g);
           g.setColor(model.getbodyColor());
           g.setColor(model.getwheelColor());
           double length = (double)model.getlength();
           double height = (double)model.getheight();
           double wheelsize = (double)model.getwheelsize();
        }   
    }
}
