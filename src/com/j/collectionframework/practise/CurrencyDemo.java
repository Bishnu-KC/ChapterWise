package com.j.collectionframework.practise;
import java.util.*;

public class CurrencyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Currency c;
		c = Currency.getInstance(Locale.US);
		System.out.println("Symbol: " + c.getSymbol());
		System.out.println("Default fractional digits: " +
		c.getDefaultFractionDigits());

	}

}
