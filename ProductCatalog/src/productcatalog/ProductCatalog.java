
package productcatalog;


public class ProductCatalog {
    private int[] productIds;
    private String[] productNames;

    public ProductCatalog(int[] productIds, String[] productNames) {
        this.productIds = productIds;
        this.productNames = productNames;
    }

    public boolean doesProductIdExist(int idToCheck) {
        for (int id : productIds) {
            if (id == idToCheck) {
                return true;
            }
        }
        return false;
    }
    
    public boolean doesProductIdExist2(String input) {
    try {
        int idToCheck = Integer.parseInt(input);
        for (int id : productIds) {
            if (id == idToCheck) {
                return true;
            }
        }
    } catch (NumberFormatException e) {
        // Invalid input, not a number
    }
    return false;
}


}
