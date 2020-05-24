package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TestExecutorService implements Runnable{
	public static ReentrantLock lck = new java.util.concurrent.locks.ReentrantLock(true);

	void display(){
		for(int i=0; i<3; i++){
			System.out.println("Current Thread Acquiring Lock::"+Thread.currentThread().getName());
				//Thread.sleep(5000);
			 
			
		}
		System.out.println("Current Thread Acquiring Lock Ends::"+Thread.currentThread().getName());

	}
	
	@Override
	public void run() {
		//if(lck.tryLock(2000, TimeUnit.MILLISECONDS)){
				System.out.println("Thread Got Lock::"+Thread.currentThread().getName());

				//display();
				//lck.unlock();
				//System.out.println("Thread Relase Lock::"+Thread.currentThread().getName());
				//break;
/*	}else{
				System.out.println("Thread Waiting For Lock::"+Thread.currentThread().getName());
			}*/
		//}
		//System.out.println("Thread Ends::"+Thread.currentThread().getName());

	}
	
	public static void main(String args[]){
		
		ExecutorService ex = Executors.newFixedThreadPool(3);
		
		TestExecutorService o = new TestExecutorService();
		ex.submit(o);
		ex.submit(o);
		ex.submit(o);
		ex.submit(o);

		ex.shutdown();
		
	}
}
