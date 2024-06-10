package com.Employee.Test;
import java.util.*;
import com.Employee.Service.*;
import com.Employee.bin.Employee;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int choice;
		Scanner sc=new Scanner(System.in);
         do {
           System.out.println("1.Insert Employee\n2.Remove Employee\n3.Print complete Queue"
           		+ " using toString\n4.Print all female Employees\n5.Print All Male Employees\n"
           		+ "6.Empty Queue using Recursion\n7.Print Queue in reverse order\nChoice");	 
           choice=sc.nextInt();
           IService service=new ServiceImpl();
           switch(choice)
           {
           case 1:
        	   service.insertEmployee();
        	   break;
           case 2:
        	   Employee emp=service.remove();
        	   System.out.println(emp);
        	   break;
           case 3:
        	   service.Print();
        	   break;
           case 4:
        	   service.printfemales();
        	   break;
           case 5:
        	   service.printmales();
        	   break;
           case 6:
        	   service.Emptyrec();
        	   break;
           case 7:
        	   service.Displayrevqueue();
        	   break;
           }
         }while(choice > 0 && choice < 8);

	}

}
