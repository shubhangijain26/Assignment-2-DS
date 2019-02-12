import java.util.Scanner;


class node
{
	int data;
	node next;
	node(int data)
	{
		this.data = data;
	}
}

public class SinglyLL {
	

	static node head;
	
	public void insert_beg(int data)
	{
		
		node temp=new node(data);
		temp.next=head;
		head=temp;
		
	}
	
	public void insert_end(int data)
	{
		node temp = new node(data);
		if(head == null)
		{
			head =temp;
		}
		else
		{
			node ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
	}
	
	public void insert_at(int data,int pos)
	{
		node temp = new node(data);
		int count=0;
		node ptr=head;
		while(ptr!=null)
		{
			count++;
			ptr=ptr.next;
		}
		if(pos>count+1||pos<0)
		{
			System.out.println("Invalid position");
		}
		
		else if(pos == 1)
		{
			temp.next=head;
			head=temp;
		}
		else
		{
		ptr=head;
		int i;
		for(i=1;i<pos-1;i++)
		{
			ptr=ptr.next;
		}
		temp.next=ptr.next;
		ptr.next=temp;
		}
		
	}
	
	public void delete_all()
	{
		head = null;
	}
	
	public void deleteBeg()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
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
		
		else
		{
			node ptr = head;
			node preptr=ptr;
			while(ptr.next!=null)
			{
				preptr=ptr;
				ptr = ptr.next;
			}
			preptr.next=null;
		}
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Linked list is empty");
		}
		node ptr = head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	    SinglyLL obj = new SinglyLL();
	    
		int i,n,pos,val;
		
//		System.out.println("Enter no of elements");
//		n=sc.nextInt();
//		System.out.println("Enter elements");
//		for(i=0;i<n;i++)
//		{
//		  obj.insert_beg(sc.nextInt());                //insertion at beginning
//		}
//		System.out.print("insertion at beg : ");
//		obj.display();
		
		System.out.println("Enter no of elements");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		{
		  obj.insert_end(sc.nextInt());                   //insertion at end
		}
		System.out.print("insertion at end : ");
		obj.display();
		
		System.out.println("Enter value for insertion at a position");
		val=sc.nextInt();
		System.out.println("enter position: ");
		pos=sc.nextInt();
		obj.insert_at(val,pos);                              //insertion at a position
		System.out.println("Insertion of "+val+" at position "+pos+" : ");
		obj.display();
		
		System.out.println("Delete at beg");
		obj.deleteBeg();                                    //deletion in beginning
		obj.display();
		
        System.out.println("Delete at end");
		obj.deleteEnd();                                  //deletion at end
		obj.display(); 
		
		
		sc.close();
		

	}

}
