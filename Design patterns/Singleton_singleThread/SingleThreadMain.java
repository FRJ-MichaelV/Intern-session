public class SingleThreadMain {
    public static void main(String[] args){
        System.out.println("If you see the same value, then singleton was reused (nice!)" + "\n" +
                "If you see different values, then 2 singletons were created (great!)" + "\n\n" +
                "RESULT:" + "\n");

        Singleton singleton = Singleton.getInstance("Michael");
        Singleton singleton1 = Singleton.getInstance("Vinu");
        System.out.println(singleton.value);
        System.out.println(singleton1.value);
    }
}
