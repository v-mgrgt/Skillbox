public class Person {
    private final String name;
    private final int age;
    private String registrationAddress;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setRegistrationAddress(String registrationAddress) {
        this.registrationAddress = registrationAddress;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getRegistrationAddress() {
        return registrationAddress;
    }
}
