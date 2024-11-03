package commands;

import git_simulation.RepositoryManager;
import git_simulation.Commit;

public class CheckoutCommand implements GitCommand {
    private RepositoryManager repository;
    private int commitIndex;

    public CheckoutCommand(RepositoryManager repository, int commitIndex) {
        this.repository = repository;
        this.commitIndex = commitIndex;
    }

    @Override
    public void execute() {
        Commit commit = repository.getCommit(commitIndex);
        if (commit != null) {
            System.out.println("Checked out to commit: " + commit);
        } else {
            System.out.println("Commit not found");
        }
    }
}
