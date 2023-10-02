package seminar_1;

import java.util.ArrayList;

public class task5 {

    public static void main(String[] args) {
        System.out.println(checkingShoppingCart());
    }

    public static boolean checkingShoppingCart() {
        ArrayList<String> productCategories = new ArrayList<>();

        productCategories.add("fruits");
        productCategories.add("vegetables");
        productCategories.add("bakery");

        ArrayList<String> products = new ArrayList<>();

        products.add("apple");
        products.add("tomato");
        products.add("bread");
        products.add("water");

        for (String product : products) {
            if (product.equals("apple")) {
                System.out.println("category: " + productCategories.get(0));
            } else if (product.equals("tomato")) {
                System.out.println("category: " + productCategories.get(1));
            } else if (product.equals("bread")) {
                System.out.println("category: " + productCategories.get(2));
            } else {
                assert false : "Unknown category for the product " + product;
            }
        }
        return false;
    }
}
