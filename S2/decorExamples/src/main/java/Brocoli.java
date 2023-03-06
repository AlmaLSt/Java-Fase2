public class Brocoli extends PizzaDecorator {
    private final Pizza pizza;
    public Brocoli(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDesc(){
        return pizza.getDesc()+", Brocoli (9.25)";
    }
    @Override
    public double getPrice(){
        return pizza.getPrice()+9.25;
    }
}