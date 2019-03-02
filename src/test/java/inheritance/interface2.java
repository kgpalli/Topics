package inheritance;

interface one
{
    public void print_welcome();

}
interface two
{
    public void print_to();

}
interface three extends one,two
{
    public void print_java();

}





