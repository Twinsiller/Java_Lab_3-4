package Lab_4;

public class Chocolates implements Priceable
{
    int price;
    String name;

    public Chocolates(int price, String name)
    {
        this.price = price;
        this.name = name;
    }

    public int getPrice()
    {
        System.out.printf("Chocolate name '%s' and price %d\n",name, price); return price;
    }
}