package Java8Programs;

import java.io.*;
import java.util.*;
public class ThreadExample implements Runnable {
	
	
	 
	    // method to start Thread
	    public void run()
	    {
	        System.out.println(
	            "Thread is Running Successfully");
	    }
	 
	    public static void main(String[] args)
	    {
	    	ThreadExample g1 = new ThreadExample();
	        // initializing Thread Object
	        Thread t1 = new Thread(g1);
	        t1.run();
	    }
	}
	
	


