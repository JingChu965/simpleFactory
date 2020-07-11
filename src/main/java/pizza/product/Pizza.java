package pizza.product;

import java.util.ArrayList;

/**
 * @description: 披萨产品
 * @author: 赵波
 * @createtime :2020-07-01 09:28:40
 **/
public class Pizza {
    /**
     * 披萨名称
     */
    String name;
    /**
     * 面团
     */
    String dough;
    /**
     * 酱
     */
    String sauce;
    /**
     * 调料
     */
    ArrayList toppings = new ArrayList();
    /**
     * 准备披萨
     */
    public void prepare(){
        System.out.println("准备披萨："+name);
        System.out.println("准备面团："+dough);
        System.out.println("准备酱汁："+sauce);
        System.out.println("准备调料："+toppings.toString());
    }

    public String getName() {
        return name;
    }

    /**
     * 烹饪披萨
     */
    public void bake(){System.out.println("烹饪披萨");}

    /**
     * 披萨切块
     */
    public void cut(){System.out.println("披萨切块");}

    /**
     * 披萨装盒
     */
    public void box(){System.out.println("披萨装盒");}
}
