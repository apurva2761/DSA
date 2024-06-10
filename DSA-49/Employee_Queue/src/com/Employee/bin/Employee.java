package com.Employee.bin;

public class Employee {
   int empid;
   String FullName;
   String Gender;
public Employee(int empid, String fullName, String gender) {
	super();
	this.empid = empid;
	FullName = fullName;
	Gender = gender;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public String getGender() {
	return Gender;
}
public void setGender(String gender) {
	Gender = gender;
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", FullName=" + FullName + ", Gender=" + Gender + "]";
}
public Employee() {
	super();
}
   
   
}
