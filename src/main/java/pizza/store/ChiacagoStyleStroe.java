package pizza.store;

import pizza.product.*;


/**
 * @description: 芝加哥风味披萨店
 * @author: 赵波
 * @createtime :2020-07-01 09:59:01
 **/
public class ChiacagoStyleStroe extends BasePizzaStore {

    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (CHESE.equals(type)) {
            pizza = new ChiacagoStyleCheesePizza();

        } else if (CLAM.equals(type)) {
            pizza = new ClamPizza();

        } else if (VEGGIE.equals(type)) {
            pizza = new VeggiePizza();

        }
        return pizza;
    }
}
