package FactoryMethod;

class BananaCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Banana();
    }
}