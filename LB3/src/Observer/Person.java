package Observer;

class Person implements Observer {
    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " получил(а) сообщение: " + message);
    }
}