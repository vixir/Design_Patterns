package com.design.singleton;

/**
 * Efficient solution to create thread safe singleton.
 * Thread safe and doesn't require any synchronization.
 */
public class LazyInnerClassSingleton {
    /**
     * private singleton to avoid inherited class to access constructor
     */
    private LazyInnerClassSingleton() {
    }

    /**
     * This inner class is loaded only after getInstance() is called for the first time.
     */
    private static class SingletonUtil {
        private static final LazyInnerClassSingleton SINGLETON_INSTANCE = new LazyInnerClassSingleton();
    }

    /**
     * @return Singleton instance
     */
    public static LazyInnerClassSingleton getInstance() {
        return SingletonUtil.SINGLETON_INSTANCE;
    }
}
