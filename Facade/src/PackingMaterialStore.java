public class PackingMaterialStore implements Store {

    @Override
    public Goods getGoods() {
        return new PackingMaterialGoods();
    }
    
}