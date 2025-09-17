class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void display() {
        System.out.println("Code: " + itemCode + ", Name: " + itemName + ", Price: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Pen", 10);
        item.display();
        System.out.println("Total cost for 5 items: " + item.totalCost(5));
    }
}
