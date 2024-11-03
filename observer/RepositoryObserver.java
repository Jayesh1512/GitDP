package observer;

import decorator.Commit;

public interface RepositoryObserver {
    void onNewCommit(Commit commit);
}
