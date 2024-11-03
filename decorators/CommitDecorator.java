package decorators;

import git_simulation.Commit;

public abstract class CommitDecorator extends Commit {
    protected Commit commit;

    public CommitDecorator(Commit commit) {
        super(commit.getMessage(), commit.getData());
        this.commit = commit;
    }

    @Override
    public abstract String toString();
}
