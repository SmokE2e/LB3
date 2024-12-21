package Decorator;

class BasicHairstyle implements Hairstyle {
    @Override
    public String getDescription() {
        return "Простая стрижка";
    }

    @Override
    public double cost() {
        return 30.0;
    }
}