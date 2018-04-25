import java.util.Scanner;
public class DLinkedList
{
	Scanner in=new Scanner(System.in);
	DNode head=null;
	int size;
	
	public DLinkedList()
	{
		size=0;
	}
	
	public void add(DNode node)
	{
		if(head==null)
		{
			this.head=node;
			size++;
		}
		else
		{
			DNode curr=head;
			
			while(curr.hasNext())
			{
				curr=curr.getNext();
				
			}
			
			curr.setNext(node);
			node.setPrevious(curr);
			size++;
			
		}
		
	}
	
	public int getSize()
	{
		return size;
	}
	
	public void print()
	{
	DNode curr=head;
			
			while(curr.hasNext())
			{
				System.out.println("data->"+curr.getData());
				curr=curr.getNext();
				
			}
	System.out.println("data->"+curr.getData());
	
	}
	

	public void insert(DNode node)
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
		DNode curr=head;
		while(i<pos-1)
		{
			curr=curr.getNext();
			i++;
			
		}
		
		node.setNext(curr.getNext());
		
		curr.setNext(node);
		node.setPrevious(curr);
		node.getNext().setPrevious(node);
		size++;
		return;
		
	}
	
	
	public void printl()
	{
	DNode curr=head;
			
				System.out.println("**data->"+curr.getData());
				curr=curr.getNext().getNext().getNext();
				System.out.println("**data->"+curr.getData());
				
	System.out.println("data->"+curr.getData());
	
	}
	
	
	
	
	
	
	
	
}