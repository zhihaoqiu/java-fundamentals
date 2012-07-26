package org.zeroturnaround.jf2012.classloaders;

public class Main {
  public static void main(String[] args) throws Exception {
    //ClassLoader myClassLoader = new MyClassLoader();
    ClassLoader myClassLoader = new MyOtherClassLoader();
    Class runnableClass = myClassLoader.loadClass("org.zeroturnaround.jf2012.classloaders.MyThread");
    Thread thread = new Thread((Runnable) runnableClass.newInstance());
    thread.setContextClassLoader(myClassLoader);
    thread.start();
  }
}