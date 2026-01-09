import java.time.LocalDate;

public class User {

    protected String name;
    private final LocalDate dob;
    protected int age;

    public User(String name, int year, int month, int date) {
        this.name = name;
        this.dob = LocalDate.of(year, month, date);
        this.age = LocalDate.now().getYear() - dob.getYear();
    }

    public boolean isBirthday(){
        LocalDate today = LocalDate.now();
        return today.getMonthValue() == dob.getMonthValue() && today.getDayOfMonth() == dob.getDayOfMonth();
    }

    public void displayHappyBirthday(){
        if (isBirthday()){
            System.out.println("Happy Birthday " + this.name);
        }
    }

    // displayInfo
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Birthday: " + dob);
    }
}
