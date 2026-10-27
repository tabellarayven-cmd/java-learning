public class yyy {
    public void main(String[] args) {

        System.out.println("Single Item: " + CalculatePrice(250.0));
        System.out.println("Three Items: " + CalculatePrice(250.0, 3));
        System.out.println("Three Items: " + CalculatePrice(250.0, 3, 10));


    }

    static double CalculatePrice(double price) {
        return price;
    }


    static double CalculatePrice(double price, int quantity) {
        return price * quantity;
    }


    static double CalculatePrice(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountPrice = total * discount / 100;
        return total - discountPrice;
    }

}


