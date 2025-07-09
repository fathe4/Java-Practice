package ObjectRelationships;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println(name + " Hello");
    }
}
