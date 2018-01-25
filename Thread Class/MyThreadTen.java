class MyThreadTen extends Thread 
{
	public void run(){
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
	}
	class ThreadDemoTen
	{
	
	public static void main(String[] args) 
	{
		MyThreadTen t1 = new MyThreadTen();
		t1.setPriority(10);
		MyThreadTen t2 = new MyThreadTen();
		//t2.setPriority(1);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
	}
}
