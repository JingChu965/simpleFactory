package pizza.store;

import pizza.product.Pizza;
/**
 * @description: 披萨店
 * @author: 赵波
 * @createtime :2020-07-01 09:29:58
 **/
public abstract class BasePizzaStore {
    /**
     * 披萨种类
     * chese芝士披萨,clam蛤蜊比萨,veggie素食披萨
     */
    static final String CHESE="chese";
    static final String CLAM="clam";
    static final String VEGGIE="veggie";

    public BasePizzaStore() {
    }

    /**
     * 下披萨订单
     *
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    /**
     * 新建披萨
     *
     * @param type
     * @return
     */
    abstract Pizza createPizza(String type);
}
