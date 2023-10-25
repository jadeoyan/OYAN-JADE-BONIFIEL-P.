public class Person {
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private String birthday;
    private String address;

    // Constructor
    public Person(String firstName, String middleName, String lastName, int age, String birthday, String address) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.address = address;
    }

    // Getter and Setter methods for First Name
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // Getter and Setter methods for Middle Name
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    // Getter and Setter methods for Last Name
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Getter and Setter methods for Age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for Birthday
    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    // Getter and Setter methods for Address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {
        // You can use the getter and setter methods here to access and modify attributes.
        // For example:

        Person person = new Person("Jade Bonifiel", "Pinon", "Oyan", 20, "April 22, 2003", "Tisa Cebu City");

        // Use getter methods to get the values of attributes
        String firstName = person.getFirstName();
        String middleName = person.getMiddleName();
        String lastName = person.getLastName();
        int age = person.getAge();
        String birthday = person.getBirthday();
        String address = person.getAddress();

        // Use setter methods to modify the values of attributes
        person.setFirstName("Jade");
        person.setAge(20);

        // You can print or work with these values as needed.
        System.out.println("First Name: " + firstName);
        System.out.println("Middle Name: " + middleName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Birthday: " + birthday);
        System.out.println("Address: " + address);
    }
}
