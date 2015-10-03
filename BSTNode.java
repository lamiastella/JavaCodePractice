package microsoft_competition;

public class BSTNode<E> {
	private E value;
	private BSTNode<E> leftNode=null;
	private BSTNode<E> rightNode=null;

	public BSTNode getLeftNode(){
		return this.leftNode;
	}
	public void setLeftNode(BSTNode rootLeft){
		//BSTNode newLeftNode=new BSTNode();
		//newLeftNode.leftNode=null;
		//this.leftNode=newLeftNode;
		//newLeftNode.value=rootLeft;
		this.leftNode=rootLeft;
	}
	public BSTNode getRightNode(){
		return this.rightNode;
	}
	public void setRightNode(BSTNode rootRight){
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
