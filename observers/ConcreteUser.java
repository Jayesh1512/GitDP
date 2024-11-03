package observers;

public class ConcreteUser implements User {
    private String name;

    public ConcreteUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification for " + name + ": " + message);
    }
}
