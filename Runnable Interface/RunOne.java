class RunOne implements Runnable
{
	public void run(){
	for (int i = 0; i < 5 ; i++)
	{	System.out.println("user thread--"+i);
			}
		}
	}
	class OneRun
	{
	public static void main(String[] args) 
	{
		RunOne o = new RunOne();
		Thread n = new Thread(o);
		n.start();
		for (int i = 0; i < 5 ; i++ )
		{
			System.out.println("main thread--"+i);
		}
		
	}
}
