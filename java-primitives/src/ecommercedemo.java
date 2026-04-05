public class ecommercedemo {
        public static void main(String[] args) {


            // Product Variables
            System.out.println("-----------product varibles--------");

            int productId = 101;
            String productName = "Smartphone";
            float productPrice = 19999.99f;
            char productGrade = 'A';
            boolean inStock = true;


            // Customer Variables
            System.out.println("-----------customer varibles--------");

            int customerId = 501;
            String customerName = "Murari";
            long phoneNumber = 9876543210L;
            char gender = 'M';
            boolean isPrimeMember = true;

            // Order Variables
            System.out.println("-----------order varibles------------");

            int orderId = 9001;
            double orderAmount = 19999.99;    // double (more precision)
            int quantity = 1;
            boolean isDelivered = false;

            
            // Display Output

            System.out.println("----- Product Details -----");
            System.out.println("Product ID: " + productId);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + productPrice);
            System.out.println("Grade: " + productGrade);
            System.out.println("In Stock: " + inStock);

            System.out.println("\n----- Customer Details -----");
            System.out.println("Customer ID: " + customerId);
            System.out.println("Name: " + customerName);
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Gender: " + gender);
            System.out.println("Prime Member: " + isPrimeMember);

            System.out.println("\n----- Order Details -----");
            System.out.println("Order ID: " + orderId);
            System.out.println("Order Amount: " + orderAmount);
            System.out.println("Quantity: " + quantity);
            System.out.println("Delivered: " + isDelivered);
        }
    }
