package microsoft_competition;

public class BSTNode<E> {
	private E value;
	private BSTNode<E> leftNode=null;
	private BSTNode<E> rightNode=null;

	public BSTNode<E> getLeftNode(){
		return this.leftNode;
	}
	public void setLeftNode(BSTNode<E> rootLeft){
		//BSTNode newLeftNode=new BSTNode();
		//newLeftNode.leftNode=null;
		//this.leftNode=newLeftNode;
		//newLeftNode.value=rootLeft;
		this.leftNode=rootLeft;
	}
	public BSTNode<E> getRightNode(){
		return this.rightNode;
	}
	public void setRightNode(BSTNode<E> rootRight){
		//BSTNode newRightNode=new BSTNode();
		//newRightNode.rightNode=null;
		//this.rightNode=newRightNode;
		//newRightNode.value=rootRight;
		this.rightNode=rootRight;
	}

	public E getNodeValue(){
		return this.value;
	}
	
	public void setNodeValue(E value){
		this.value=value;
	}

}
