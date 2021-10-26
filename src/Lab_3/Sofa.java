package Lab_3;

public class Sofa extends Furniture
{
    public Sofa(String name, int year, int number)
    {
        this.name = name;
        this.year = year;
        this.number = number;
    }

    public Sofa(){}

    @Override
    public int opt_5() {
        if (number > 4)
        {
            number = number - 5;
            return getNumber();
        }
        else{
            System.out.println("Number sofa < 5");
            return getNumber();
        }
    }
}
