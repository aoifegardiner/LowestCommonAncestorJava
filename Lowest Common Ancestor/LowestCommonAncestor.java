class Node
{
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}
public class LowestCommonAncestor {
	Node root;
	
	Node findLCA(int n1, int n2) 
	{
		return findLCA(root, n1, n2);
	}

}
