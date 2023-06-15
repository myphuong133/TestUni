public class Room implements Comparable<Room>{
    private String id, name;
    private boolean available;
    private int days;
    private double price;

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", available=" + available +
                ", days=" + days +
                ", price=" + price +
                '}';
    }

    public Room(String id, String name, boolean available, int days, double price) {
        this.id = id;
        this.name = name;
        this.available = available;
        this.days = days;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPayment() {
        return this.days * this.price;
    }

    @Override
    public int compareTo(Room o) {
        Integer payMentNum = (int) this.getPayment();
        int sortByPayment = payMentNum.compareTo((int) o.getPayment());
        return sortByPayment;
    }
}
