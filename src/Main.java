public class Main {
    public static void main(String[] args) {
        StoreOneA storeOneA = new StoreOneA(true, 100000, 12, false);
        storeOneA.enterStoreDetails();
        storeOneA.showStoreInfo();
        System.out.println("Monthly Loan Payment: " + storeOneA.caculateLoanFinancing());
    }
}