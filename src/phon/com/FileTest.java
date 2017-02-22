package phon.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class FileTest {

public void readObjetFile(String path) throws IOException, ClassNotFoundException{
	 FileInputStream fis=new FileInputStream(path);
	  ObjectInputStream ois = new ObjectInputStream(fis);
	  ArrayList <AddRecord> ReadData =(ArrayList<AddRecord>) ois.readObject();
	/*    ReadData.add(obj9);
	    Out.writeObject(ReadData);
	    Out.flush();
	    Out.close();*/
	    
	         for(int i=0;i<ReadData.size();i++){
	        	 System.out.print(ReadData.get(i).getName()+" ");
	        	 System.out.print(ReadData.get(i).getNunmber()+" ");
	        	 System.out.print(ReadData.get(i).getAddress()+" ");
	        	 System.out.println();
	         }
	
}
public static void main(String[] args) throws IOException, ClassNotFoundException {

    
	FileOutputStream fos= new FileOutputStream("sample.txt");
    ObjectOutputStream Out = new ObjectOutputStream(fos);
    
   
    
  ArrayList <AddRecord> WriteData =new ArrayList();
    AddRecord obj =new AddRecord("samar","010101010","Giza");
    AddRecord obj2 =new AddRecord("mona","010101010","cairo");
    AddRecord obj3 =new AddRecord("abeer","010101010","caiross");
    AddRecord obj4 =new AddRecord("sara","1201250","fayoum");
    AddRecord obj5 =new AddRecord("manar","452222","luxor");
    AddRecord obj6 =new AddRecord("nada","5522000","sinaa");
    AddRecord obj7 =new AddRecord("rehame","56263","Alex");
    AddRecord obj8 =new AddRecord("Shimaa","56263","Alex");
    AddRecord obj9 =new AddRecord("Alaa","56263","Alex");

    WriteData.add(obj);
    WriteData.add(obj2);
    WriteData.add(obj3);
    WriteData.add(obj4);
    WriteData.add(obj5);
    WriteData.add(obj6);
    WriteData.add(obj7);
    WriteData.add(obj8);
    WriteData.add(obj9);
    Out.writeObject(WriteData);
   
    
    Out.flush();
    Out.close();
    FileTest f= new FileTest();
    f.readObjetFile("sample.txt");
        
 
        
        
}
}