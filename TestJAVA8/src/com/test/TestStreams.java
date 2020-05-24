package com.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

import static java.nio.file.StandardOpenOption.CREATE_NEW;
import static java.nio.file.StandardOpenOption.WRITE;

import java.util.stream.*;
import java.awt.Event;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

import javax.naming.spi.DirObjectFactory;
import javax.naming.spi.DirectoryManager;

public class TestStreams {

	public static void main(String a[]) throws IOException{
		
		ArrayList<Student> arrLst = new ArrayList<Student>();
		
		arrLst.add(new Student(11,5,"Ram"));
		arrLst.add(new Student(15,11,"Laksman"));
		arrLst.add(new Student(17,12,"Raj"));
		arrLst.add(new Student(7,19,"Kamal"));
		arrLst.add(new Student(9,4,"krishna"));
		
		List<Student> fls = arrLst.stream().filter(s->s.age>10).map(s1->{s1.std = s1.std+1; return s1;}).sorted((o1,o2)-> o1.age<o2.age?1:(o1.age>o2.age? -1:0)).collect(Collectors.toList());
		Map<String,Student> mp1 = arrLst.stream().filter(s->s.age>10).map(s1->{s1.std = s1.std+1; return s1;}).sorted((o1,o2)-> o1.age<o2.age?1:-1).collect(Collectors.toMap((Student m) -> m.name, (Student m1)->m1));
		/*fls.forEach(s2->{System.out.println("Studen Name::"+s2.name + ":: Student Age::"+s2.age+":: Student Year::"+s2.std);});
	
		Map<String,Student> mp1 = arrLst.stream().filter(s->s.age>10).map(s1->{s1.std = s1.std+1; return s1;}).sorted((o1,o2)-> o1.age<o2.age?1:-1).collect(Collectors.toMap((Student m) -> m.name, (Student m1)->m1));
		mp1.forEach((str,s)-> System.out.println("Name::"+str+" --Value::"+s));
		
		List<Integer> l = Stream.of(9,9999,999,99).sorted((i,j)->i<j?1:-1).collect(Collectors.toList());
		
		l.forEach(System.out:: println);
	
		
		Optional<Integer> i = Optional.of(5);
		if(i.isPresent())
			System.out.println(i.get());
		
		System.out.println(Stream.of(1,2,2,2,3,4,5,6).skip(2).distinct().reduce((k,j)-> k+j).get());
		
	
		*/
	
		
		

		

		
	}
	
		
}
