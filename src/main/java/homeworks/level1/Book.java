package homeworks.level1;

import java.util.Date;

public class Book {
    private final String author;
    private final String isbn;
    private final Date publishDate;
    private final PaperSize pageSize;
    private final Integer pageCount;
    private final BookCoverType bookCover;

    public static class Builder {

        private String author;
        private String isbn;
        private Date publishDate;
        private PaperSize pageSize;
        private Integer pageCount;
        private BookCoverType bookCover;

        public Builder() {
        }

        public Book build() {
            return new Book(this);
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }
        public Builder publishDate(Date publishDate) {
            this.publishDate = publishDate;
            return this;
        }

        public Builder pageSize(PaperSize pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        public Builder pageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }

        public Builder bookCover(BookCoverType bookCover) {
            this.bookCover = bookCover;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private Book(Builder builder) {
        this.author = builder.author;
        this.isbn = builder.isbn;
        this.publishDate = builder.publishDate;
        this.pageSize = builder.pageSize;
        this.pageCount = builder.pageCount;
        this.bookCover = builder.bookCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publishDate=" + publishDate +
                ", pageSize=" + pageSize +
                ", pageCount=" + pageCount +
                ", bookCover=" + bookCover +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public PaperSize getPageSize() {
        return pageSize;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public BookCoverType getBookCover() {
        return bookCover;
    }
}
