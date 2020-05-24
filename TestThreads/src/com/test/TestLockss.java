package com.test;
import java.util.concurrent.*;
import java.util.concurrent.locks.*;

public class TestLockss implements Runnable{
	public static ReentrantLock lck = new java.util.concurrent.locks.ReentrantLock(true);

	@Override
	public void run() {
		while(true){
			try {
				if(lck.tryLock(2000, TimeUnit.MILLISECONDS)){
					System.out.println("Thread Got Lock::"+Thread.currentThread().getName());

					display();
					lck.unlock();
					System.out.println("Thread Relase Lock::"+Thread.currentThread().getName());
					break;
				}else{
					System.out.println("Thread Waiting For Lock::"+Thread.currentThread().getName());
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Thread Ends::"+Thread.currentThread().getName());

	}
	
	void display(){
		for(int i=0; i<3; i++){
			System.out.println("Current Thread Acquiring Lock::"+Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Current Thread Acquiring Lock Ends::"+Thread.currentThread().getName());

	}
	
	public static void main(String args[]){
		TestLockss o = new TestLockss();
		Thread first = new Thread(o,"first");
		Thread second = new Thread(o,"second");
		
		first.start();
		second.start();
	}

}
