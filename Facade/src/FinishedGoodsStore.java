public class FinishedGoodsStore implements Store {
    
    @Override
    public Goods getGoods() {
        
        FinishedGoods finishedGoods = new FinishedGoods();
        return finishedGoods;
    }
}