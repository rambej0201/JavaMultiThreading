class MyThreadNine extends Thread
{
	public void run(){

	}
	}
	class ThreadDemoNine
	{
	
	public static void main(String[] args) 
	{
		MyThreadNine t1 = new MyThreadNine();
		t1.start();
		MyThreadNine t2 = new MyThreadNine();
		t2.start();
		System.out.println(t1.getName()); //name of the thread
		System.out.println(t2.getName());
		t1.setName("Thread-0 as Uttej");//setting a name to thread
		t2.setName("Thread-1 as RGV");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(Thread.currentThread().getName()); //getting name of main thread
		Thread.currentThread().setName("Aamir");//setting name to main thread
		System.out.println(Thread.currentThread().getName());
		System.out.println(t1.getId());//getting id of the thread
		System.out.println(t2.getId());
		System.out.println(Thread.currentThread().getId());
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(t1.activeCount());
		System.out.println(t2.activeCount());
		System.out.println(Thread.activeCount());
	}
}
