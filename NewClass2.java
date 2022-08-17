

package javaapplication5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class NewClass2 implements ActionListener{ 
    
    Frame f=new Frame();
    
	Label l1=new Label("Emri i punetorit");
	TextField m=new TextField("",25);
	Label l2=new Label("Pagesa per ore");
	TextField g=new TextField("",25);
	Label l3=new Label("Numerimi i oreve");
	TextField j=new TextField("",25);
	Button ok=new Button("Totali");
	FlowLayout org=new FlowLayout();
	//Label l5=new Label("Totali");
	TextField q=new TextField("",25);
        
        public NewClass2(){
            f.setLayout(org);
		f.setSize(250,300);
		f.add(l1);
		f.add(m);
		f.add(l2);
		f.add(g);
		f.add(l3);
		f.add(j);
		f.add(ok);
		//f.add(l5);
		f.add(q);
		ok.addActionListener(this);
		f.show();
        }
        public void actionPerformed(ActionEvent e)
	{
            
		int a=Integer.parseInt(j.getText());
		int c=Integer.parseInt(g.getText());
		int z=a*c;
		
			q.setText(""+z );
		
	}
        
	public static void main(String[]args)
	{
		NewClass2 o= new NewClass2();
		
	}
}
