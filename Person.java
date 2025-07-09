public class Person {
    String name;
    int age;

    public Person(String inputName, int inputAge) {
        name = inputName;
        age = inputAge;
    }

    public void sayHello() {
        System.out.println("Hey " + name + " age " + age);
    }
}
