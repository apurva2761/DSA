package com.Employee.Dao;

import com.Employee.bin.Employee;

public interface IDao {

	void Insert(Employee employee);

	Employee dequeue();

	void displayAll();

	void displayfemales();

	void displaymales();

	void makeempty();

	void revdisplay();

}
