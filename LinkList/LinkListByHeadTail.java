
class LinkList
{
	Node head;
	Node tail;

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
		Node newNode = new Node(data);	
		if(head == null)
		{
			head = newNode;	
			tail = newNode
			return;
		}
		tail.next = newNode;
		tail =newNode;
	}

	void display(){
		Node temp =head;
		while(temp != null){
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}		
	
}
class LinkListByHeadTail{
	public static void main(String args[])
	{
		LinkList list = new LinkList();
		list.add(5);
		list.add(8);
		list.add(4);
		list.add(5);
	}
}