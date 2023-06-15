public class PrimeRoom extends Room {
    private int services;
    private boolean catering;

    public PrimeRoom(String id, String name, boolean available, int days, double price, int services, boolean catering) {
        super(id, name, available, days, price);
        this.services = services;
        this.catering = catering;
    }

    public int getServices() {
        return services;
    }

    public void setServices(int services) {
        this.services = services;
    }

    public boolean isCatering() {
        return catering;
    }

    public void setCatering(boolean catering) {
        this.catering = catering;
    }

    @Override
    public double getPayment() {
        if (catering) {
            return (this.getDays() * (this.getPrice() + 0.3 * this.services * this.getPrice())) + 0.2*this.getDays()*this.getPrice();
        }
        return this.getDays() * (this.getPrice() + 0.3 * this.services * this.getPrice());
    }
}
