package OOP_TDD;


public class Person implements Actions
{
    private String firstName;
    private  String lastName;
    private int age;
    private Gender gender = new Gender();

    public Person(){
    }

    public  Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender.setGender(gender);
    }

    //setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //toString method
    @Override
    public String toString(){
        return "Name: " + firstName + ", Surname: " + lastName + ", Age: "+ age;
    }

    //interface methods
    @Override
    public void talk() {
        System.out.println(firstName +" is a Person and is talking.");
    }

    //getter for Gender
    public char getGender(){
        return gender.getGender();
    }

    public String toStringWithChars(){
        return "Name: " + firstName + " Surname: " + lastName + " Age: "+ age + " Gender: " + getGender();
    }


}

