package Decorator;

class HairColoringDecorator extends HairstyleDecorator {
    public HairColoringDecorator(Hairstyle decoratedHairstyle) {
        super(decoratedHairstyle);
    }

    @Override
    public String getDescription() {
        return decoratedHairstyle.getDescription() + ", окрашивание";
    }

    @Override
    public double cost() {
        return decoratedHairstyle.cost() + 100.0;
    }
}