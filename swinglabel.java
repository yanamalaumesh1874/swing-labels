import javax.swing.*;  
class swinglabel
{  
public static void main(String args[])  
    {  
    JFrame f= new JFrame("Label");  
    JLabel l1,l2;  
    l1=new JLabel("First Label");  
    l1.setBounds(100,150, 100,30);  
    l2=new JLabel("Second Label");  
    l2.setBounds(100,100, 100,30);  
    f.add(l1);
	f.add(l2);  
    f.setSize(400,300);  
    f.setLayout(null);   
    f.setVisible(true);  
    }  
}  
