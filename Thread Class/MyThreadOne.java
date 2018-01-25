class MyThreadOne extends Thread{
	public void run(){
		for(int i = 0; i < 10; i++){
			System.out.println("User defined");
		}
	}
}

class ThreadDemoOne
{
	public static void main(String[] args) 
	{
		MyThreadOne n = new MyThreadOne();
		n.run();
		for(int i = 0; i < 10; i++){
			System.out.println("main method");
		}
		
	}
}
