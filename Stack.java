package microsoft_competition;

import java.util.ArrayList;

public class Stack<E> {
	private ArrayList<E> s = new ArrayList<E>();
	private static int size=0;
	
	public void push(E item){
		s.add(item);
		size++;
		return;
	}
	
	public E pop(){
		return s.remove(--size);
		
	}
	
	public int stackSize(){
		return size;
	}
	

}
