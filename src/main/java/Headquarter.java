public class Headquarter extends Office{
    public Headquarter(String address) {
        super(address);
    }

    @Override
    public String toString() {
        return "Headquarter{" +
                "address='" + super.getAddress() + '\'' +
                '}';
    }
}
