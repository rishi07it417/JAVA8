package com.test;

public class TestThreadLocal implements Runnable {
	public static ThreadLocal t = new ThreadLocal();
	public static int i=0;
	@Override
	public void run() {
		i++;
		t.set(Thread.currentThread().getName()+i);

		for(int i=0; i<3 ; i++){
			//System.out.println("Running Thread is::"+Thread.currentThread().getName());
			try {
				display();
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
		//System.out.println("Thread End is::"+Thread.currentThread().getName());		
	}
	
	public void display() {
		System.out.println("Inside Display with Thread::"+Thread.currentThread().getName());
		System.out.println("Thread Local Value is ::"+t.get());
	}
	
	
	public static void main(String args[]){
		
		TestThreadLocal o = new TestThreadLocal();
		t.set("This is main Thread"+i);
		i++;
		o.display();
		try {
			Thread.sleep(1000);
			
			Thread t1 = new Thread(o);
			t1.start();
			
			Thread.sleep(1000);

			
			Thread t2 = new Thread(o);
			t2.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
