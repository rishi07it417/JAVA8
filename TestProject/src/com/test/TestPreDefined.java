package com.test;

import java.util.ArrayList;
import java.util.function.*;


public class TestPreDefined  {
	
	static int m1(int i){
		return i+i+i;
	}
	 int m2(int i){
		return i*i*i;
	}

	public static void main(String args[]){
		int i = 5;
		Predicate<Integer> p = j->j<10;
		
		System.out.println("Predicate Result:::"+p.test(i));
		
		Function<Integer, Integer> f = j->j*j;
		Function<Integer, Integer> f1 = j->j+j;

		
		System.out.println("Function Result:::"+f.apply(i));
		
		System.out.println("Function Result andThen:::"+f1.andThen(f).apply(i));
		System.out.println("Function Result compose:::"+f1.compose(f).apply(i));

		
		Consumer<String> c = s->System.out.println("My Consumer String is "+s);
		
		c.accept("Rishi");
		
		Supplier<String> s = ()->"Supplied String From supplier";
		
		System.out.println("Function Result:::"+s.get());

		
		int z = A.a2(5);
		
		System.out.println("Static Method Output:::"+z);
				
		A a = j-> j*j;
		
		z = a.a1(z);
		
		System.out.println("SAM Method Output:::"+z);
		
		z = a.a3(z);
		System.out.println("Default Method Output:::"+z);


		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("d");
		
		arrList.forEach(l->{l = l+"stringsss"; System.out.println(l);});
		
		Function<Integer, Integer> f2 = TestPreDefined :: m1;

		System.out.println("Function Result:::"+f2.apply(10));

		TestPreDefined t = new TestPreDefined();
		Function<Integer, Integer> f3 = t :: m2;

		System.out.println("Function Result:::"+f3.apply(10));

		
		
	}

	

}
