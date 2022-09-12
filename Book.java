public class Book {

    public static int maxPages;

    public Author author;
    public String title;
    public int releaseYear;
    public int numberOfPages;
    public boolean inRussianLanguage;

    public Book (Author author, String title, int releaseYear, int numberOfPages, boolean inRussianLanguage) {
        this.author = author;
        this.title = title;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.inRussianLanguage = inRussianLanguage;
        maxPages = Math.max(maxPages, numberOfPages);
    }

    public String toString() {
        return "Автор книги: " + author.authorName + ", Название: " + title + ", Колличество страниц: " + numberOfPages + ", Год выхода: " + releaseYear + ", На русском языке: " + inRussianLanguage;
    }

    public boolean inOurCentury() {
        return releaseYear >= 2000;
    }

    public static void maxNumberPages() {
        System.out.println("Максимальное колличество страниц из всех книг: " + maxPages);
    }
}
