package Decorator;

class HairStylingDecorator extends HairstyleDecorator {
    public HairStylingDecorator(Hairstyle decoratedHairstyle) {
        super(decoratedHairstyle);
    }

    @Override
    public String getDescription() {
        return decoratedHairstyle.getDescription() + ", укладка";
    }

    @Override
    public double cost() {
        return decoratedHairstyle.cost() + 50.0;
    }
}