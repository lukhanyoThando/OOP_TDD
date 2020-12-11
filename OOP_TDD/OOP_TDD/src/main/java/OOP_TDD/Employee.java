package OOP_TDD;

public class Employee extends Person implements Actions {
    private long empNo;

    public Employee(){
    }

    public Employee(String name, String surname, int age, long empNo){
        super(name, surname, age);
        this.empNo = empNo;
    }

    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    @Override
    public String toString(){
        String output = super.toString();
        output += " Employee Number: " + empNo;
        return  output;
    }

    @Override
    public void talk() {
        System.out.println(getFirstName() + " is shouting.");
    }

}
