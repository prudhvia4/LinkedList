public class DNode
{
	private int data;
	
	private DNode next;
	private DNode previous;
	
	public DNode(int data,DNode previous,DNode Next)
	{
		this.data=data;
		this.next=next;
		this.previous=previous;
	}
	public void setData(int data)
	{
		this.data=data;
	
	}
	
	public void setNext(DNode next)
	{
		this.next=next;
	}
	public void setPrevious(DNode previous)
	{
		this.previous=previous;
	}
	public DNode getNext()
	{
	return this.next;
	}
	public DNode getPrevious()
	{
	return this.previous;
	}
	
	public int getData()
	{
	return this.data;
	}
	
	public boolean hasNext()
	{
		if(next!=null)
			return true;
		else return false;
	}
	public boolean hasPrevious()
	{
		if(previous!=null)
			return true;
		else return false;
	}
	
	
	
}