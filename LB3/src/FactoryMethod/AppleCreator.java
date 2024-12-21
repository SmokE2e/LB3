package FactoryMethod;

class AppleCreator extends Creator {
    @Override
    public Product createProduct() {
        return new Apple();
    }
}