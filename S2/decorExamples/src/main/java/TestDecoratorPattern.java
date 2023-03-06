import java.text.DecimalFormat;

public class TestDecoratorPattern {
    public static void main(String[] args) {
        DecimalFormat dformat = new DecimalFormat("#.##");
        Pizza pizza = new SimplyVegPizza();

        pizza = new Brocoli(pizza);
        pizza = new RomaTomatoes(pizza);

        System.out.println("Desc: "+pizza.getDesc());
        System.out.println("Price: "+dformat.format(pizza.getPrice()));

        pizza = new SimplyNonVegPizza();
        pizza = new Meat(pizza);
        pizza = new Chicken(pizza);

        System.out.println("Desc:"+pizza.getDesc());
        System.out.println("Price:"+dformat.format(pizza.getPrice()));
    }
}