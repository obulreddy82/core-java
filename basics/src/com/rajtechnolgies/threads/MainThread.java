package com.rajtechnolgies.threads;

public class MainThread {
    public static void main(String[] args) {

        Thread thread=Thread.currentThread();
        System.out.println("Thread Name : "+thread.getName()+
                "\n Thread Id : "+thread.getId()+
                "\n Thread State : "+thread.getState()+
                "\n Thread Priority : "+thread.getPriority()+
                "\n Thread Daemon : "+thread.isDaemon()+
                "\n Thread Active : "+thread.isAlive()+
                "\n Thread Interrupted : "+thread.isInterrupted()+
                "\n Thread Group : "+thread.getThreadGroup()+
                "\n Thread Context ClassLoader : "+thread.getContextClassLoader()+
                " ");
    }
}
