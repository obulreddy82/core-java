package com.rajtechnolgies.threads;

public class CreateThread extends Thread{

    public void run(){
        System.out.println("Hello");
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread : "+Thread.currentThread().getName()+"");
        CreateThread thread=new CreateThread();
        System.out.println("Sub Thread Name : "+thread.getName()+
                "\n Thread Id : "+thread.getId()+
                "\n Thread State : "+thread.getState()+
                "\n Thread Priority : "+thread.getPriority()+
                "\n Thread Daemon : "+thread.isDaemon()+
                "\n Thread Active : "+thread.isAlive()+
                "\n Thread Interrupted : "+thread.isInterrupted()+
                "\n Thread Group : "+thread.getThreadGroup()+
                "\n Thread Context ClassLoader : "+thread.getContextClassLoader()+
                " ");

        thread.start();
        thread.join(); //make one thread wait for another thread to finish
        System.out.println("Sub Thread Name : "+thread.getName()+
                "\n Thread Id : "+thread.getId()+
                "\n Thread State : "+thread.getState()+
                "\n Thread Priority : "+thread.getPriority()+
                "\n Thread Daemon : "+thread.isDaemon()+
                "\n Thread Active : "+thread.isAlive()+
                "\n Thread Interrupted : "+thread.isInterrupted()+
                "\n Thread Group : "+thread.getThreadGroup()+
                "\n Thread Context ClassLoader : "+thread.getContextClassLoader()+
                " ");
        System.out.println(thread.isAlive());
    }
}
