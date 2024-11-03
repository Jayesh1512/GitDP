package simulation;

import factory.GitCommandFactory;
import observer.RepositoryManager;
import decorator.Commit;
import decorator.ImportantCommitDecorator;
import decorator.TaggedCommitDecorator;

public class GitSimulation {
    public static void main(String[] args) {
        RepositoryManager repo = new RepositoryManager();
        GitCommandFactory factory = new GitCommandFactory(repo);

        // Add an observer to the repository
        repo.addObserver(commit -> System.out.println("Observer notified of new commit: " + commit));

        // Execute commands directly through the factory
        factory.executeCommand("commit", "Initial commit", "Data1");
        factory.executeCommand("log");
        factory.executeCommand("checkout", "0");

        // Decorator pattern example
        Commit commit = new Commit("Decorator test commit", "Data2");
        Commit importantCommit = new ImportantCommitDecorator(commit);
        Commit taggedCommit = new TaggedCommitDecorator(commit, "v1.0");

        System.out.println("Important Commit: " + importantCommit);
        System.out.println("Tagged Commit: " + taggedCommit);
    }
}
