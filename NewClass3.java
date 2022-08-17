

package javaapplication5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class NewClass3  implements ActionListener{
    Frame f=new Frame();
	Label l1=new Label("Mosha");
	TextField m=new TextField("",25);
	Label l2=new Label("Gjatesia me cm!!!");
	TextField g=new TextField("",25);
	Label l3=new Label("Gjinia");
	TextField j=new TextField("",25);
	Button ok=new Button("Hyrje");
	FlowLayout org=new FlowLayout();
	Label l4=new Label("Pesha");
	TextField q=new TextField(" ",25);
	public NewClass3(){
    
		f.setLayout(org);
		f.setSize(250,300);
		f.add(l1);
		f.add(m);
		f.add(l2);
		f.add(g);
		f.add(l3);
		f.add(j);
		f.add(ok);
		f.add(l4);
		f.add(q);
		ok.addActionListener(this);
		f.show();
                
}
        public void actionPerformed(ActionEvent e)
	{
            double k;
       
		char b= j.getText().charAt(0);
		
			double a=Integer.parseInt(m.getText());
			double c=Integer.parseInt(g.getText());
			if (b=='m'){
				k=0.9;}
                        else{
				k=0.8;
			double w=((c-100)-(a/10))*k;
                     
			q.setText(" "+w);
   }
		
			
			
					
		
		
	}
	public static void main(String[]args)
	{
		NewClass3 t=new NewClass3();
				
}
}
