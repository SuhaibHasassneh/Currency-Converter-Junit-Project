package currencyconvertertest;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import currencyconverter.currencyconverterclass;



public class currencyconvertertestclass {
	
	private currencyconverterclass fc;
	
@BeforeEach

public void setup(){
	
	fc=new currencyconverterclass();
}

@AfterEach
public void tdown() {
	
	fc=null;
}

@Test
public void convertTestFromUSD() {
	 
	double actual=fc.convert(5, "USD", "ILS");
    double expected=5*3.627;
	
    Assertions.assertEquals(expected,actual);
	
}
@Test
public void convertTestFromUSD1() {
	 
	double actual=fc.convert(5, "USD", "EUR");
    double expected=5*0.9185;
	
    Assertions.assertEquals(expected,actual);
	
}

@Test
public void convertTestFromEUR() {
	 
	double actual=fc.convert(5, "EUR", "ILS");
    double expected=5*3.9483;
	
    Assertions.assertEquals(expected,actual);
	
}
@Test
public void convertTestFromEUR1() {
	 
	double actual=fc.convert(5, "EUR", "USD");
    double expected=5*1.0887;
	
    Assertions.assertEquals(expected,actual);
	
}

@Test
public void convertTestFromILS() {
	 
	double actual=fc.convert(5, "ILS", "USD");
    double expected=5*0.2757;
	
    Assertions.assertEquals(expected,actual);
	
}
@Test
public void convertTestFromILS1() {
	 
	double actual=fc.convert(5, "ILS", "EUR");
    double expected=5*0.2533;
	
    Assertions.assertEquals(expected,actual);
	
}

}

	
	


