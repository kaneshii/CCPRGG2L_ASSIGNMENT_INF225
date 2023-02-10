public class Cashier {

    public void checkOut(GroceryItem item) {
        System.out.println("You have purchased " + item.name);
    }
    public void showItemPrice(GroceryItem price){
        System.out.println("The price is " + price.price);
    }
    
}