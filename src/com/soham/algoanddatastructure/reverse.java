package com.soham.algoanddatastructure;

import java.util.Scanner;

public class reverse {
	private Node start;
	public reverse() {
		start=null;
	}
	public void createList()
	{
		int i,n,data;
		
		Scanner scan = new Scanner(System.in); 
				
		System.out.print("Enter the number of nodes : ");
		n = scan.nextInt();
		
		if(n==0)
			return;
		
		for(i=1; i<=n; i++)
		{
			System.out.print("Enter the element to be inserted : ");
			data = scan.nextInt();
			insertAtEnd(data);	
		}
	}
	
	 public void insertInBeginning(int data)
		{
			Node temp=new Node(data);
			temp.link=start;
			start=temp;
		}
	 
	public void insertAtEnd(int data)
	{
		Node p;
		Node temp=new Node(data);
		
		if(start==null)
		{
			start=temp;
			return;
		}
		
		p=start;
		while(p.link!=null)
			p=p.link;
		
		p.link=temp;
	}
	public void displayList() {
		 Node p;
		 if(start==null) {
			 System.out.println("linked list is empty");
			 return;
		 }
		 System.out.print("list is :  ");
		 p=start;
		 while(p!=null) 
			 {
					System.out.print(p.info + "  ");
					p=p.link;
				}
				System.out.println();
			}
	
	public void reverseList()
	{
		Node prev, p, next;
		prev=null;
	   	p=start;
		while(p!=null)
		{
			next=p.link;
			p.link=prev;
			prev=p;
			p=next;
		}
		start=prev;
	}
	public void BubbleSortExData()
	{
		Node end,p,q;
		
		for(end=null; end!=start.link; end=p)
		{
	  		for(p=start; p.link!=end; p=p.link)
			{
				q=p.link;
				if(p.info > q.info)
				{
					int temp=p.info;
					p.info=q.info;
					q.info=temp;
				}
			}
		}
	}

}
