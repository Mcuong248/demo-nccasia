public class NewsPaper extends Document{
    private int releaseDate;

    public NewsPaper(String id, String nxb, int number, int releaseDate) {
        super(id, nxb, number);
        this.releaseDate = releaseDate;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "NewsPaper{" +
                " id='" + id + '\'' +
                ", nxb='" + nxb + '\'' +
                ", number=" + number +
                ", releaseDate=" + releaseDate +
                '}';
    }
}
