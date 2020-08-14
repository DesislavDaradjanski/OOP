package bg.mobile;

public class Car {
    private Engine engine;
    private Make make;
    private GearBox gearBox;
    private int year;
    private String model;
    private int kw;
    private int door;
    private int euroISO;
    private String color;
    private int km;
    private Seller seller;

    public Seller getSeller() {
        return seller;
    }

    public Car setSeller(Seller seller) {
        this.seller = seller;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Make getMake() {
        return make;
    }

    public Car setMake(Make make) {
        this.make = make;
        return this;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public Car setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
        return this;
    }

    public int getYear() {
        return year;
    }

    public Car setYear(int year) {
        this.year = year;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Car setModel(String model) {
        this.model = model;
        return this;
    }

    public int getKw() {
        return kw;
    }

    public Car setKw(int kw) {
        this.kw = kw;
        return this;
    }

    public int getDoor() {
        return door;
    }

    public Car setDoor(int door) {
        this.door = door;
        return this;
    }

    public int getEuroISO() {
        return euroISO;
    }

    public Car setEuroISO(int euroISO) {
        this.euroISO = euroISO;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Car setColor(String color) {
        this.color = color;
        return this;
    }

    public int getKm() {
        return km;
    }

    public Car setKm(int km) {
        this.km = km;
        return this;
    }

    public double getPrice() {
        return price;
    }

    public Car setPrice(double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Car setDescription(String description) {
        this.description = description;
        return this;
    }

    private double price;
    private String description;


}
