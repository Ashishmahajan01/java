package Core_java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Friend {
	private int id;
	private String name;
	private String mobile;
	private String email;
	private String address;
	private Date bdate;

	public Friend() {
		id = 0;
		name = null;
		mobile = null;
		email = null;
		address = null;
		bdate = null;

	}

	public Friend(int id, String name, String mobile, String email, String address, Date bdate) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.bdate = bdate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getMobile() {
		return mobile;
	}

	public String getEmail() {
		return email;
	}
	
	public String getAddress() {
		return address;
	}

	public Date getDate() {
		return bdate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}


	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		String bdt = sdf.format(bdate);
		return "Id: " + id + "\nName : " + name + "\nMobile: " + this.mobile + "\nEmail: "+ email+ "\nAddress: " +address+"\n Birt date: " + bdt;
	}

}
