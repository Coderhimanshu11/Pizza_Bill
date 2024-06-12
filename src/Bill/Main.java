package Bill;

public class Main {
    public static void main(String[] args) {
        DeluxPizza dp=new DeluxPizza(true);
        System.out.println(dp.getPrice());
        dp.addExtraCheese();
        dp.addExtraCheese();
       // System.out.println(dp.getBill());
        Pizza p=new Pizza(true);
        p.addExtraCheese();
        p.addExtraTopping();
        p.addTakeAway();
       // p.getBill();
      //  p.getBill();
        System.out.println(p.getBill());
    }
}
