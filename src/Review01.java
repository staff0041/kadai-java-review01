
public class Review01 {

    public static void main(String[] args) {
        int taxExcluded = 100;
        int jct = getTaxIncludedPrice(taxExcluded);
        int taxIncluded = taxExcluded + jct;
        System.out.println(taxExcluded + "円の商品の税込価格は" + taxIncluded + "円（消費税は" + jct + "円）です。");
    }

    public static int getTaxIncludedPrice(int taxExcluded) {
        double jctRate = 0.1;
        int result = (int) (taxExcluded * jctRate); // キャストを追加
        return result;
    }

}
