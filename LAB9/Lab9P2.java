import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Lab9P2 extends JFrame{

	Lab9P2(){
	super("JTable Demo");
	String[] heading = {"Name","Course","Rollno"};
	String[][] data= {
			{"sri","Cse","1"},
			{"siri","Csd","2"},
	                {"sai","Csm","3"},
	};
	JTable jt = new JTable(data,heading);
	
	JScrollPane scrollPane = new JScrollPane(jt);
	add(scrollPane);
	//add(jt);
	setVisible(true);
	setSize(500,500);
	//setLocationRelativeTo(null); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new Lab9P2();
	
	}
}













