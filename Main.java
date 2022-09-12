class Main {
    public static void main(String[] args) {

        Author author1 = new Author ("Фрэнк Герберт", 1920);
        System.out.println(author1);

        Author author2 = new Author ("Михаил Булгаков", 1891);
        System.out.println(author2);

        Author author3 = new Author ("Дмитрий Глуховский", 1979);
        System.out.println(author3);

        Book book1 = new Book(author1, "Дюна", 1965, 704, false);
        System.out.println(book1);
        System.out.println("Книга вышла в нашем веке: " + book1.inOurCentury());

        Book book2 = new Book(author2, "Мастер и Маргарита", 1967, 448, true);
        System.out.println(book2);
        System.out.println("Книга вышла в нашем веке: " + book2.inOurCentury());

        Book book3 = new Book(author3, "Текст", 2017, 320, true);
        System.out.println(book3);
        System.out.println("Книга вышла в нашем веке: " + book3.inOurCentury());

        Book.maxNumberPages();

        whichBookIsLonger(book1, book2);

        User user1 = new User("Иван", "Пословин", 29, "ivanposlovin@gmail.com");
        System.out.println(user1);

        User user2 = new User("Петя", "Иванов", 12, "petyaivanov@mail.ru");
        System.out.println(user2);

        User user3 = new User("Василий", "Петров", 25, "petrovv@yandex.ru");
        System.out.println(user3);

        User.onlineNow();
    }

    public static void whichBookIsLonger(Book bookOne, Book bookTwo) {
        if (bookOne.numberOfPages == bookTwo.numberOfPages) {
            System.out.println("У данных книг одинаковое колличество страниц");
        } else if (bookOne.numberOfPages > bookTwo.numberOfPages) {
            System.out.println("В книге " + bookOne.title + " автора " + bookOne.author.authorName + " больше страниц, чем в книге " + bookTwo.title  + " автора " + bookTwo.author.authorName);
        } else {
            System.out.println("В книге " + bookTwo.title + " автора " + bookTwo.author.authorName + " больше страниц, чем в книге " + bookOne.title  + " автора " + bookOne.author.authorName);
        }
    }
}
