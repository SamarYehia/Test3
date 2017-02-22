package phon.com;

import java.io.Serializable;

public class AddRecord implements Serializable{
	
	public AddRecord(){
	
	}
	private String name;
	private String number;
	private String address;
	
	public AddRecord(String name,String number,String address){
		this.name=name;
		this.number=number;
		this.address=address;
	}
	/*public void setName(String name) {
	       this.name = name;
	    }
	public void setNumber(String number) {
	       this.number = number;
	    }
	public void setAddress(String address) {
	       this.address = address;
	    }*/
	
	 public String getName() {
	       return name;
	    }
	 public String getNunmber() {
	       return number;
	    }
	 public String getAddress() {
	       return address;
	    }
	 
	 
	
	
}
