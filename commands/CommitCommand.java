package commands;

import git_simulation.RepositoryManager;
import git_simulation.Commit;

public class CommitCommand implements GitCommand {
    private RepositoryManager repository;
    private Commit commit;

    public CommitCommand(RepositoryManager repository, String message, String data) {
        this.repository = repository;
        this.commit = new Commit(message, data);
    }

    @Override
    public void execute() {
        repository.addCommit(commit);
        System.out.println("Committed: " + commit);
    }
}
