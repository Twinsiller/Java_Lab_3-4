package Lab_4;

public class Cars implements Nameable
{
    String name;

    public Cars(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.printf("Car mark '%s'\n", name); return ".\n";
    }
}
