import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Lab9P1 extends JFrame{
	Label l;
	Lab9P1(){
	super("Tabbed Pane Demo");
	JTabbedPane jtp = new JTabbedPane(SwingConstants.TOP);
	jtp.add("Tab1",new Label("Tapped Pane 1"));
	jtp.add("Tab2",new Label("Tapped Pane 2"));
	jtp.add("Tab3",new Label("Tapped Pane 3"));
	//jtp.setTabPlacement(SwingConstants.TOP);
	add(jtp);
	setVisible(true);
	setSize(500,500);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new Lab9P1();
	
	}
}













