data class Book(val id: Int, val title: String, val author: String, val year: Int, val status: Boolean)

open class Library() {

    private val booksCollection = mutableListOf<Book>()

    fun registerBook(books: Array<Book>) {
        booksCollection.addAll(books)
    }

    fun listBooks() {
        if (booksCollection.isEmpty()) {
            println("There nos Books to read and rent")
        } else {
            println("LIST OF BOOKS AVALIABLE TO RENT")
            booksCollection.forEach {
                println("Book: ${it.title} - ${it.author} - ${it.year} )")
            }
        }
    }

    fun lendBook(id: Int, book: Book) {
        if (id != book.id || book.status != true) {
            println("The Book: ${book.title} - ${book.author}. is NOT available for rent")
        } else {
            println("Available for rent: ${book.title} - ${book.author}")
        }


    }
}


fun main() {
    val library = Library()
    val bookIteratorSearchNumber:Int = 1
    val libraryBooksDatabase = arrayOf(
        Book(1, "Da Vinci Code", "Dan Brown", 2000, true),
        Book(2, "Dracula", "Bram Stoker", 1897, true),
        Book(3, "The Hobbit", "J. R. R. Tolkien", 1937, true),
        Book(4, "Pride and Prejudice", "Jane Austen", 1813, true),
        Book(6, "The Adventures of Sherlock Holmes", "Arthur Conan Doyle", 1892, true),
        Book(7, "The Great Gatsby", "F. Scott Fitzgerald", 1925, true),
        Book(8, "Catch-22", "Joseph Heller", 1961, true),
        Book(9, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams", 1979, true),
        Book(10, "Harry Potter and the Sorcerer's Stone", "J. K. Rowling", 1997, true),
        Book(11, "The Hunger Games", "Suzanne Collins", 2008, true),
        Book(12, "The Fault in Our Stars", "John Green", 2012, true),
        Book(13, "The Martian", "Andy Weir", 2011, true),
        Book(14, "To Kill a Mockingbird", "Harper Lee", 1960, true),
        Book(15, "The Lord of the Flies", "William Golding", 1954, false)
    )

    library.registerBook(libraryBooksDatabase)

    //library.listBooks()

    //library.lendBook(1+bookIteratorSearchNumber, libraryBooksDatabase[1])

}