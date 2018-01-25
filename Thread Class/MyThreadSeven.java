class MyThreadSeven extends Thread
{
	public void run(){
		m1();
		m2();
		m3();
	}
	void m1(){System.out.println("M1-Method");}
	void m2(){System.out.println("M2-Method");}
	void m3(){System.out.println("M3-Method");}
	}
	class ThreadDemoSeven
	{
	
	public static void main(String[] args) 
	{
		MyThreadSeven s = new MyThreadSeven();
		s.start();
	}
}
