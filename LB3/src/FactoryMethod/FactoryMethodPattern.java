package FactoryMethod;

public class FactoryMethodPattern {
    public static void main(String[] args) {
        Creator creator = new AppleCreator();
        Product apple = creator.createProduct();
        apple.eat();

        creator = new BananaCreator();
        Product banana = creator.createProduct();
        banana.eat();
    }
}