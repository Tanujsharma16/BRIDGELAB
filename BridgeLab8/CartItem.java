class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    double totalCost() {
        return price * quantity;
    }

    void display() {
        System.out.println("Item: " + itemName + ", Price: " + price +
                ", Quantity: " + quantity + ", Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 50000, 1);
        cart.display();
        cart.addItem(1);
        cart.display();
        cart.removeItem(1);
        cart.display();
    }
}
