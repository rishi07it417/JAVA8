package com.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class TestFiles {
	public static void main(String args[]) throws IOException{
		Path p = Paths.get("E:/TestJavaFile.txt");
		
		try {
			Files.lines(p).forEachOrdered(x->System.out.println(x.toString()));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	/*	try {
			BufferedWriter br = Files.newBufferedWriter(p);
			br.write("New String Hello World...........");
			br.flush();
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
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
		br.close();*/
	
		
		//(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"), lst, options);
		//Files.write(Paths.get("E:\\FMDEVIBM\\WHL\\new.csv"), lst, options);
		
		
		
	} 
}
