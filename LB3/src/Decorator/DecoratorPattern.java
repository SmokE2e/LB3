package Decorator;

public class DecoratorPattern {
    public static void main(String[] args) {
        Hairstyle basicHairstyle = new BasicHairstyle();
        System.out.println(basicHairstyle.getDescription() + " за " + basicHairstyle.cost() + " рублей");

        Hairstyle styledHairstyle = new HairColoringDecorator(basicHairstyle);
        System.out.println(styledHairstyle.getDescription() + " за " + styledHairstyle.cost() + " рублей");

        Hairstyle finalHairstyle = new HairStylingDecorator(styledHairstyle);
        System.out.println(finalHairstyle.getDescription() + " за " + finalHairstyle.cost() + " рублей");
    }
}