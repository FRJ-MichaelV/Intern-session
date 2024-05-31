public class Singleton {
    //static variable
    private static Singleton instance;
    public String value;

    //private constructor to limit the creation of single objcet
    private Singleton(String value){
        //following code emulates slow initialization
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }

    //static method getInstance to access the private constructor in the main class
    public static Singleton getInstance(String value){
        if(instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}