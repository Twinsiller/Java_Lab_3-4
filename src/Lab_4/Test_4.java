package Lab_4;

public class Test_4
{
    public static void main(String[] args) {

        read(new Chocolates(50, "Mars"));
        readN(new Planets("Mars"));
        readN(new Cars("Tesla"));
    }
    static void read(Priceable p)
    {
        p.getPrice();
    }

    static void readN(Nameable n)
    {
        n.getName();
    }
}