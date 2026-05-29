package com.java.practise.abstraction;

public class Main {
    public static void processCheckout(Product[] cart) {
        double total = 0;
        System.out.println("\n--- Processing Shopping Cart ---");

        for(Product p : cart) {
            p.displayInfo();

            double finalPrice = p.calculateFinalPrice();
            System.out.printf("   Final Price (after promo/fees): $%.2f%n", finalPrice);
            total += finalPrice;
        }
        System.out.printf("--------------------------------\nTOTAL AMOUNT DUE: $%.2f%n", total);
    }

    public static void generateShippingManifest(Shippable[] items) {
        System.out.println("\n--- Generating Shipping Manifest ---");
        for(Shippable s : items) {
            System.out.printf("Ship via %s (Weight: %.1fkg)%n", s.getShippingProvider(), s.getWeight());
        }
    }

    public static void main(String[] args) {

        Promotable.broadcastGlobalSale();

        Product laptop = new PhysicalProduct("LAP-01", 1000.0, 2.5);
        Product ebook = new DigitalProduct("EBK-99", 20.0, "link.com/download");
        Product headphones = new PhysicalProduct("AUD-44", 150.0, 0.5);


        Product[] cart = new Product[]{laptop, ebook, headphones};


        Shippable[] outgoingShipments = new Shippable[]{
                (Shippable) laptop,
                (Shippable) headphones
        };

        processCheckout(cart);
        generateShippingManifest(outgoingShipments);
    }
}

