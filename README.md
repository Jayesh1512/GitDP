# Java Git Simulation

This project is a simulation of basic Git functionalities implemented in Java. The project demonstrates the use of various design patterns, including the **Command**, **Observer**, and **Decorator** patterns, to model operations like committing changes, checking out commits, and logging commit history.

## Features

- **Commit Command**: Adds a commit to the repository.
- **Log Command**: Displays a log of all commits.
- **Checkout Command**: Checks out a specific commit by ID.
- **Observer Pattern**: Notifies users when a new commit is added.
- **Decorator Pattern**: Adds additional information (like tags and importance) to commits.

## Design Patterns Used

1. **Command Pattern**: Encapsulates different Git operations (commit, log, checkout) as separate commands, allowing flexible command execution.
2. **Observer Pattern**: Notifies registered users about changes to the repository (e.g., when a new commit is added).
3. **Decorator Pattern**: Adds extra attributes to commits, such as tags and importance, dynamically.

## Directory Structure

