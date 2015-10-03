package microsoft_competition;

public class LinkedList<E> {
	private Node<E> head= new Node<E>();
	//private Node<E> head;
	private int size=0;
	
	//constructor
	public LinkedList(){
		
		size=0;
		
	}
	public void add(E data){
		Node<E> currNode=head;
		while (currNode.hasNext()){
			//currNode.setNext(currNode.getNext());
			currNode = currNode.getNext();
		}
		Node<E> lastNode= new Node<E>();
		lastNode.setItem(data);
		lastNode.setNext(null);
		currNode.setNext(lastNode);
		size++;
	}
	
	public void remove(int i){
		Node<E> currNode = head;
		int index=0;
		while (index<i){
			//currNode.setNext(currNode.getNext());
			currNode = currNode.getNext();
			i++;
		}
		//currNode.setNext(currNode.getNext().getNext());
		currNode = currNode.getNext().getNext();
		
	}
	
	public void print(){
		Node<E> currNode = head;

		while (currNode.hasNext()){
			System.out.println(currNode.getItem());
			currNode=currNode.getNext();
		} 
		System.out.println(currNode.getItem());
	}
	
	
	public static void main(String arc[]){
		LinkedList<String> ll = new LinkedList<String>();
		ll.head.setItem("9");
		ll.add("b");
		ll.add("987");
		ll.print();
		return;
	}
	
}
