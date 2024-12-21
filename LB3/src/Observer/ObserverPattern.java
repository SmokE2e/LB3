package Observer;

public class ObserverPattern {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();

        Person person1 = new Person("Владик");
        Person person2 = new Person("Настя");

        cinema.addObserver(person1);
        cinema.addObserver(person2);

        cinema.notifyObservers("Вышел новый фильм! Приходите в кино");

        cinema.removeObserver(person1);
        cinema.removeObserver(person2);
    }
}