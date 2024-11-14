public class Review01 {

    public static void main(String[] args) {
        int mainPrice = 500;
        int taxAmount = tax(mainPrice);
        int totalPrice = mainPrice + taxAmount;

        String output = mainPrice + "円の商品の税込価格は" + totalPrice + "円（消費税は" + taxAmount + "円）です。";

        System.out.println(output);
    }

    public static int tax(int price) {
        double taxRate = 0.1;
        return (int)(price * taxRate);
    }
}