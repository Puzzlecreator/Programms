

package javaapplication5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class NewClass4 implements ActionListener {
   Frame f=new Frame ();
	Label l2=new Label("Albanian");
	TextField g=new TextField("",10);
	Label l1=new Label("English");
	TextField m=new TextField("",10);
	Label l3=new Label("Italian");
    TextField u=new TextField("",10);
	Button ok=new Button("Translate");
	FlowLayout org=new FlowLayout();	
	public  NewClass4(){
            
		f.setLayout(org);
		f.setSize(200,200);
		f.add(l1);
		f.add(m);
		f.add(l2);
		f.add(g);
		f.add(l3);
		f.add(u);
		f.add(ok);
		ok.addActionListener(this);
		f.show();
        }
        
	public void actionPerformed(ActionEvent e)
	{
		String sh[]= {"pershendetje","dritare","dere","dysheme","mur"};
		String a[]= {"hello","window","door","floor","wall"};
		String it[]= {"ciao","finesta","porta","porta","porta"};
		String fjala;
		fjala=m.getText();
		for (int i=0;i<sh.length;++i)			
					if(fjala.equals(a[i]))
		{
					g.setText(sh[i]);
					u.setText(it[i]);
		
		}
							
		
	}
	public static void main(String[]args)
	{
		NewClass4 t=new NewClass4();
        }
}
