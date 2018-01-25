class MyThreadEight extends Thread
{
	public void run(){
		m1();
	}
	void m1(){System.out.println("m1 method with thread one");}
	}
	class MyThreadEight2 extends Thread
{
	public void run(){
		m2();
	}
	void m2(){System.out.println("m2 method with thread two");}
	}
	class MyThreadEight3 extends Thread
{
	public void run(){
		m3();
	}
	void m3(){System.out.println("m3 method with thread three");}
	}

	class ThreadDemoEight
	{
	
	public static void main(String[] args) 
	{
		new MyThreadEight().start();
		new MyThreadEight2().start();
		new MyThreadEight3().start();
		
	}
}
