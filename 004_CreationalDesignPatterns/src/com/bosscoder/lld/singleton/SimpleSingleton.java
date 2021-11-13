package com.bosscoder.lld.singleton;

/**
 * First type of singleton class
 * Eagerly initialized
 */
public class SimpleSingleton {

    private static final SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton(){

    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}

/**
 * Static Singleton
 */

class StaticSingleton{

    private static StaticSingleton instance;

    private StaticSingleton(){

    }

    static {
        instance = new StaticSingleton();
    }

    public static StaticSingleton getInstance(){
        return instance;
    }

}

/**
 * Lazy Singleton
 */
class LazySingleton{

   private static LazySingleton instance;

   private LazySingleton(){

   }

    public static LazySingleton getInstance() {
       if(instance == null){
           instance = new LazySingleton();
       }
        return instance;
    }
}

/**
 * Synchronized method
 * slow since whole method is synchronized
 */

class SynchronizedSingleton{

    private static SynchronizedSingleton instance;

    private SynchronizedSingleton(){

    }

    public static synchronized SynchronizedSingleton getInstance() {
        if(instance == null){
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}

/**
 * Double checked locking
 */
class OptimizedThreadSafeSingleton{
    private static OptimizedThreadSafeSingleton instance;

    private OptimizedThreadSafeSingleton(){

    }

    public static OptimizedThreadSafeSingleton getInstance() {

        if(instance == null){
            synchronized (OptimizedThreadSafeSingleton.class){
                if(instance == null){
                    instance = new OptimizedThreadSafeSingleton();
                }
            }
        }

        return instance;

    }
}

/**
 * BillPugh
 */

class SingletonBillPugh{

    private SingletonBillPugh(){

    }

    private static class SingletonHelper{
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

     public static SingletonBillPugh getInstance() {
        return SingletonHelper.INSTANCE;
    }

}

enum Singleton
{
    SINGLETON;

    Singleton(){

    }
}