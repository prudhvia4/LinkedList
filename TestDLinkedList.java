import java.util.Scanner;
public class TestDLinkedList{
	
	Scanner in=new Scanner(System.in);
	public static void main(String args[])
	{
		
		Node a=new Node(1,null);
		Node b=new Node(2,null);
		Node c=new Node(3,null);
		Node d=new Node(4,null);
		Node e=new Node(5,null);
		LinkedList list1=new LinkedList();
		
		list1.add(a);
		list1.add(b);
		list1.add(c);
		list1.add(d);
		
		list1.print();
		
		list1.insert(e);
		
		// System.out.println("Enter the position for deletion");
		// pos=in.nextInt();
		
		
		
		list1.print();
			list1.printl();
		
	}
	
}