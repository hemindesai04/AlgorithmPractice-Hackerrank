package treeExamples;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestInsertionBST {

	@Test
	public void testInserttion() {
		InsertionBST node = new InsertionBST();
		
		assertEquals(true,node.add(3) );
	}

}
