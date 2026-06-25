class Product {

    private int productId;
    private String productName;
    private String category;

    public Product(int productId,
                   String productName,
                   String category) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId +
                ", Name: " + productName +
                ", Category: " + category;
    }
}

 class SearchOperations {

    // Linear Search
    public static Product linearSearch(
            Product[] products,
            int targetId) {

        for(Product product : products) {

            if(product.getProductId() == targetId) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(
            Product[] products,
            int targetId) {

        int left = 0;
        int right = products.length - 1;

        while(left <= right) {

            int mid = (left + right) / 2;

            if(products[mid].getProductId() == targetId) {
                return products[mid];
            }

            if(products[mid].getProductId() < targetId) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return null;
    }
}

public class ECommerceSearchTest {

    public static void main(String[] args) {

        Product[] products = {

                new Product(101,"Laptop","Electronics"),
                new Product(102,"Mobile","Electronics"),
                new Product(103,"Shoes","Fashion"),
                new Product(104,"Watch","Accessories"),
                new Product(105,"Headphones","Electronics")
        };

        int targetId = 104;

        System.out.println("Linear Search Result:");

        Product linearResult =
                SearchOperations.linearSearch(
                        products,
                        targetId);

        System.out.println(linearResult);

        System.out.println();

        System.out.println("Binary Search Result:");

        Product binaryResult =
                SearchOperations.binarySearch(
                        products,
                        targetId);

        System.out.println(binaryResult);
    }
}