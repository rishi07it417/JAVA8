package com.test;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class TestFileWatchService {
	public static void main(String args[]) throws IOException{
Path pat = Paths.get("E:\\FMDEVIBM\\WHL");
		System.out.println("Test Watch Service");
		WatchService ws = FileSystems.getDefault().newWatchService();
		
		WatchKey wk = pat.register(ws, StandardWatchEventKinds.ENTRY_CREATE,StandardWatchEventKinds.ENTRY_MODIFY);
		
		while(true){
			wk.pollEvents().stream().forEach(x->{
				System.out.println(x.kind());
				System.out.println(x.context().toString());
				System.out.println(x.count());


			});
		}
	}
}
