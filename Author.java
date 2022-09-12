public class Author {
    public String authorName;
    public int yearOfBirth;

    public Author (String authorName, int yearOfBirth) {
        this.authorName = authorName;
        this.yearOfBirth = yearOfBirth;
    }

    public String toString () {
        return ("Имя автора: " + authorName + ", год рождения: " + yearOfBirth);
    }
}
