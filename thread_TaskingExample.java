package javaprojects;


public class thread_TaskingExample extends Thread
{
  public static void car_Tata()
  {
    System.out.println("Task for the Tata will described here");
  }
  
  public static void car_Mahindra()
  {
    System.out.println("Task for the Mahindra will described here");
  }
  
  public static void car_Maruti()
  {
    System.out.println("Task for the Maruti will described here");
  }
  public void run()
  {
    if(Thread.currentThread().getName().equals("Tata"))
    {
      car_Tata();
    }
    else if(Thread.currentThread().getName().equals("Mahindra"))
    {
      car_Mahindra();
    }
    else
    {
      car_Maruti();    
    }
    
  }

  public static void main(String[] args) 
  {
    thread_TaskingExample t1 = new thread_TaskingExample();
    thread_TaskingExample t2 = new thread_TaskingExample();
    thread_TaskingExample t3 = new thread_TaskingExample();
    
    t1.setName("Tata");
    t2.setName("Mahindra");
    t1.setName("Maruti");
    
    t1.start();
    t2.start();
    t3.start();
    
     

  }

}
