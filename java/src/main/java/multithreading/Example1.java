package multithreading;


//creation of thread by extend Thread 1st way
class MyThread extends Thread{
	
	//we have to override run method of thread class to start a thread
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Mythread");
		}
	  
	}
}

//2nd way of creation of thread by implements Runnable intrerface
//Runnable does not contain start() method
class MyThread2ndApproach implements Runnable{
	public void run(){
		for(int i=0;i<100;i++){
			System.out.println("runnable interface");
		}
	}
}

public class Example1 {
	
	public static void main(String[] args) throws InterruptedException {
		MyThread mt=new MyThread();
		
		/**
		*	use to start thread simulteniously
		*	
		*importance of	Tread.start(){
		*	1.register thread with thread scheduler
		*	2.perform other mandorary activity
		*   3.it is a hart of multithreading
		*   4.with thread start() method there is no way to start thread
		*   5.invoke run method
		*		}
		*
		*	overloading concept are applicable on run mehtod but thread class
		*	start method always call no argument run method
		*	if a thread is started and we again start that thread then run time 
		*	exception will come
		*   
		*/
		mt.start();
		
		//this will work like function 
		mt.run();
		for(int i=0;i<10;i++){
			System.out.print(" Main");
			
			//use to stop thread
			//mt.stop();
		}
		
		MyThread2ndApproach mt2=new MyThread2ndApproach();
		Thread t=new Thread(mt2);
		t.start();
		
		t.join();
		mt.join();
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("kali");
		System.out.println(Thread.currentThread().getName());

	}

}
