package HomeworksPro.homework1;

public class Person {
    String fullName;

    double age;

    public Person() {
    }

    public Person(String fullName, double age) {
        this.fullName = fullName;
        this.age = age;
    }

    void speak() {
        System.out.println(fullName + " is speaking");
    }
    void move() {
        System.out.println(fullName + " is moving");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Ivanov", 25);
        Person person2 = new Person();
        person2.fullName = "Sidorov";
        person1.move();
        person1.speak();
        person2.move();
        person2.speak();
    }
}


