package Bill;

public class DeluxPizza extends Pizza{
    public DeluxPizza(Boolean isVeg){
        super(isVeg);
        addExtraCheese();
        addExtraTopping();
    }
}
