
 
package javaapplication5;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class NewClass implements ActionListener{
    
	JFrame f=new JFrame ();
        Label l8 = new Label("\t\t\t\t\tCmimi te vendoset ne te reja\t");
	Label l1=new Label("Bruto ");
	TextField m=new TextField("",27);
    Label l2=new Label("Taxes");
    TextField q=new TextField("",20);
    Label l3=new Label("Wage insurance");
	TextField g=new TextField("",20);
	Label l4=new Label("Wage policy");
    TextField u=new TextField("",20);
    Label l5=new Label("Wage for employer ");
    TextField w=new TextField("",20);
    Label l6=new Label ("Wage of employer");
    TextField v=new TextField("",27);
    Label l7=new Label("\nNeto");
    TextField z=new TextField("",29);
    Button ok=new Button("\nConvert");
    FlowLayout org=new FlowLayout ();
    public NewClass (){
        
    	f.setLayout(org);
		f.setSize(300,500);
                f.add(l8);
    	f.add(l1);
    	f.add(m);
		f.add(l2);
		f.add(q);
		f.add(l3);
		f.add(g);
    	f.add(l4);
    	f.add(u);
    	f.add(l5);
    	f.add(w);
    	f.add(l6);
    	f.add(v);
    	f.add(l7);
    	f.add(z);
    	f.add(ok);
    	ok.addActionListener(this);
		f.show();
    	
    }
     public void actionPerformed (ActionEvent e)
    {
    	
    String pb=m.getText();
    int a= Integer.parseInt(m.getText());
    String pn=z.getText();
    
    double she=0;
    double ta=0;
    double pta=0;
    double shq=0;
    double shqp=0;

    if(a<30000)
    {
    	 ta=0;
    pta=a*ta;
    }
    else
    if( a>30001&&a<130000)
    {
    ta=0.13;
    pta=(a-30000)*ta;
    
    }
    else 
    	if(a>130000)
    	{
    		ta=0.23;
    	     pta=(a-130000)*ta+100000*0.13;
    	}
    q.setText(""+pta);
    she=a*0.017;
    g.setText(""+she);
    
    if(a<97000)
    {
     shq=a*0.095;
 
    } 
     
    else
    	 if(a>97000)
    	    {
    	    shq=97000*0.095;
    	    }   
    	    
    double shep=a*0.017;
    v.setText(""+shqp);
    u.setText(""+shq);
    w.setText(""+shep);
double z1= a-ta-she-shq;
z.setText(""+z1);
    
    }   
	public static void main(String[]args)
	{
		NewClass y= new NewClass();
	}


}
