class LinkList
{
	Node head;

	private class Node
	{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}

	}
	void add(int data){
		Node  new_node = new Node(data);
		
		if(head == null){
			head = new_node;
			return;
		}
		Node temp = head;
		while(temp.next != null){
			temp= temp.next;
		}
		//it keeps the refrence of last node
		temp.next = new_node;
	}
	// insert at position first
	void insertAtFirst(int data){
		Node  new_node = new Node(data);
		Node temp = head;
		 head = new_node;
		 head.next =temp;
	}
	void insertAtGivenPsotion(int pos, int data){
		Node  new_node = new Node(data);
		Node temp = head;
		Node current=head;
		for(int i=1; i<pos-1;i++){
			
			current =current.next;
		}
		new_node.next = current.next;
		current.next = new_node;
		
	}
	void insertAtTail(int data){
		Node  new_node = new Node(data);
		Node temp = head;
		
		while(temp.next!=null){	
			temp = temp.next;
		}
		temp.next=new_node;
		return;
	}	
	
	
	
	
	
	
	void display(){
		Node temp =head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
}

class LinkListDemo1
{
	public static void main(String args[])
	{
		LinkList list = new LinkList();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(5);
		
		list.display();
		
		list.insertAtGivenPsotion(3,150);
		list.display();
		list.insertAtFirst(90);
		list.display();
		
		list.insertAtTail(55);
		list.display();
	
	}
}