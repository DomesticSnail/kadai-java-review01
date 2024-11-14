public class Review01 {

    public static void main(String[] args) {
        int mainPrice = 500;
        int taxAmount = calculate(mainPrice);
        int totalPrice = mainPrice + taxAmount;

        String output = mainPrice + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。";

        System.out.println("Main Price: " + mainPrice + "円");
        System.out.println("Tax Amount: " + taxAmount + "円");
        System.out.println("Total Price: " + totalPrice + "円");
        System.out.println(output);
    }


    public static int calculate(int price) {
        double taxRate = 0.1;
        return (int)(price * taxRate);
    }
}