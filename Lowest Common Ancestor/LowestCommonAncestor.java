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
	 Node findLCA(Node node, int n1, int n2) 
	    {  
	        if (node == null) 	// This checks for empty binary tree
	            return null; 
	   
	        if (node.data == n1 || node.data == n2) 	// This checks if either node matches the root
	            return node; 							// If the node = root then the root is the LCA
	  
	        Node left_lca = findLCA(node.left, n1, n2); 	// This looks for keys in left subtree
	        Node right_lca = findLCA(node.right, n1, n2); 	// This looks for keys in right subtree
	   
	        if (left_lca!=null && right_lca!=null) 		// If one node is found in a right subtree and the other 
	            return node; 							// is found in the left then this adjoining node is the LCA
	  
	        return (left_lca != null) ? left_lca : right_lca; 	//If LCA has not been found then subtrees are traversed
	    } 


}
