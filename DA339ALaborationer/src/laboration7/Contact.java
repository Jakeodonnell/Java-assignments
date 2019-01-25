package laboration7;

public class Contact {
	
	private String name, email, phone, cellphone;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	public String toString(){
		return "Name: " + this.name + "\nPhone: " + this.phone +
				"\nCellphone: " + this.cellphone + "\nEmail: " + this.email;
	}
	
	
}
