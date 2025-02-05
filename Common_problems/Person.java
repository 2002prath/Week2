public class Person {
    private String name;
    private int age;
    private String address;

    // Default constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not Provided";
    }

    // Parameterized constructor
    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.address = other.address;
    }

    // Method to display person details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }

    public static void main(String[] args) {
        // Creating a person using parameterized constructor
        Person person1 = new Person("John Doe", 30, "123 Elm Street");
        System.out.println("Original Person:");
        person1.display();

        System.out.println();

        // Creating a new person using the copy constructor
        Person person2 = new Person(person1);
        System.out.println("Copied Person:");
        person2.display();
    }
}

