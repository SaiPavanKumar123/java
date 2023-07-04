
class A extends Thread{
    public void run(){

							// Assinging the thread name for the 1st thread
	setName("Identifier thread");
							//System.out.println("the thread we found is "+getName());		// this gives the name of the thread
								//System.out.println("Get the identifier  "+getId());		// this gives the identifier of the thread
		
        for(int i=0;i<10;i++){
	//Thread.yield();
            System.out.println("hii");
		try{
		Thread.sleep(500);
			}
		catch(InterruptedException e){
			e.printStackTrace();
            }
		
        }
    }
}
class B extends Thread{
    public void run(){
							//Assigning thread name to the next or 2nd thread
	    setName("Identifier thread 2");
		//System.out.println("the thread condition is :"+Thread.currentThread().isAlive());
	   		 //System.out.println("the thread we found is "+getName());
	//System.out.println("Get the identifier  "+getId());
        for(int i=0;i<10;i++){
	//Thread.yield();
            System.out.println("hellowww mayan");
           try{
		    Thread.sleep(500);
		}
		catch(InterruptedException e){
			e.printStackTrace();
        }
        }
    }
}

class GFG {
	public static void main (String[] args) {
		A obj1=new A();
		System.out.println("the thread condition is :"+obj1.isAlive());
		B obj2=new B();
		//System.out.println(obj1.getPriority());


	obj1.start();
	obj1.								//obj2.start();
	for(int i=0;i<5;i++){
		//Thread.yield();
		System.out.println("Ela ra");
		
}
/*---------		try{
			Thread.sleep(5);			//hold the 2nd thread and allows the 1st thread until the 1st thread completes its task 
			
			}
		catch (Exception e){
			System.out.println(e);
			}
	Thread.yield();
	
		

		try{
	obj1.join();
			}
		catch (Exception e){
			System.out.println(e);
			}			----------	*/

  		

       /* System.out.println("After changing name of t2: "+obj2.getName());  
        System.out.println("Get the identifier  "+obj2.getId());
        System.out.println("the thread condition is :"+Thread.currentThread().isAlive());
        System.out.println("the name of the thread is "+Thread.currentThread().getName());*/


	}
}
