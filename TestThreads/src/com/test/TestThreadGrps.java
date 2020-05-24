package com.test;

import java.util.ArrayList;
import java.util.List;

public class TestThreadGrps implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<3 ; i++){
			System.out.println("Running Thread is::"+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread End is::"+Thread.currentThread().getName());		
	}
	
	public static void main(String args[]){
		
		System.out.println("Main Thread Group:::"+ Thread.currentThread().getThreadGroup().getName());
		System.out.println("Main Thread Parent Group:::"+Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println("Main Thread Parent Group Active count:::"+Thread.currentThread().getThreadGroup().getParent().activeCount());
		System.out.println("System Thread List:::");
		Thread.currentThread().getThreadGroup().getParent().list();
		
		Thread [] tc = new Thread[Thread.currentThread().getThreadGroup().getParent().activeCount()];
		
		Thread.currentThread().getThreadGroup().getParent().enumerate(tc);
		
		for(Thread t:tc){
			System.out.println("Thread Check::::::::::::::"+t.getName()+" ::: Daemon check:::::::::::::::"+t.isDaemon());
		}
		
		//////////////////////////////////
		
		
		ThreadGroup myThreadGrp = new ThreadGroup(Thread.currentThread().getThreadGroup(),"myThreadGrp");
		
		TestThreadGrps o = new TestThreadGrps();
		
		Thread myFirst = new Thread(myThreadGrp,o);		
		Thread mySecond = new Thread(myThreadGrp,o);
			

		myFirst.start();
		mySecond.start();
		
		System.out.println("myThreadGropup Thread Group list is::");
		myThreadGrp.list();
		
		try {
			myFirst.join();
			mySecond.join();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Main Thread Group list is::");
		Thread.currentThread().getThreadGroup().list();

		System.out.println("Main Thread End ::"+Thread.currentThread().getName());

		
		
		
		

	}

}
