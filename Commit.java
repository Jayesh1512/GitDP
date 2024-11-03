package git_simulation;

public class Commit {
    private String message;
    private String data;

    public Commit(String message, String data) {
        this.message = message;
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Commit: " + message + ", Data: " + data;
    }
}
