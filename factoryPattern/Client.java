public class Client {
    public static void main(String[] args){
        //Using factory A to create product A
        ProductFactory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.create();

        //Using factory b to create product B
        ProductFactory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.create();
    }
}
