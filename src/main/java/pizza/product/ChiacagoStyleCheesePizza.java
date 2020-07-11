package pizza.product;

/**
 * @description: 芝加哥风味芝士披萨
 * @author: 赵波
 * @createtime :2020-07-01 10:09:14
 **/
public class ChiacagoStyleCheesePizza extends Pizza {
    public ChiacagoStyleCheesePizza() {
        name = "芝加哥风味芝士披萨";
        dough = "白面";
        sauce = "甜辣酱";
        toppings.add("奶酪");
    }

    @Override
    public void cut() {
        System.out.println("芝加哥独特且披萨方式");
    }
}
