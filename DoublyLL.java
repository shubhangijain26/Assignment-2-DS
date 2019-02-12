import java.util.Scanner;

class nodes
{
	int data;
	nodes prev;
	nodes next;
	
	nodes(int data)
	{
		this.data=data;
	}
}
public class DoublyLL {
	
	static nodes head;
	static nodes tail;
	
	public void insert_beg(int data)
	{
		nodes temp=new nodes(data);
		
		if(head == null)
		{
			head = temp;
			tail = temp;
		}
		
		else
		{
		  temp.next = head;
		  head.prev=temp;
		  head = temp;
		}
	}
	
	public void insert_end(int data)
	{
		nodes temp = new nodes(data);
		
		if(head == null)
		{
			head = temp;
			tail = temp;
		}
		
		else
		{
			
			tail.next = temp;
			temp.prev=tail;
			tail = temp;
			
		}
	}
	
	public void display()
	{
		
		if(head==null)
		{
			System.out.println("Empty List");
		}
		else
		{
			nodes ptr=head;
			while(ptr!=null)
			{
				System.out.print(ptr.data+" ");
				ptr=ptr.next;
			}
			System.out.println();
		}
		
	}
	
	public void reverse()
	{
		if(tail == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			nodes ptr = tail;
			while(ptr!=null)
			{
				System.out.print(ptr.data+" ");
				ptr = ptr.prev;
			}
		}
	}
	
	public void deleteBeg()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
		}
		if(head == tail)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = head.next;
		}
	}
	
	public void deleteEnd()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
		}
		if(head == tail)
		{
			head = null;
			tail = null;
		}
		else
		{
			tail.prev.next=null;
		}
	}

	public static void main(String[] args) {
		
		DoublyLL obj = new DoublyLL();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter no of elements");
		int n = sc.nextInt();
		
		System.out.println("Enter elements");
//		for(int i=0;i<n;i++)
//		{
//			obj.insert_beg(sc.nextInt());          //insertion at beginning
//		}
		
		for(int i=0;i<n;i++)
		{
			obj.insert_end(sc.nextInt());          //insertion at end
		}
		
		obj.display();
		
		System.out.println("Reversed list:");
		obj.reverse();
		
		System.out.println();
		
		System.out.println("delete at beginning");      //deletion in beginning
		obj.deleteBeg();
		obj.display();
		
		System.out.println("delete at end");         //deletion in end
		obj.deleteEnd();
		obj.display();
		
		sc.close();

	}

}
