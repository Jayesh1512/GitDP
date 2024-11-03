package observer;

import decorator.Commit;

import java.util.ArrayList;
import java.util.List;

public class RepositoryManager {
    private List<Commit> commits = new ArrayList<>();
    private List<RepositoryObserver> observers = new ArrayList<>();

    public void addObserver(RepositoryObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(RepositoryObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers(Commit commit) {
        for (RepositoryObserver observer : observers) {
            observer.onNewCommit(commit);
        }
    }

    public void createCommit(String message, String data) {
        Commit commit = new Commit(message, data);
        commits.add(commit);
        System.out.println("Created: " + commit);
        notifyObservers(commit);  // Notify all observers about the new commit
    }

    public void showCommitLog() {
        System.out.println("Commit Log:");
        for (int i = 0; i < commits.size(); i++) {
            System.out.println(i + ": " + commits.get(i));
        }
    }

    public void checkout(String commitId) {
        int index = Integer.parseInt(commitId);
        if (index >= 0 && index < commits.size()) {
            System.out.println("Checked out to: " + commits.get(index));
        } else {
            System.out.println("Invalid commit ID");
        }
    }
}
