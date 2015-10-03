package microsoft_competition;

public class LinkedList<E> {
	private Node<E> head= new Node<E>();
	private int size=0;
	public void linkedList(){
		head=null;
		size=0;
	}
	public void add(E data){
		Node<E> currNode=head;
		while (currNode.getNext()!=null){
			currNode.setNext(currNode.getNext());
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
			currNode.setNext(currNode.getNext());
			i++;
		}
		currNode.setNext(currNode.getNext().getNext());
		
	}
	
	public void print(){
		Node<E> currNode = new Node<E>();
		do{
			System.out.println(currNode.getItem());
			
		} while (currNode.getNext()!=null);
	}
	
	
	public static void main(String arc[]){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("9");
		ll.add("b");
		ll.add("987");
		ll.print();
		return;
	}
	
}
