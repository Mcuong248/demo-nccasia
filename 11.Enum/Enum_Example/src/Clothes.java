public enum Clothes {
    TROUSER("Skinny jeans", 550000, Size.S),
    SHIRT("Bomber", 450000, Size.S),
    SHOES("Nike", 800000, Size.M),
    DRESS("Gucci", 100000, Size.XL);

    private final String name;
    private final double price;
    private final Size size;

    Clothes(String name, double price, Size size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Size getSize() {
        return size;
    }
}
