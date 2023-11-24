package pack_ConstructorOver;

public class MainClass
{
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person(21);
        Person person3 = new Person(21,"raj");

        System.out.println(person1.getName());
        System.out.println(person3.getName());


    }
}
