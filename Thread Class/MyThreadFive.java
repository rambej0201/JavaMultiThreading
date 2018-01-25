class MyThreadFive extends Thread 
{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("0-arg user thread");
		}
	}
	public void run(int a){
		for (int i = 0; i < 10; i++)
		{
			System.out.println("1-arg user thread");
		}
	}
}
	class ThreadDemoFour
	{
	
	public static void main(String[] args) 
	{
		MyThreadFive v = new MyThreadFive();
		v.start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println("main thread");
		}
	}
}
