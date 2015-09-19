package cs271.lab.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class TestPerformance {

	// TODO run test and record running times for SIZE = 10, 100, 1000, 10000
	// which of the two lists performs better as the size increases?
	private final int SIZE = 10000;

	private final int REPS = 1000000;

	private List<Integer> arrayList;

	private List<Integer> linkedList;

	private long start_time;
	private long end_time;

	@Before
	public void setUp() throws Exception {
		arrayList = new ArrayList<Integer>(SIZE);
		linkedList = new LinkedList<Integer>();
		for (int i = 0; i < SIZE; i++) {
			arrayList.add(i);
			linkedList.add(i);
		}
		start_time = System.currentTimeMillis();
	}

	@After
	public void tearDown() throws Exception {
		end_time = System.currentTimeMillis();
		double performance_time = (end_time - start_time) / 1000.0;
		System.out.println(performance_time);
		arrayList = null;
		linkedList = null;
	}

	@Test
	public void testLinkedListAddRemove() {
		for (int r = 0; r < REPS; r++) {
			linkedList.add(0, 77);
			linkedList.remove(0);
		}
		System.out.println("testLinkedListAddRemove()");
	}

	@Test
	public void testArrayListAddRemove() {
		for (int r = 0; r < REPS; r++) {
			arrayList.add(0, 77);
			arrayList.remove(0);
		}
		System.out.println("testArrayListAddRemove()");
	}


	@Test
	public void testLinkedListAccess() {
		long sum = 0;
		for (int r = 0; r < REPS; r++) {
			sum += linkedList.get(r % SIZE);
		}
		System.out.println("testLinkedListAccess()");
	}

	@Test
	public void testArrayListAccess() {
		long sum = 0;
		for (int r = 0; r < REPS; r++) {
			sum += arrayList.get(r % SIZE);
		}
		System.out.println("testArrayListAccess()");
	}
}
