import java.util.ArrayList;

public class ShoppingCart {

private ArrayList<Item> cart;

//Constructor
public ShoppingCart()
{
    cart=new ArrayList<>();
}

//Adding item
public void CartAdd(Item item)
{
    cart.add(item);
}


//Calculating the price of the products in the cart
public  double CartPrice()
{
    double total=0;
    for(Item item: cart)
    {
        total+=item.getExtraPrice();

    }
    return total;
}



}
