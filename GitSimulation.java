public class GitSimulation {
    public static void main(String[] args) {
        RepositoryManager repo = new RepositoryManager();
        GitCommandFactory factory = new GitCommandFactory(repo);

        // Commit command
        GitCommand commitCommand = factory.createCommand("commit", "Initial commit", "Data1");
        commitCommand.execute();

        // Log command
        GitCommand logCommand = factory.createCommand("log");
        logCommand.execute();

        // Checkout command
        GitCommand checkoutCommand = factory.createCommand("checkout", "0");
        checkoutCommand.execute();

        // Decorator pattern example
        Commit commit = new Commit("Decorator test commit", "Data2");
        Commit importantCommit = new ImportantCommitDecorator(commit);
        Commit taggedCommit = new TaggedCommitDecorator(commit, "v1.0");

        System.out.println("Important Commit: " + importantCommit);
        System.out.println("Tagged Commit: " + taggedCommit);
    }
}
