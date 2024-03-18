package Classes;

public class Book {
    public static class Author {
        private String name, male, email;

        public Author(String name, String male, String email) {
            this.name = name;
            this.male = male;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public String getMale() {
            return male;
        }

        public String getEmail() {
            return email;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMale(String male) {
            this.male = male;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "name = " + name + ", male = " + male + ", email = " + email;
        }
    }

    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "name = " + name + ", author[" + author.toString() + "], year = " + year;
    }

    public static void main(String[] args) {
        Author ya = new Author("Alexey", "Man", "alexey8837@gmail.com");
        Book book = new Book("Lie", ya, 2020);
        System.out.println(book.toString());
    }
}
