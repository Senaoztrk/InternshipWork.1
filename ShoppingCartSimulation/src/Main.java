//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Item item1=new Item("Bag","Chanel",5000,3400);
        Item item2=new Item("Laptop","Huwaei",10000,8000);


        item1.SalePriceIncrement();
        item2.SalePriceIncrement();

        System.out.println("The profit from bag: "+item1.ProfitCalculate());
        System.out.println("The profit from laptop: "+ item2.ProfitCalculate());

        ShoppingCart cart=new ShoppingCart();

        cart.CartAdd(item1);
        cart.CartAdd(item2);

        double total=cart.CartPrice();
        System.out.println("Total price of cart: "+total);


    }
}