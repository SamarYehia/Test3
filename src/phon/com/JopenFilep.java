package phon.com;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;


import java.awt.TextArea;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class JopenFilep extends JFrame  {

	private JPanel contentPane;
	 TextArea aa = new TextArea();
	
	 
	
	public JopenFilep() {
		setTitle("Open File");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnNewButton = new JButton("Open");
		btnNewButton.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				File selectedFile=null;
				 String s="";
				JFileChooser fileChooser = new JFileChooser("C:\\Users\\samar\\Documents\\eclipseProjects"); //choose the open directory
				//	fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
				int result = fileChooser.showOpenDialog(null);
				if (result == JFileChooser.APPROVE_OPTION) {
					
				     selectedFile = fileChooser.getSelectedFile();
				    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
				  s=selectedFile.getAbsolutePath();
				  System.out.println(s);
				}
				String x="";
		    	 JFrame frame2 = new JFrame("Test");
		    	 JPanel panel = new JPanel();	
		    	 aa=new TextArea();
		    	 panel.setBorder(new EmptyBorder(5, 5, 5, 5));
				
				    try {
				 /*   FileInputStream fis=new FileInputStream(selectedFile);
				   	ObjectInputStream ois = new ObjectInputStream(fis);
				    ArrayList <AddRecord> ReadData =(ArrayList<AddRecord>) ois.readObject();

				    for(int i=0;i<ReadData.size();i++){
			        	System.out.println(ReadData.get(i).getName());
			        	System.out.println(ReadData.get(i).getNunmber());
			        	System.out.println(ReadData.get(i).getAddress());
				    	x+=ReadData.get(0).getName();
			         }*/
				    	
				    	 FileTest f= new FileTest();
				    	    f.readObjetFile(s);
			        
				   	
				    	/* FileReader r=new FileReader(selectedFile);
				    	  int i=0;
						  while((i=r.read())!=-1)  
				    		  x+=(char)i;
				    	 System.out.println(x) ;	*/
				    	 
				    	 
				    	 
					} catch (FileNotFoundException e) {
					
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				    
				      //aa.setText(x);
				      panel.add(aa);
				      frame2.add(panel);
				      frame2.setVisible(true);
			    	  frame2.setSize(500,500);
			  	
			
				
			}
		});
		
		btnNewButton.setBounds(20, 37, 89, 23);
		contentPane.add(btnNewButton);
		
		aa.setBounds(44, 91, 380, 160);
		
		contentPane.add(aa);
		
	}
	
}
