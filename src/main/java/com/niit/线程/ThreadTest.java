package com.niit.线程;

public class ThreadTest
{
public static void main(String[] args) {
    Thread thread1=new Thread(){
        @Override
        public void run() {
            // TODO Auto-generated method stub
            super.run();
            while (true) {
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }//0.5s
                Thread.currentThread().getName();
            }
        }
    };
    thread1.start();
    
    
    
    Thread thread2 = new Thread(new Runnable()
    {
        
        @Override
        public void run() {
            while (true) {
                try {
                    Thread.sleep(500);
                }
                catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }//0.5s
                Thread.currentThread().getName();
            }
            
        }
    });
    
}
}
