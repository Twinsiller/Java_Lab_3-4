package Lab_3;

public class Cupboard extends Furniture {
    public Cupboard(String name, int year, int number)
    {
        this.name = name;
        this.year = year;
        this.number = number;
    }
    public Cupboard(){}

    @Override
    public int opt_5() {
        if (number > 4)
        {
            number = number - 5;
            return getNumber();
        }
        else{
            System.out.println("Number cupboard  < 5");
            return getNumber();
        }
    }

}
