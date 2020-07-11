import pizza.product.Pizza;
import pizza.store.BasePizzaStore;
import pizza.store.ChiacagoStyleStroe;
import pizza.store.NyStyleStroe;

/**
 * @description: 简单工厂测试类
 * @author: 赵波
 * @createtime :2020-07-01 09:25:20
 **/
public class TestSimpleFactory {
    public static void main(String[] args) {
        BasePizzaStore nyStore = new NyStyleStroe();

        BasePizzaStore chicagoStore = new ChiacagoStyleStroe();

        Pizza pizza = nyStore.orderPizza("chese");
        System.out.println(pizza.getName());

        pizza = chicagoStore.orderPizza("chese");
        System.out.println(pizza.getName());

    }
}
