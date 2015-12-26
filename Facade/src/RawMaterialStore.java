public class RawMaterialStore implements Store {

    @Override
    public Goods getGoods() {
        return new RawMaterialGoods();
    }
    
}