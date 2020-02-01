public class testVipCustomer {
    private String name;
    private long limit;
    private String email;

    public testVipCustomer() {
         this("Ashwin",100000,"ashwin@email.com");
    }

    public testVipCustomer(long limit, String email) {
        this("Ashwin",limit,email);
    }

    public testVipCustomer(String name, long limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
