public class User {

    public static int totalOnline;

    public String name;
    public String surname;
    public int age;
    public String email;

    public User (String name, String surname, int age, String email) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.email = email;
        totalOnline ++;
    }

    public String toString() {
        return "Пользователь " + name + " " + surname + ", " + age + " лет, адрес электронной почты: " + email;
    }

    public static void onlineNow() {
        System.out.println("Пользователей онлайн в настоящий момент: " + totalOnline);
    }
}