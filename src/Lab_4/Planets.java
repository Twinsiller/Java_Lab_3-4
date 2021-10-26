package Lab_4;

public class Planets implements Nameable
{
    String name;

    public Planets(String name)
    {
        this.name = name;
    }

    @Override
    public String getName() {
        System.out.printf("Planet '%s'\n", name); return ".\n";
    }
}