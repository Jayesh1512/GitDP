package factory;

import observer.RepositoryManager;

public class GitCommandFactory {
    private RepositoryManager repo;

    public GitCommandFactory(RepositoryManager repo) {
        this.repo = repo;
    }

    public void executeCommand(String type, String... args) {
        switch (type) {
            case "commit":
                repo.createCommit(args[0], args[1]);
                break;
            case "log":
                repo.showCommitLog();
                break;
            case "checkout":
                repo.checkout(args[0]);
                break;
            default:
                throw new IllegalArgumentException("Unknown command type: " + type);
        }
    }
}
