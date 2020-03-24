import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;



/*

 * ToDo-list

 * 1.4 characters ABCD,BACC...

 * 2.N characters

 */



public class RemoveA {

	RemoveAmain remove;

	

@Before

public void setup()

{

	remove=new RemoveAmain();

}

@Test

public void firstcharAA() 

{

	assertEquals("CD",remove.delete("AACD"));

	

}



	@Test

	public void Afirstchar() 

	{

		assertEquals("BCD",remove.delete("ABCD"));

		

	}

	@Test

	public void Asecoundchar() 

	{

		assertEquals("BBA",remove.delete("BABA"));

		

	}

	@Test

	public void Afterposition2() 

	{

		assertEquals("CCBAA",remove.delete("CCBAA"));

		

	}

	@Test

	public void threecharacters() 

	{

		assertEquals("B",remove.delete("AAB"));

		

	}

	@Test

	public void threecharacters1() 

	{

		assertEquals("BB",remove.delete("ABB"));

		

	}

	@Test

	public void twocharacters() 

	{

		assertEquals("NULL",remove.delete("AA"));

		

	}

	



}