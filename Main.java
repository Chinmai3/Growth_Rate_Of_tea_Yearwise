import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> products = new ArrayList<ArrayList<String>>();

        // Adding the data about the products to the arraylist.
        ArrayList<String> product1 = new ArrayList<String>();
        product1.add("Lemon Tea");
        product1.add("56%");
        product1.add("2020");
        products.add(product1);

        ArrayList<String> product2 = new ArrayList<String>();
        product2.add("Rose Tea");
        product2.add("37%");
        product2.add("2020");
        products.add(product2);

        ArrayList<String> product3 = new ArrayList<String>();
        product3.add("Coorg Tea");
        product3.add("10%");
        product3.add("2021");
        products.add(product3);
        
        ArrayList<String> product4 = new ArrayList<String>();
        product4.add("Red Tea");
        product4.add("60%");
        product4.add("2021");
        products.add(product3);
        
        ArrayList<String> product5= new ArrayList<String>();
        product5.add("Black Tea");
        product5.add("19%");
        product5.add("2020");
        products.add(product3);



        // Pick the elements the that contain the word tea.
        ArrayList<ArrayList<String>> filteredProducts = new ArrayList<ArrayList<String>>();
        for (ArrayList<String> product : products) {
            if (product.get(0).contains("Tea")) {
                filteredProducts.add(product);
            }
        }

        // Demand rate for tea products with respect to year
        double demandSum2020 = 0.0;
        double demandSum2021 = 0.0;

        for (ArrayList<String> product : filteredProducts) {
            if (product.get(2).equals("2020")) {
                demandSum2020 += Double.parseDouble(product.get(1).replace("%", ""));
            } else if (product.get(2).equals("2021")) {
                demandSum2021 += Double.parseDouble(product.get(1).replace("%", ""));
            }
        }

        // display the demand for tea year wise
        System.out.println("Sum of growth rates for tea products in 2020: " + demandSum2020+ "%");
        System.out.println("Sum of growth rates for tea products in 2021: " + demandSum2021 + "%");
    }
}
