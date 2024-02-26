package ThreadsConcepts;

public class Threads2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello im 1");
System.out.println("hello im 2");

//DoSomethingInBackground doSome=new DoSomethingInBackground("thread-1");
//doSome.start();
System.out.println("hello im 3");
	}

	static void show() {
		for(int i=0;i<10;i++) {
System.out.println(i);
		}
	}

}
/* class DoSomethingInBackground implements Runnable{
	Thread t;
String threadNmae;
	DoSomethingInBackground(String name){
		threadNmae=name;
		System.out.println(name);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
for(int i=0;i<2;i++) {
			System.out.println(i);
		}
	}


	void start() {
		if(t==null) {
			t=new Thread(this,threadNmae);
			t.start();
		}


	}
} */

