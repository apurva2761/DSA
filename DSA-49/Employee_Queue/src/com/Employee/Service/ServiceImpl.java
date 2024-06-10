package com.Employee.Service;
import com.Employee.Dao.*;
import java.util.*;
import com.Employee.bin.Employee;
public class ServiceImpl implements IService{
	private IDao dao=null;
	public ServiceImpl()
	{
		dao=new DaoImpl();
	}

	@Override
	public void insertEmployee() {
		// TODO Auto-generated method stub
		Employee employee;
		Scanner sc=new Scanner(System.in);
	      System.out.println("Enter ID");
	      int id=sc.nextInt();
	      
	      System.out.println("Enter Name");
	      String name=sc.next();
	      
	      System.out.println("Enter Gender");
	      String gen=sc.next();
	      
	      employee=new Employee(id,name,gen);
		dao.Insert(employee);
	}

	@Override
	public Employee remove() {
		// TODO Auto-generated method stub
		return dao.dequeue();
	}

	@Override
	public void Print() {
		// TODO Auto-generated method stub
		dao.displayAll();
	}

	@Override
	public void printfemales() {
		// TODO Auto-generated method stub
		dao.displayfemales();
	}

	@Override
	public void printmales() {
		// TODO Auto-generated method stub
		dao.displaymales();
	}

	@Override
	public void Emptyrec() {
		// TODO Auto-generated method stub
		dao.makeempty();

	}

	@Override
	public void Displayrevqueue() {
		// TODO Auto-generated method stub
		dao.revdisplay();
	}

}
