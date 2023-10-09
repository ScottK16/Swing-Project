package package1;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.ItemEvent;
//import java.awt.event.ItemListener;
import java.util.ArrayList;

public class GUI implements ActionListener {

	
	private static JLabel namelabel;
	private static JLabel addresslabel;
	//private static JLabel output;
	private static JLabel output2;
	private static JLabel output3;
	private static JLabel output4;
	private static JTextField text;
	private static JTextField text2;
	private static JTextArea textarea;
    //private static JTextArea textarea2;
	private static JButton button1;
	private static JButton button2;
	private static JButton button3;
	private static JButton button4;
	private static JCheckBox cb1;
	private static JCheckBox cb2;
    private static JCheckBox cb3;
    //private static JScrollPane scroll;
    
    


	public GUI() {
	JFrame frame = new JFrame(); //Creates Frame
	
	
	                                                                                  
	namelabel = new JLabel("Name");
	namelabel.setBounds(10, 20, 80, 25);
	//output = new JLabel();
	output2 = new JLabel();
	output3 = new JLabel();
	output4 = new JLabel();
	
	
	text = new JTextField("Peter Smith",20); //Text Field
	text.setBounds(100, 20, 100, 20);
	textarea = new JTextArea(5 , 10);
	textarea.setEditable(false);
	
	addresslabel = new JLabel("Address");
	addresslabel.setBounds(30, 20, 80, 25);
	
	
	text2 = new JTextField("35 Liffey Street, Dublin 2",20); //Text Field 2
	text2.setBounds(100, 50, 100, 20);
	button1 = new JButton("Submit");
	button1.setBounds(100, 80, 80, 25);
	
	JScrollPane scroll = new JScrollPane (textarea); scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
	
	button2 = new JButton("Clear");
	button2.setBounds(120, 80, 80, 25);
	button3 = new JButton("Finish");
	button4 = new JButton("Clear all");
	
	cb1 = new JCheckBox("Databases");
	cb2 = new JCheckBox("Java");
	cb3 = new JCheckBox("Accountancy");
	cb1.setFocusable(false);
	cb2.setFocusable(false);
	cb3.setFocusable(false);
	
	
	
	
	
	cb1.addActionListener(this);
	cb2.addActionListener(this);
	cb3.addActionListener(this);
		
	
	button1.addActionListener(this);
	button2.addActionListener(e -> text.setText(" "));
	button2.addActionListener(e -> text2.setText(" "));
	
	button3.addActionListener(e-> System.exit(0));
	button4.addActionListener(e -> textarea.setText(""));
	
    //-----------------------------------------------NEW STUDENT--------------------//	
	Border blackline = BorderFactory.createTitledBorder("New Student"); //Titled Border
	JPanel panelNewStudent = new JPanel(); //Panel
	LayoutManager layout = new BorderLayout(); //Layout for Border
	panelNewStudent.setLayout(layout); //Layout
	panelNewStudent.setBorder(blackline); //Layout
	
	//-----------------------------------------------------ADD STUDENT------------//
	JPanel panelAddStudent = new JPanel(); //Add Student Panel
	panelAddStudent.add(new JLabel(" ")); //SwingConstants.CENTER));
	panelNewStudent.add(panelAddStudent);
	panelAddStudent.setBackground(Color.gray);
	
	//---------------------------------------------SHOW STUDENT-----------------//
	JPanel panelShowStudent = new JPanel(); //Show Student Panel
	LayoutManager layout2 = new BorderLayout(); //layout 2
	panelShowStudent.setLayout(layout2);
	panelShowStudent.setBounds(100,70, 250, 150);
	panelShowStudent.add(new JLabel("Test"));
	//LayoutManager layout2 = new BorderLayout(); //layout 2
	//JPanel panelShowStudent = new JPanel(); //Show Student Panel
	
	
	//--------------------------------------------------------MODULES PANEL------------------//
	JPanel panelModules = new JPanel(); //Module JPanel
	LayoutManager layout3 = new GridLayout(0, 1); // Layout for Module JPanel
	panelModules.setLayout(layout3);
	panelModules.add(new JLabel(""));
	//panelModules.setBounds(500, 200, 200, 100);
	panelModules.setBackground(Color.gray);
	//panelNewStudent.add(panelModules);
	
	
	panelAddStudent.add(namelabel);
	panelAddStudent.add(text);
	panelAddStudent.add(addresslabel);
	panelAddStudent.add(text2);
	panelAddStudent.add(button1);
	panelAddStudent.add(button2);
	
	panelModules.add(cb1);
	panelModules.add(cb2);
	panelModules.add(cb3);
	
	panelModules.add(output2);
	panelModules.add(output3);
	panelModules.add(output4);
	
	//panelShowStudent.add(output);
	panelShowStudent.add(textarea);
	
	
	//-------------------------------------------------------------------------//
	JPanel panelButtons = new JPanel(); //Panel 2
	panelButtons.add(button3);
	panelButtons.add(button4);
	panelButtons.setBackground(Color.gray);
	panelButtons.add(panelShowStudent);
	//-------------------------------------------------------------------------//
	frame.add(panelNewStudent, BorderLayout.NORTH);
	frame.add(panelButtons, BorderLayout.SOUTH);
	frame.add(panelModules, BorderLayout.EAST);
	frame.add(panelShowStudent, BorderLayout.NORTH);
	frame.getContentPane().add(panelModules, BorderLayout.EAST);
	frame.getContentPane().add(panelNewStudent, BorderLayout.NORTH);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setTitle("Student Information System");
	frame.pack();
	frame.setSize(950, 650);
	frame.setVisible(true);	
	
	}
	
		
	
	
public static void main(String [] args) {
	new GUI();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1) {
			

			
			ArrayList<Student> students;
			final int STUDENTS_SIZE = 5;
			
			students = new ArrayList<Student>();
			
			
			
			
			
			
			
	     for (int count = 0; count <STUDENTS_SIZE; count++);
			
			
		Student student1 = null;	
		String name = text.getText();
		String address = text2.getText();
		student1 = new Student(name, address);
		students.add(student1);
		for (Student s: students)
		{
			System.out.println(s.toString());
			
		
		textarea.append(s.toString());
		//textarea.setText(s.toString());
		//output.setText(s.toString());
		}
		}
		if (cb1.isSelected()) {
			output2.setText("Databases");
			
		}
	
        if (cb1.isSelected() == false) {
		
		    output2.setText("");
	    }
		
		if (cb2.isSelected()) {
			output3.setText("Java");
		}
		if (cb2.isSelected() == false) {
				
			    output3.setText("");
		    }
		if (cb3.isSelected()) {
			
			output4.setText("Accounting");
		}
           if (cb3.isSelected() == false) {
			
			output4.setText("");
		}
              if(e.getSource()==button1) {
        	   if (text.equals(null))
              { 
                   System.out.println("Input Invalid Error");    
              }
        	  if(e.getSource()==button1) {
                 if (text2.equals(null))
                { 
                  System.out.println("Input Invalid Error");
                      
                   }

}
}
}
}





	

		
	
	
	

	

	
	


	
//button2.addActionListener(new ActionListener() {
//public void actionPerformed(ActionEvent arg0) {
//text.setText(" ");	
//text2.setText(" ");

	




	



