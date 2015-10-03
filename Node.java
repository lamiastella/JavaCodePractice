package microsoft_competition;

public class Node<E> {
	private E item;
	private Node<E> next;
	
	
	public Node<E> getNext(){
		return this.next;
	}
	public void setNext(Node<E> n){
		this.next=n;
	}
	
	public E getItem(){
		return this.item;
	}
	
	public void setItem(E item){
		this.item=item;
	}
	
	public boolean hasNext(){
		return (this.next != null);
	}
}
