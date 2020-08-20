public class Office {
    private String address;

    public Office(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Office{" +
                "address='" + address + '\'' +
                '}';
    }
}
