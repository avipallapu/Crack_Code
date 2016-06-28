package org.crack.tests.Linkedl;

import org.crack.code.Linkedl.*;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestLinkedListExercise {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testinsertAtFront() {
		Node n = new Node();
		Node n1 = null;
		n1 = n.insertAtFront(n1, 1);
		n1 = n.insertAtFront(n1, 2);
		n1 = n.insertAtFront(n1, 3);
		n.write2Screen(n1);
		assertTrue("The first Element in the List is not the last one added to the list", n1.getData()==3);
	}

}
