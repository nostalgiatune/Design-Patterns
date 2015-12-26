public class Client {

    /**
    * to get raw materials
    */
    public static void main(String[] args) {
        
        /*
        * StoreKeeper is facade, which hides details of system modules
        * from client and provides simplified interface.
        
        * getGoods-method uses AbstractFactory to instantiate goods
        */
        
        StoreKeeper keeper = new StoreKeeper();
        RawMaterialGoods rawMaterialGoods = keeper.getRawMaterialGoods();
    }
}