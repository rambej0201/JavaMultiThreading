class MyThreadThirteen extends Thread 
{
	public void run(){
		for (int i = 0; i < 10; i++)
		{
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
	}
	}
	class ThreadDemoThirteen
	{
	public static void main(String[] args) 
	{
		MyThreadThirteen th = new MyThreadThirteen();
		MyThreadThirteen ti = new MyThreadThirteen();
		th.start();
		ti.start();
		for (int i = 0; i < 10 ; i++ )
		{
			System.out.println(i);
		}
	}
}
