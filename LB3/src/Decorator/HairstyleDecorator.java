package Decorator;

abstract class HairstyleDecorator implements Hairstyle {
    protected Hairstyle decoratedHairstyle;

    public HairstyleDecorator(Hairstyle decoratedHairstyle) {
        this.decoratedHairstyle = decoratedHairstyle;
    }

    @Override
    public String getDescription() {
        return decoratedHairstyle.getDescription();
    }

    @Override
    public double cost() {
        return decoratedHairstyle.cost();
    }
}