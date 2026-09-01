package com.rajtechnolgies.threads;

public class CreateRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Runnable");

    }

    public static void main(String[] args) {
        System.out.println("Main Thread : "+Thread.currentThread().getName()+"");
        CreateRunnable task = new CreateRunnable();
        Thread thread=new Thread(task,"TASK ONE");// This is the task
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

        Thread newThread=new Thread(task,"TASK TWO");// This is the task
        newThread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Sub Thread Name : "+newThread.getName()+
                "\n Thread Id : "+newThread.getId()+
                "\n Thread State : "+newThread.getState()+
                "\n Thread Priority : "+newThread.getPriority()+
                "\n Thread Daemon : "+newThread.isDaemon()+
                "\n Thread Active : "+newThread.isAlive()+
                "\n Thread Interrupted : "+newThread.isInterrupted()+
                "\n Thread Group : "+newThread.getThreadGroup()+
                "\n Thread Context ClassLoader : "+newThread.getContextClassLoader()+
                " ");

        newThread.start();
        System.out.println("Sub Thread Name : "+newThread.getName()+
                "\n Thread Id : "+newThread.getId()+
                "\n Thread State : "+newThread.getState()+
                "\n Thread Priority : "+newThread.getPriority()+
                "\n Thread Daemon : "+newThread.isDaemon()+
                "\n Thread Active : "+newThread.isAlive()+
                "\n Thread Interrupted : "+newThread.isInterrupted()+
                "\n Thread Group : "+newThread.getThreadGroup()+
                "\n Thread Context ClassLoader : "+newThread.getContextClassLoader()+
                " ");
    }
}
