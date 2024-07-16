public class Item {

    String productName;
    String suppName;
    double salePrice;
    double purPrice;

    //Constructor
    public Item(String productName,String suppName,double salePrice,double purPrice)
    {
        this.productName=productName;
        this.suppName=suppName;
        this.salePrice=salePrice;
        this.purPrice=purPrice;
    }

    //Getter and Setters
    public String getProductName()
    {
        return productName;
    }
    public void setProductName(String productName)
    {
        this.productName=productName;
    }
    public String getSuppName()
    {
        return suppName;
    }
    public void setSuppName(String suppName)
    {
        this.suppName=suppName;
    }

    public double getSalePrice()
    {
        return salePrice;
    }
    public void setSalePrice(double salePrice)
    {
        this.salePrice=salePrice;
    }
    public double getPurPrice()
    {
        return purPrice;
    }
    public void setPurPrice(double purPrice)
    {
        this.purPrice=purPrice;
    }


    //Price with extra
    public void SalePriceIncrement()
    {

        salePrice*=1.20;
    }


    //Calculation of profit
    public double ProfitCalculate()
    {
        return salePrice-purPrice;
    }

    //Getting the extra price
    public double getExtraPrice() {
        return salePrice;
    }


}
