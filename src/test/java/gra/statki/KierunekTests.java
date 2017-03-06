package gra.statki;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class KierunekTests extends TestCase {

	@Before
	public void stworz(){
		statek = new Statek();
	}
	
	@Test
	public void sprawdzKierunekNaprzod(){
		//Z przodu 
		statek.ustalKierunek(g);
	    statek.zmienKierunek(0);
		String wynik = statek.pokazKierunek();
		assertEquals("g",wynik);
		
		//Z przodu petla
		statek.ustalKierunek(g);
		statek.zmienKierunek(4);
		String wynik = statek.pokazKierunek();
		assertEquals("g",wynik);
		
		//Z prawej 
		statek.ustalKierunek(p);
		statek.zmienKierunek(3);
		String wynik = statek.pokazKierunek();
		assertEquals("g",wynik);
		
		//Z dolu
		statek.ustalKierunek(d);
		statek.zmienKierunek(2);
		String wynik = statek.pokazKierunek();
		assertEquals("g",wynik);
		
		//Z lewej
		statek.ustalKierunek(l);
		statek.zmienKierunek(1);
		String wynik = statek.pokazKierunek();
		assertEquals("g",wynik);
	}
	
	@Test
	public void sprawdzKierunekWstecz(){
		//Z gory
		statek.ustalKierunek(g);
		statek.zmienKierunek(2);
		String wynik = statek.pokazKierunek();
		assertEquals("d",wynik);
		
		//Z gory petla 
		statek.ustalKierunek(n);
		statek.zmienKierunek(6);
		String wynik = statek.pokazKierunek();
		assertEquals("d",wynik);
		
		//Z prawej 
		statek.ustalKierunek(p);
		statek.zmienKierunek(1);
		String wynik = statek.pokazKierunek();
		assertEquals("d",wynik);
		
		//Z dolu
		statek.ustalKierunek(d);
		statek.zmienKierunek(4);
		String wynik = statek.pokazKierunek();
		assertEquals("d",wynik);
		
		//Z lewej
		statek.ustalKierunek(l);
		statek.zmienKierunek(3);
		String wynik = statek.pokazKierunek();
		assertEquals("d",wynik);
	}
	
	@Test
	public void sprawdzKierunekLewo(){
		//Z gory
		statek.ustalKierunek(g);
		statek.zmienKierunek(3);
		String wynik = statek.pokazKierunek();
		assertEquals("l",wynik);
		
		//Z gory petla 
		statek.ustalKierunek(g);
		statek.zmienKierunek(7);
		String wynik = statek.pokazKierunek();
		assertEquals("l",wynik);
		
		//Z prawej 
		statek.ustalKierunek(p);
		statek.zmienKierunek(2);
		String wynik = statek.pokazKierunek();
		assertEquals("l",wynik);
		
		//Z dolu
		statek.ustalKierunek(d);
		statek.zmienKierunek(1);
		String wynik = statek.pokazKierunek();
		assertEquals("l",wynik);
		
		//Z lewej
		statek.ustalKierunek(l);
		statek.zmienKierunek(0);
		String wynik = statek.pokazKierunek();
		assertEquals("l",wynik);
		
		//Z lewej petla
		statek.ustalKierunek(l);
		statek.zmienKierunek(4);
		String wynik = statek.pokazKierunek();
		assertEquals("l",wynik);
		
	}
	
	@Test
	public void sprawdzKierunekPrawo(){
		//Z gory
		statek.ustalKierunek(g);
		statek.zmienKierunek(1);
		String wynik = statek.pokazKierunek();
		assertEquals("p",wynik);
		
		//Z gory petla 
		statek.ustalKierunek(g);
		statek.zmienKierunek(5);
		String wynik = statek.pokazKierunek();
		assertEquals("p",wynik);
		
		//Z prawej 
		statek.ustalKierunek(p);
		statek.zmienKierunek(0);
		String wynik = statek.pokazKierunek();
		assertEquals("p",wynik);
		
		//Z prawej petla
		statek.ustalKierunek(p);
		statek.zmienKierunek(4);
		String wynik = statek.pokazKierunek();
		assertEquals("p",wynik);
		
		//Z dolu
		statek.ustalKierunek(d);
		statek.zmienKierunek(3);
		String wynik = statek.pokazKierunek();
		assertEquals("p",wynik);
		
		//Z lewej
		statek.ustalKierunek(l);
		statek.zmienKierunek(2);
		String wynik = statek.pokazKierunek();
		assertEquals("p",wynik);
		
	}
	
	@After
	public void wyczysc(){
		//statek = null;
	}

}
