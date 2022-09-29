public class Person {
    private String name;
    private int age;
    private String registrationAddress;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
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
