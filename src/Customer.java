class Customer implements DiscountRate {

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    private String customerName;
    private String customerType;

    public Customer(String customerName, String customerType){
        this.customerName = customerName;
        this.customerType = customerType;
    }

    @Override
    public double getServiceMemberDiscount() {
        String type = customerType;
        switch (type) {
            case "Premium":
                return 0.2;
            case "Gold":
                return 0.15;
            case "Silver":
                return 0.1;
            default:
                return 0.0;
        }
    }

    @Override
    public double getProductMemberDiscount() {
        String type = customerType;
        switch (type) {
            case "Premium":
            case "Gold":
            case "Silver":
                return 0.1;
            default:
                return 0.0;
        }
    }
}
