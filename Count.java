package cfh;

public class Counter extends Thread {
	private int count;
	private int inc;
	private int delay;
	
	public Counter(int init, int inc, int delay){
		this.count = init;
		this.inc = inc;
		this.delay = delay;
	}
	
	public void run(){
		while(true){
			if(count < 0 ){
				System.out.println("       " + count);
				
			}
			if(count > 0){
				System.out.println("" + count);
			}
			
			count += inc;
			try{
				sleep(delay);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Counter(1, 1,33).start();
		new Counter(-1, -1, 66).start();
		

	}

}
