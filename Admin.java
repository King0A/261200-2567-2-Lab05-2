import java.time.LocalDate;

public class Admin extends User {

    public Admin(String name, int year, int month, int date) {
        super(name, year, month, date);
    }

    // override
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: admin.");
    }

    // overload
    public void displayInfo(boolean full) {
        if (full) {
            this.displayInfo();
            System.out.println("Today's date: " + LocalDate.now());
        } else {
            System.out.println("Name: " + this.name);
        }
    }

    @Override
    public void displayHappyBirthday(){
        super.displayHappyBirthday();
        System.out.println("ปีนั้คุณอายุ " + this.age);
    }
}
