package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testisEven() {
		MyInteger a = new MyInteger(12);
		MyInteger b = new MyInteger(13);
		MyInteger c = new MyInteger(15);
		assertTrue(a.isEven());
		assertTrue(!b.isEven());
		assertFalse(c.isEven());
	}
	
	@Test
	public void testisOdd(){
		MyInteger d = new MyInteger(11);
		MyInteger e = new MyInteger(14);
		MyInteger f = new MyInteger(16);
		assertTrue(d.isOdd());
		assertTrue(!e.isOdd());
		assertFalse(f.isOdd());
	}
	
	@Test
	public void testisPrime(){
		MyInteger g = new MyInteger(3);
		MyInteger h = new MyInteger(6);
		assertTrue(g.isPrime());
		assertFalse(h.isPrime());
	}
	
	@Test
	public void testisEven(int value){
		MyInteger i  = new MyInteger(20);
		MyInteger j = new MyInteger(21);
		MyInteger k = new MyInteger(23);
		assertTrue(i.isEven());
		assertTrue(!j.isEven());
		assertFalse(k.isEven());
	}
	
	@Test
	public void testisOdd(int value){
		MyInteger l = new MyInteger(31);
		MyInteger m = new MyInteger(32);
		MyInteger n = new MyInteger(34);
		assertTrue(l.isOdd());
		assertTrue(!m.isOdd());
		assertFalse(n.isOdd());
	}
	
	@Test
	public void testisPrime(int value){
		MyInteger o = new MyInteger(7);
		MyInteger p = new MyInteger(8);
		assertTrue(o.isPrime());
		assertFalse(p.isPrime());
	}
	
	@Test
	public void testisEven(MyInteger num){
		MyInteger q = new MyInteger(44);
		MyInteger r = new MyInteger(47);
		assertTrue(q.isEven());
		assertFalse(r.isEven());
	}
	
	@Test
	public void testisOdd(MyInteger num){
		MyInteger s = new MyInteger(55);
		MyInteger t = new MyInteger(56);
		assertTrue(s.isOdd());
		assertFalse(t.isOdd());
	}
	
	@Test
	public void testisPrime(MyInteger num){
		MyInteger u = new MyInteger(5);
		MyInteger v = new MyInteger(10);
		assertTrue(u.isPrime());
		assertFalse(v.isPrime());
	}
	
	@Test
	public void testequals(int value){
		MyInteger w = new MyInteger(1);
		MyInteger x = new MyInteger(2);
		assertEquals(true, w.equals(1));
		assertEquals(false, w.equals(3));
	}
	
	@Test
	public void testequals(MyInteger num){
		MyInteger y = new MyInteger(77);
		MyInteger z = new MyInteger(78);
		assertEquals(true, y.equals(77));
		assertEquals(false, z.equals(79));
	}
}
