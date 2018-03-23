package carmodel;
import java.awt.event.*;
import java.util.*;
public class CarModel 
{
    private double length;
    private double height;
    private java.awt.Color bodycolor;
    private java.awt.Color wheelcolor;
    private double wheelsize;
    private ArrayList<ActionListener> actionListenerList;
    public double getlength()
    {
        return length;
    }
    public void setlength(double length)
    {
        this.length = length;
        processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "length"));
    }
    public double getheight()
    {
        return height;
    }
    public void setheight(double height)
    {
        this.height = height;
        processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "height"));
    }
    public java.awt.Color getbodyColor() 
    {
      return bodycolor;
    }
    public void setbodyColor(java.awt.Color bodycolor) 
    {
      this.bodycolor = bodycolor;
      processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "bodycolor"));
    }
    public java.awt.Color getwheelColor() 
    {
      return wheelcolor;
    }
    public void setwheelColor(java.awt.Color wheelcolor) 
    {
      this.wheelcolor = wheelcolor;
      processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "wheelcolor"));
    }
    public double getwheelsize()
    {
        return wheelsize;
    }
    public void setwheelsize(double wheelsize)
    {
        this.wheelsize = wheelsize;
        processEvent(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, "wheelsize"));
    }
    public synchronized void addActionListener(ActionListener l) 
    {
        if (actionListenerList == null)
        actionListenerList = new ArrayList<ActionListener>();
        actionListenerList.add(l);
    }

    /** Remove an action event listener */
    public synchronized void removeActionListener(ActionListener l) 
    {
      if (actionListenerList != null && actionListenerList.contains(l))
      actionListenerList.remove(l);
    }
    private void processEvent(ActionEvent e) 
    {
      ArrayList<ActionListener> list;
      synchronized (this) 
      {
        if (actionListenerList == null) return;
        list = (ArrayList<ActionListener>)(actionListenerList.clone());
      }
      for (int i = 0; i < list.size(); i++) 
      {
        ActionListener listener = list.get(i);
        listener.actionPerformed(e);
      }
    }    

    void setbodycolor(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
