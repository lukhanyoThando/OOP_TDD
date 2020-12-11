package OOP_TDD;

public class Gender {
    private char gender;

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        String output = " Gender: " + gender;
        return output;
    }
}
