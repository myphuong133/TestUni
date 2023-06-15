public class LuxuryRoom extends Room {
    private int nBeds;
    private boolean view;

    public LuxuryRoom(String id, String name, boolean available, int days, double price, int nBeds, boolean view) {
        super(id, name, available, days, price);
        this.nBeds = nBeds;
        this.view = view;
    }

    public int getnBeds() {
        return nBeds;
    }

    public void setnBeds(int nBeds) {
        this.nBeds = nBeds;
    }

    public boolean isView() {
        return view;
    }

    public void setView(boolean view) {
        this.view = view;
    }

    @Override
    public double getPayment() {
        if (view){
            return (this.getDays() * (this.getPrice() + 0.2 * this.nBeds * this.getPrice())) + 0.05*this.getPrice()*this.getnBeds();
        }
        return this.getDays() * (this.getPrice() + 0.2 * this.nBeds * this.getPrice());
    }
}
