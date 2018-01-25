class MyThread extends Thread
{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("User Defined Thread");
		}
	}
}
class ThreadDemo
{
	public static void main(String[] args) 
	{
		MyThread m = new MyThread();
		m.start();
		for(int a = 0; a < 10; a++){
			System.out.println("Main Thread");
		}
		
	}
}
