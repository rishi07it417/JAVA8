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
		
	
		Path p = Paths.get("E:/TestJavaFile.txt");
	
		try {
			Files.lines(p).forEachOrdered(x->System.out.println(x.toString()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			BufferedWriter br = Files.newBufferedWriter(p);
			br.write("New String Hello World...........");
			br.flush();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	/*	byte[] lst =Files.readAllBytes(Paths.get("E:\\FMDEVIBM\\WHL\\ProcessLaunchers.csv"));
		
		Files.deleteIfExists(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"));
		Files.createFile(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"));
		OpenOption[] options = new OpenOption[] { WRITE };
		FileVisitOption[] fl = new FileVisitOption[]{};

		BufferedWriter br = Files.newBufferedWriter(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"), options);
		//Files.copy(Paths.get("E:\\FMDEVIBM\\WHL\\ProcessLaunchers.csv"), new FileOutputStream("E:\\FMDEVIBM\\WHL\\new.csv"));
		Files.list(Paths.get("E:\\FMDEVIBM\\WHL"))
        .filter(Files::isRegularFile)
        .forEach(z->{
		try {
			Files.lines(z).forEach(x-> {
				try {
					br.write(x.toString());
					br.newLine();
					//Files.write(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"),x.getBytes(),options);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        });
		br.close();
	*/
		
		//(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"), lst, options);
		//Files.write(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"), lst, options);
		
		/*Path pat = Paths.get("E:\\FMDEVIBM\\WHL");
		
		WatchService ws = FileSystems.getDefault().newWatchService();
		
		WatchKey wk = pat.register(ws, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY);
		
		while(true){
			wk.pollEvents().stream().forEach(x->{
				System.out.println(x.kind());
				System.out.println(x.context().toString());
				System.out.println(x.count());


			});
		}*/
		
		LocalDate d =LocalDate.now();
		System.out.println("::Date:::"+d);
		
		LocalDate dt = LocalDate.of(2020, 10, 29);
		System.out.println("::Date:::"+dt);
		
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("::DateFortmat:::"+f.format(dt));
		
		System.out.println("::per:::"+ Period.between(d, dt).getDays());
		
		

		

		
	}
	
		
}
