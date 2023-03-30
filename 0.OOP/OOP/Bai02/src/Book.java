public class Book extends Document {
    private String author;
    private int pagenumber;

    public Book(String id, String nxb, int number, String author, int pagenumber) {
        super(id, nxb, number);
        this.author = author;
        this.pagenumber = pagenumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPagenumber() {
        return pagenumber;
    }

    public void setPagenumber(int pagenumber) {
        this.pagenumber = pagenumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                " id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                ", author='" + author + '\'' +
                ", pagenumber=" + pagenumber +
                '}';
    }
}
