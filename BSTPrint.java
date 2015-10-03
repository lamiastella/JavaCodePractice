package microsoft_competition;

public class BSTPrint {

public void printInorder(BSTNode root){
	if (root!=null){
		printInorder(root.getLeftNode());
		System.out.println(root.getNodeValue());
		printInorder(root.getRightNode());
	}

}

public static void main(String[] argc){
	BSTPrint bstPrint = new BSTPrint();
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
	bstPrint.printInorder(root);
 }
}
