package Lab_3;

public class FurnitureShop
{
    Cupboard[] cupboard  = new Cupboard[100];
    Sofa[] sofa  = new Sofa[100];
    int c = 0, s = 0;
    public void createCupboard (String name, int year, int number)
    {
        cupboard[c] = new Cupboard(name, year, number);
        c++;
    }
    public void createSofa (String name, int year, int number)
    {
        sofa[c] = new Sofa(name, year, number);
        s++;
    }
}