import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LowestCommonAncestorTest {

	@Test
	public void testEmptyTree() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        assertEquals(null, tree.findLCA(0,0));
	}
	
	@Test
	public void testTreeWithOneNode() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1); 
        assertEquals(1, tree.findLCA(1,1).data);
	}
	
	@Test
	public void testTree() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        assertEquals(1, tree.findLCA(2,3).data);
	}

	@Test
	public void testLeftTree() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(3);
        assertEquals(2, tree.findLCA(2,3).data);
	}

	@Test
	public void testRightTree() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.right = new Node(2);
        tree.root.right.right = new Node(3);
        assertEquals(2, tree.findLCA(2,3).data);
	}

	@Test
	public void testSubTreeLeft() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);        
        assertEquals(2, tree.findLCA(4,5).data);
	}
	
	@Test
	public void testSubTreeRight() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);        
        assertEquals(3, tree.findLCA(6,7).data);
	}
	
	@Test
	public void testWithNegatives() {
        LowestCommonAncestor tree = new LowestCommonAncestor();
        tree.root = new Node(-1);
        tree.root.left = new Node(-2);
        tree.root.right = new Node(-3);
        tree.root.left.left = new Node(-4);
        tree.root.left.right = new Node(-5);
        tree.root.right.left = new Node(-6);
        tree.root.right.right = new Node(-7);        
        assertEquals(-3, tree.findLCA(-6,-7).data);
	}
	
	@Test
	public void testForDAG() {
	LowestCommonAncestor tree = new LowestCommonAncestor();
	tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);     
        assertEquals(3, tree.findLCA(5,6).data);
}
