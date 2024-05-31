public class MultiThreadMain {
    public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton is reused (nice!)" + "\n" +
                "If you see different values, then 2 singletons were created (great!)" + "\n\n" +
                "RESULT:" + "\n");

        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }
    static class ThreadFoo implements Runnable{
        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable{
        @Override
        public void run(){
            Singleton singleton = Singleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
} //so the singleton principle fails if there are multiple threads, so we have to create a thread-safe singleton program
