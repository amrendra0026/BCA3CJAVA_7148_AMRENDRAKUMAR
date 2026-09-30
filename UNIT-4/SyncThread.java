class MySyncThread  extends Thread
{
	private String threadName;
	private SharedResource sharedResource;
	
	
	public MySyncThread(String threadName, SharedResource sharedResource){
		this.threadName= threadName;
		this.sharedResource = sharedResource;
	}
	@Override
	public void run(){
		sharedResource.printNumbers(threadName);
	}
}

class SharedResource
{
	public synchronized void printNumbers(String threadName){
		for(int i= 1; i<=5; i++){
			System.out.println(threadName +": " +i);
			try{
				Thread.sleep(100);
			}
			catch(InterruptedException e){
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("Thread Complete");
	}
}

public class SyncThread
{
	public static void main(String[] args){
		SharedResource sharedResource = new SharedResource();
		
		MySyncThread thread1 = new MySyncThread("Thread-1", sharedResource);
		MySyncThread thread2 = new MySyncThread("Thread-2", sharedResource);
		
		thread1.start();
		thread2.start();
	}
}