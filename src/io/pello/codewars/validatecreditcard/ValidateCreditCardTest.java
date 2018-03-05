package io.pello.codewars.validatecreditcard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ValidateCreditCardTest {

	  @Test
	  public void test891(){
	   // assertEquals(false, ValidateCreditCard.validate("1714"));
	    //assertEquals(false, ValidateCreditCard.validate("12345"));
	   assertEquals(false, ValidateCreditCard.validate("891"));
	  }

}
