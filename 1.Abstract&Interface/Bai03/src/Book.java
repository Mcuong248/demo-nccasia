public class Book implements IBook{
    private int id;
    private String name;
    private String publishDate;
    private String author;
    private String language;
    private float averagePrice;
    private int[] PriceList = new int[5];

    public Book() {
    }

    public Book(int id, String name, String publishDate, String author, String language, float averagePrice, int[] priceList) {
        this.id = id;
        this.name = name;
        this.publishDate = publishDate;
        this.author = author;
        this.language = language;
        this.averagePrice = averagePrice;
        PriceList = priceList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public float getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(float averagePrice) {
        this.averagePrice = averagePrice;
    }

    public int[] getPriceList() {
        return PriceList;
    }

    public void setPriceList(int[] priceList) {
        PriceList = priceList;
    }

    @Override
    public void display() {
        System.out.println("Name Book: "+this.name);
        System.out.println("Puslish Date: "+ this.publishDate);
        System.out.println("Author: " + this.author);
        System.out.println("Language: "+ this.language);
        System.out.println("Average Price: "+ this.averagePrice);
    }

    public void Calculate() {
        int sum= 0;
        for (int i = 0; i < PriceList.length; i++) {
            sum += PriceList[i];
        }
        averagePrice = sum/PriceList.length;
    }
}

