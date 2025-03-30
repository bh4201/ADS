class LinkList
{
	Node head;

	class Node
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
	/*void deletAtFirst(){
	
		 head = head.next;
	
	}*/
	
/*void deleteAtPosition(int pos){
	 Node temp =head;
	 Node prev =null;
	 if(head.next == null)
	 {
		 head =null;
			return;	
	 }
	 for( int i=1;i<pos-1;i++){
		 temp =temp.next;
		 
	 }
	 
		temp.next =temp.next.next;
	
	}*/	
	/*void deleteAtLast(){
	 Node temp =head;
	 while(temp.next.next!=null){
		 temp=temp.next;
	 }
		temp.next=null;
	
	}*/
	/*void deleteNode(Node n){
		Node temp =head;
		Node prev=null;
		if(head == null)
			return;
		while(temp != null){
			if(temp.data == n.data){
				if(prev == null){
					// first node to be deleted
					head = temp.next;
					temp.next = null;
					return;
				}
				else{
					// intermediate/last node to be deleted
					prev.next = temp.next;
					temp.next = null;
				}
			}
			prev = temp;
			temp = temp.next;
			
		}		
	}*/
	LinkList reverseList(){
		LinkList revList = new LinkList();
		Node  new_node=null;
		Node temp = head;
		
		while(temp !=null){
			Node newNode = new Node(temp.data);
			 
			if(revList.head == null)
			{
				revList.head = newNode;
			}
			else
			{
				newNode.next = revList.head;
				revList.head = newNode;
			}
			
			temp = temp.next;
		}
	
		return revList;
	
	}
	
	void revDisplay(Node node)
	{
		//recursive function to display in reverse order.
		if(node == null) return;
		revDisplay(node.next);
		System.out.print(node.data+" ");
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

class LinkListDemo2
{
	public static void main(String args[])
	{
		LinkList list = new LinkList();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(16);
		list.add(25);
		list.add(6);
		
		//list.display();
		LinkList.Node node = list.new Node(16); 
		//list.deleteNode(node);
		//list.deleteAtPosition(3);
		list.display();
		LinkList revList = list.reverseList();
		System.out.println("Reverse List: ");
		revList.display();
		System.out.println("Reverse List Using Recursion: ");
		list.revDisplay(list.head);
	}
}