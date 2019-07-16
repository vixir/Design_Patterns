package com.design.singleton;

/**
 * Double Checked locking singleton
 */
public class DbSingleton {

    /**
     * Volatile will guarantee against any compiler optimizations
     */
    private static volatile DbSingleton instance = null;

    /**
     * private constructor so that classes can't extend this class and have their own
     * implementation
     */
    private DbSingleton() {
        if (instance != null) {
            new RuntimeException("Use getInstance() to create");
        }
    }

    /**
     * @return Singleton instance
     * two null checks
     * 1st null check is for checking whether variable initialized or not
     * 2nd null check is for avoiding scenario where two threads try to create instance
     * at the same time. Only one thread should be creating new instance
     */
    public static DbSingleton getInstance() {
        if (null == instance) {
            synchronized (DbSingleton.class) {
                if (null == instance) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }

}
