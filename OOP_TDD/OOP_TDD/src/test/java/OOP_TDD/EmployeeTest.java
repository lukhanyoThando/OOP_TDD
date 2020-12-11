package OOP_TDD;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeTest{

    @Test
    public void inheritanceTest(){
        Employee e = new Employee("Lukanyo", "Nkohla", 21,21800);
        System.out.println(e.toString());
        Assert.assertTrue(e instanceof Person);
    }

    @Test
    public void encapsulationTest(){
        Person p = new Person();
        p.setFirstName("Lukanyo");
        p.setLastName("Nkohla");
        p.setAge(21);

        Assert.assertEquals(p.getFirstName(), "Lukanyo");
        Assert.assertEquals(p.getLastName(), "Nkohla");
        Assert.assertEquals(p.getAge(), 21);
    }


    @Test
    public void polymorphismTest() {
        Actions emp1 = new Employee("Lukanyo", "Nkohla", 21, 21800);
        emp1.talk();

        Assert.assertTrue(emp1 instanceof Actions);

    }

    @Test
    public void compositionTest(){
        Person p = new Person();
        Person person = new Person("Lukanyo", "Nkohla", 21, 'M');
        Gender gender = new Gender();
        boolean isEqual = gender.getGender() == person.getGender();
        System.out.println(person.toStringWithChars());

        Assert.assertTrue(isEqual);
    }

}