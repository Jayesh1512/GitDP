package commands;

import git_simulation.RepositoryManager;
import git_simulation.Commit;

public class LogCommand implements GitCommand {
    private RepositoryManager repository;

    public LogCommand(RepositoryManager repository) {
        this.repository = repository;
    }

    @Override
    public void execute() {
        System.out.println("Commit Log:");
        for (Commit commit : repository.getCommits()) {
            System.out.println(commit);
        }
    }
}
