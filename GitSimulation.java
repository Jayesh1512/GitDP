import commands.*;
import decorators.*;
import observers.*;

public class GitSimulation {
    public static void main(String[] args) {
        RepositoryManager repo = new RepositoryManager();
        GitCommandFactory factory = new GitCommandFactory(repo);

        // Observers
        User user1 = new ConcreteUser("Alice");
        User user2 = new ConcreteUser("Bob");
        repo.addUser(user1);
        repo.addUser(user2);

        // Create and execute commands via factory
        GitCommand commitCommand = factory.createCommand("commit", "Initial commit", "Data1");
        commitCommand.execute();

        GitCommand logCommand = factory.createCommand("log");
        logCommand.execute();

        GitCommand checkoutCommand = factory.createCommand("checkout", "0");
        checkoutCommand.execute();

        // Decorators
        Commit commit = new Commit("Decorator test commit", "Data2");
        Commit importantCommit = new ImportantCommitDecorator(commit);
        Commit taggedCommit = new TaggedCommitDecorator(commit, "v1.0");

        repo.addCommit(importantCommit);
        repo.addCommit(taggedCommit);

        logCommand.execute();
    }
}
