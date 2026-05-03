public class Student {
    private String surname;
    private String firstName;
    private int day;
    private int month;
    private int year;
    private String hobby;

    public Student(String surname, String firstName, int day, int month, int year, String hobby) {
        this.surname = surname;
        this.firstName = firstName;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hobby = hobby;
    }

    public String getSurname() { return surname; }
    public String getFirstName() { return firstName; }
    public int getDay() { return day; }
    public int getMonth() { return month; }
    public int getYear() { return year; }
    public String getHobby() { return hobby; }

    @Override
    public String toString() {
        return String.format("%s %s, %02d.%02d.%d, хобі: %s",
                surname, firstName, day, month, year, hobby);
    }
}
