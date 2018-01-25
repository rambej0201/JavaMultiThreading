class MyThreadSix extends Thread 
{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("0-arg user thread");
		}
		run(10);
	}
	public void run(int a){
		for (int i = 0; i < 10; i++)
		{
			System.out.println("1-arg user thread");
		}
	}
}
	class ThreadDemoFive
	{
	
	public static void main(String[] args) 
	{
		MyThreadSix v = new MyThreadSix();
		v.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("main thread");
		}
	}
}
