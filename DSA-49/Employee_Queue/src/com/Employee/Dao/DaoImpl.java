package com.Employee.Dao;

import com.Employee.bin.Employee;
import com.Employee.bin.Queue;

public class DaoImpl implements IDao{

	static Queue queue;
	
	static
	{
		queue=new Queue();
	}
	@Override
	public void Insert(Employee employee) {
		// TODO Auto-generated method stub
		queue.enqueue(employee);
		
	}
	@Override
	public Employee dequeue() {
		// TODO Auto-generated method stub
		return queue.dequeue();
	}
	@Override
	public void displayAll() {
		// TODO Auto-generated method stub
      queue.display();
		
	}
	@Override
	public void displayfemales() {
		// TODO Auto-generated method stub
		queue.displayfemales();
	}
	@Override
	public void displaymales() {
		queue.displaymales();
		
	}
	@Override
	public void makeempty() {
		// TODO Auto-generated method stub
		queue.empty();
	}
	@Override
	public void revdisplay() {
		// TODO Auto-generated method stub
		queue.revdisplay();
	}

}
