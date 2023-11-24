package pack_ConstructorOver;

public class Person
{
    private int age;
    private String name;

    public Person()
    {
         age = 0;
         name = "noname";
    }
    public Person(int a)
    {
        age = a;
        name = "noname";
    }
    public Person(int a,String n)
    {
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
