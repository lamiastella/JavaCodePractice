package microsoft_competition;

public class BSTPrint<E> {

public void printInorder(BSTNode<E> root){
	if (root!=null){
		printInorder(root.getLeftNode());
		System.out.println(root.getNodeValue());
		printInorder(root.getRightNode());
	}
}

public void printPreOrder(BSTNode<E> root){
	if (root!=null){
		System.out.println(root);
		printPreOrder(root.getLeftNode());
		printPreOrder(root.getRightNode());
	}
}


public void printPostOrder(BSTNode<E> root){
	if (root!=null){
		printPostOrder(root.getLeftNode());
		printPostOrder(root.getRightNode());
		System.out.println(root);
	}
}
public static void main(String[] argc){
	BSTPrint<String> bstPrint = new BSTPrint<String>();
	BSTNode<String> root=new BSTNode<String>();
	root.setNodeValue("5");
	BSTNode<String> rootLeft= new BSTNode<String>();
	rootLeft.setNodeValue("3");
	root.setLeftNode(rootLeft);
	BSTNode<String> rootRight= new BSTNode<String>();
	rootRight.setNodeValue("8");
	root.setRightNode(rootRight);
	BSTNode<String> rootLeftLeft=new BSTNode<String>();
	rootLeftLeft.setNodeValue("2");
	rootLeft.setLeftNode(rootLeftLeft);
	System.out.println("Inorder traversal is like:");
	bstPrint.printInorder(root);
	System.out.println("Preorder traversal is like:");
	bstPrint.printPreOrder(root);
	System.out.println("Postorder traversal is like:");
	bstPrint.printPostOrder(root);
 }
}
