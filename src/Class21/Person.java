package Class21;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    class Address {
        private String city;
        private String state;

        public Address(String city, String state) {
            this.city = city;
            this.state = state;
        }
        public void printAddress() {
            System.out.println("City: " + city);
            System.out.println("State: " + state);
        }
    }
    public void showAddress(String city, String state) {
        Address address = new Address(city, state);
        address.printAddress();
    }
    public String getName() {
        return name;
    }
}