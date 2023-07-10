3.// Solution



// Person class
class Person {
    private String name;
    private int age;
    private String address;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

// Main class to set values and display them
public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();

        // Set values using setter methods
        person.setName("John Doe");
        person.setAge(30);
        person.setAddress("123 Main Street, City");

        // Display values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
    }
}
