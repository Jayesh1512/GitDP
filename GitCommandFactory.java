package git_simulation;

import commands.*;

public class GitCommandFactory {
    private RepositoryManager repository;

    public GitCommandFactory(RepositoryManager repository) {
        this.repository = repository;
    }

    public GitCommand createCommand(String type, String... params) {
        switch (type) {
            case "commit":
                return new CommitCommand(repository, params[0], params[1]);
            case "checkout":
                return new CheckoutCommand(repository, Integer.parseInt(params[0]));
            case "log":
                return new LogCommand(repository);
            default:
                throw new IllegalArgumentException("Unknown command type: " + type);
        }
    }
}
