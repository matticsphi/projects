package carmodel;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class CarController extends JPanel
{
    private CarModel model;
    private JTextField jtflength = new JTextField();
    private JTextField jtfheight = new JTextField();
    private JTextField jtfwheelsize = new JTextField();
    private JComboBox jcbobodycolor = new JComboBox(new String[] { " Blue ","Red","Yellow"});
    private JComboBox jcbowheelcolor = new JComboBox(new String[] { " Yellow ","Blue","Red"});
    public CarController()
    {
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(4, 2));
        panel1.add(new JLabel("length"));
        panel1.add(new JLabel("height"));
        panel1.add(new JLabel("wheelsize"));
        panel1.add(new JLabel("wheelcolor"));
        panel1.add(new JLabel("bodycolor"));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(6, 2));
        panel2.add(jtflength);
        panel2.add(jtfheight);
        panel2.add(jtfwheelsize);
        panel2.add(jcbobodycolor);
        panel2.add(jcbowheelcolor);        
        setLayout(new BorderLayout());
        add(panel1, BorderLayout.WEST);
        add(panel2, BorderLayout.CENTER);
        jtflength.addActionListener(new ActionListener() 
        {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //if (model != null) 
            model.setlength(Double.parseDouble(jtflength.getText()));
        }
        });
        jtfheight.addActionListener(new ActionListener() 
        {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //if (model != null) 
            model.setheight(Double.parseDouble(jtfheight.getText()));
        }
        });
        jtfwheelsize.addActionListener(new ActionListener() 
        {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //if (model != null) // Set radius in the model 
            model.setwheelsize(Double.parseDouble(jtfwheelsize.getText()));
        }
        });
        jcbobodycolor.addActionListener(new ActionListener() 
        {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //if (model != null) // Set radius in the model 
            model.setbodyColor(Color.blue);//((String)jcbobodycolor.getSelectedItem());
        }
        });
        jcbowheelcolor.addActionListener(new ActionListener() 
        {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            //if (model != null) // Set radius in the model 
            model.setwheelColor(Color.yellow);//setwheelcolor((String)jcbowheelcolor.getSelectedItem());
        }
        });
    }
    public void setModel(CarModel newModel) 
    {
        model = newModel;
    }

    public CarModel getModel() 
    {
        return model;
    }
}
