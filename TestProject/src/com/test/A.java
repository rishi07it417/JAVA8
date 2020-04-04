package com.test;

@FunctionalInterface
public interface A {
	int a1(int i);

	static int a2(int i) {
		i = i+i;
		return i;
	}
	default int a3(int i){
		i = i+5;
		return i;
	}
}
