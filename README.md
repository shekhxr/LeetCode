# LeetCode Solutions

This repository contains my solutions to various LeetCode problems, primarily implemented in Java. Each solution is typically housed in its own `.java` file, named after the problem for easy identification.

## Structure

Solutions are organized directly under the root directory, with each problem having its own `.java` file. For problems that might require auxiliary classes (e.g., `ListNode` for linked lists, `TreeNode` for trees), these are often included within the same solution file or as separate, common utility files if used across many problems.

## How to Use

Each `.java` file contains a self-contained solution to its respective LeetCode problem.

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/your-username/your-leetcode-repo.git](https://github.com/your-username/your-leetcode-repo.git)
    cd your-leetcode-repo
    ```
2.  **Navigate to a specific solution:**
    For example, to view the `AddTwoNumbers` solution:
    ```bash
    cd .
    ```
    (Since solutions are in the root, you'll already be there after cloning and `cd`ing into the repo.)
3.  **Compile and Run (for testing/understanding):**
    Most LeetCode solutions are methods within a class, not complete `main` methods for direct execution outside a testing framework. However, for some problems (like `BestTimeToBuyAndSellStocks.java`), there might be a `main` method for simple local testing.

    To compile a single file (if it has a `main` method or is part of a local test setup):
    ```bash
    javac <ProblemName>.java
    java <ProblemName>
    ```

    For problems requiring a `ListNode` or `TreeNode` class definition, ensure that class is also available or defined within the same file for compilation.

## Contributing

If you find any issues, have suggestions for improvements, or want to contribute alternative solutions, feel free to open an issue or submit a pull request!

## About LeetCode

LeetCode is an online platform offering a vast collection of algorithmic problems to help developers prepare for coding interviews. Solving these problems improves problem-solving skills, data structures, and algorithms knowledge.

---
