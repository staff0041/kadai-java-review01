
public class Review01 {
    public static void main(String[] args) {
        int taxExcluded = 100;
        int jct = tax(taxExcluded);
        int taxIncluded = taxExcluded + jct;
        System.out.println(taxExcluded + "円の商品の税込価格は" + taxIncluded + "円（消費税は" + jct + "円）です。");
    }

    public static int tax(int taxExcluded) {
        double jctRate = 0.1;
        int result = (int) (taxExcluded * jctRate);
        return result;
    }
}