import java.util.Scanner;
public class LinkedList
{
	Scanner in=new Scanner(System.in);
	Node head=null;
	int size;
	
	public LinkedList()
	{
		size=0;
	}
	
	public void add(Node node)
	{
		if(head==null)
		{
			this.head=node;
			size++;
		}
		else
		{
			Node curr=head;
			
			while(curr.hasNext())
			{
				curr=curr.getNext();
				
			}
			
			curr.setNext(node);
			size++;
			
		}
		
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void print()
	{
	Node curr=head;
			
			while(curr.hasNext())
			{
				System.out.println("data->"+curr.getData());
				curr=curr.getNext();
				
			}
	System.out.println("data->"+curr.getData());
	
	}
	
	public void insert(Node node)
	{
		int pos;
		System.out.println("Enter the position for insertion");
		pos=in.nextInt();
		
		if(pos>size)
		{
		System.out.println("Invalid Position");
		return;
		}
		
		int i=1;
		Node curr=head;
		while(i<pos-1)
		{
			curr=curr.getNext();
			i++;
			
		}
		
		node.setNext(curr.getNext());
		curr.setNext(node);
		size++;
		return;
		
	}
	
	
	public void printl()
	{
	Node curr=head;
			
				System.out.println("**data->"+curr.getData());
				curr=curr.getNext().getNext().getNext();
				System.out.println("**data->"+curr.getData());
				
	System.out.println("data->"+curr.getData());
	
	}
	
	
	
	
	
	
	
	
}