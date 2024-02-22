class Sale {
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Sale(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public double getTotalExpense(){
        double totalServiceExpense = this.serviceExpense - this.serviceExpense * this.customer.getServiceMemberDiscount();
        double totalProductExpense = this.productExpense - this.productExpense * this.customer.getProductMemberDiscount();
        return totalServiceExpense + totalProductExpense;
        /*return  (getProductExpense() + getServiceExpense())
                - ((customer.getProductMemberDiscount() * getProductExpense())
                + (customer.getServiceMemberDiscount() * getServiceExpense()));*/
    }

    public void displayInfo(){
        float discount = (float) ((this.serviceExpense+this.productExpense)-getTotalExpense());
        System.out.println("-------------------------------------");
        System.out.println("|           SALE INFORMATION        |");
        System.out.println("-------------------------------------");
        System.out.println("Customer Name: " + this.customer.getCustomerName());
        System.out.println("Customer Type: " + this.customer.getCustomerType());
        System.out.println("Date: " + this.date);
        System.out.println("-------------------------------------");
        System.out.println("|           EXPENSE DETAILS         |");
        System.out.println("-------------------------------------");
        System.out.println("Discount : "+discount);
        System.out.printf("Service Expense: $%.2f\n", this.serviceExpense);
        System.out.printf("Product Expense: $%.2f\n", this.productExpense);
        System.out.println("-------------------------------------");
        System.out.println("|           TOTAL EXPENSE           |");
        System.out.println("-------------------------------------");
        System.out.printf("Total Expense: $%.2f\n", this.getTotalExpense());
    }

}