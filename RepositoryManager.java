package git_simulation;

import observers.User;
import java.util.ArrayList;
import java.util.List;

public class RepositoryManager {
    private List<Commit> commits = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addCommit(Commit commit) {
        commits.add(commit);
        notifyUsers("New commit added: " + commit);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public Commit getCommit(int index) {
        return index >= 0 && index < commits.size() ? commits.get(index) : null;
    }

    public List<Commit> getCommits() {
        return commits;
    }

    private void notifyUsers(String message) {
        for (User user : users) {
            user.update(message);
        }
    }
}
