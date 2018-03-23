package carmodel;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CarMain extends JApplet
{
    private JButton jbtController = new JButton("Show Controller");
    private JButton jbtView = new JButton("Show View");
    private CarModel model = new CarModel();
    public CarMain()
    {
        setLayout(new FlowLayout());
        add(jbtController);
        add(jbtView);
        jbtController.addActionListener(new ActionListener() 
        {
           public void actionPerformed(ActionEvent e) 
           {
            JFrame frame = new JFrame("Controller");
            CarController controller = new CarController();
            controller.setModel(model);
            frame.add(controller);
            frame.setSize(200, 100);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
           }
        });
        jbtView.addActionListener(new ActionListener() 
        {      
           public void actionPerformed(ActionEvent e) 
           {
            JFrame frame = new JFrame("View");
            CarView view = new CarView();
            view.setModel(model);
            frame.add(view);
            frame.setSize(500, 200);
            frame.setLocation(200, 200);
            frame.setVisible(true);
           }
        });
    }    
    public static void main(String[] args) 
    {
        CarMain applet = new CarMain();
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Car");
        frame.getContentPane().add(applet, BorderLayout.CENTER);
        frame.setSize(400, 90);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

