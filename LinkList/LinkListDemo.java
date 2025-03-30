class LinkList
{
	Node head;

	private class Node
	{
		int data;
		Node next;
	}
	
	void add(int d)
	{
		Node newNode = new Node();
		newNode.data = d;
		
		if(head == null)
		{
			head = newNode;
			return;
		}
		
		//Go to last node 
		Node temp = head;
		while(temp.next != null)
		{
			temp = temp.next;
		}
		
		//temp keeps the reference of last node
		temp.next = newNode;
	}
	void display(){
		Node temp =head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
}

class LinkListDemo
{
	public static void main(String args[])
	{
		LinkList list = new LinkList();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(5);
		
		list.display();
	}
}