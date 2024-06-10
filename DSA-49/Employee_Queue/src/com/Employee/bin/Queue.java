package com.Employee.bin;

public class Queue {

	Node Rear;
	Node Front;
	public Queue()
	{
		Rear=null;
		Front=null;
	}
	 class Node{
		 Node prev;
		Employee emp;
		Node next;
		
		public Node()
		{
			prev=null;
			emp=null;
			next=null;
		}
		public Node(Employee E)
		{
			prev=null;
            emp=E;
            next=null;
		}
	}
	public void enqueue(Employee employee) {
       		Node Newnode=new Node(employee);
       		
       		if(isEmpty())
       		{
       			Rear=Newnode;
       			Front=Newnode;
       		}
       		else
       		{
       			Rear.next=Newnode;
       			Newnode.prev=Rear;
       			Rear=Newnode;
       		}
	}
	private boolean isEmpty() {
		// TODO Auto-generated method
		if(Front==null)
		{
			return true;
		}
		return false;
	}
	public Employee dequeue() {
		// TODO Auto-generated method stub
		Employee emp;
		if(!isEmpty())
		{
			emp=Front.emp;
			Node temp=Front;
			Front=Front.next;
			temp.emp=null;
			temp=null;
			return emp;
		}
		return null;
	}
	public void display() {
		// TODO Auto-generated method stub
		
		if(isEmpty())
		{
			System.out.println("No Data in Queue");
		}
		else
		{
			Node temp=Front;
			while(temp!=null)
			{
				System.out.println(temp.emp);
				temp=temp.next;
				
			}
		}
		
	}
	public void displayfemales() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("No Data in Queue");
		}
		else
		{
			Node temp=Front;
			while(temp!=null)
			{
				if((temp.emp.Gender.equals("female")) || temp.emp.Gender.equals("Female") )
				{
					System.out.println(temp.emp);	
				}
				
				temp=temp.next;
				
			}
		}
	}
	public void displaymales() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("No Data in Queue");
		}
		else
		{
			Node temp=Front;
			while(temp!=null)
			{
				if((temp.emp.Gender.equals("male")) || temp.emp.Gender.equals("Male") )
				{
					System.out.println(temp.emp);	
				}
				
				temp=temp.next;
				
			}
		}
	}
	public void empty() {
		// TODO Auto-generated method stub
		empty(Front);
		
	}
	private Object empty(Node front2) {
		// TODO Auto-generated method stub
		if(front2==null)
		{
			System.out.println("Queue is Empty Successfully");
			Front=null;
			return null;
		}
		else
		{ 
			Node temp=front2;
		     temp.emp=null;
		      temp=null;
			return empty(front2.next);
		}
	}
	public void revdisplay() {
		// TODO Auto-generated method stub
		if(isEmpty())
		{
			System.out.println("No Data in Queue");
		}
		else
		{
			Node temp=Rear;
			while(temp!=null)
			{
				System.out.println(temp.emp);
				temp=temp.prev;
				
			}
		}
		
	}

	
}
