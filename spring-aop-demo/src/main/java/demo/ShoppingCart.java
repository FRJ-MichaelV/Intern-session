package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //cross-cutting concerns
        //in AOP we are need to separate these out from the business logic
        //Logging --> Aspect
        //Authentication and Authorization --> Aspect
        //Sanitize the data --> Aspect

        //business logic
        System.out.println("Checkout method from ShoppingCart called");
    }

    public int quantity(){
        return 2;
    }
}
