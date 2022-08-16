package com.empjpa.Emp;

import javax.persistence.*;




@Entity
public class EmployeeEntity {

  @Id
  private int e_no;
  private int e_sal;

  private String e_name, e_designation;
  
  
public int getE_no() {
	return e_no;
}

public void setE_no(int e_no) {
	this.e_no = e_no;
}

public int getE_sal() {
	return e_sal;
}

public void setE_sal(int e_sal) {
	this.e_sal = e_sal;
}

public String getE_name() {
	return e_name;
}

public void setE_name(String e_name) {
	this.e_name = e_name;
}

public String getE_designation() {
	return e_designation;
}

public void setE_designation(String e_designation) {
	this.e_designation = e_designation;
}



 

}
