void main() {

    // User john
    User john = new User("John", 1964, 1, 9);
    john.displayInfo();
    john.displayHappyBirthday();

    IO.println("-----");

    // Admin nicolas
    Admin nicolas = new Admin("Nicolas", 1964, 1, 9);
    nicolas.displayInfo();

    IO.println("-----");

    nicolas.displayInfo(true);
    nicolas.displayHappyBirthday();

    IO.println("-----");

    nicolas.displayInfo(false);
    nicolas.displayHappyBirthday();
}
