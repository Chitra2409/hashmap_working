# Custom HashMap Implementation in Java

A simple implementation of a HashMap built from scratch to understand the internal mechanics of data structures. This project uses **Separate Chaining** (Array of Linked Lists) to handle collisions.

## Features
- **Generic Key-Value Storage**: Supports any data types (e.g., `<String, Integer>`).
- **Core Operations**:
  - `put(K key, V value)`: Insert or update a key-value pair.
  - `get(K key)`: Retrieve a value by its key.
- **Collision Handling**: Uses separate chaining (linked lists) for keys that hash to the same bucket.
- **Dynamic Hashing**: Implements a custom `getBucketIndex` method using Java's `hashCode()`.

## Project Structure
- `MyHashMap.java`: The core implementation containing the `Node` class and map logic.
- `Main.java`: A test driver to demonstrate insertion, retrieval, and updates.

## How to Run
1. Compile the Java files:
   ```bash
   javac Main.java MyHashMap.java
   ```
2. Run the main class:
   ```bash
   java Main
   ```

## Roadmap
- [x] Basic `put` and `get`
- [x] `remove(K key)` implementation
- [x] Dynamic resizing (`rehash`)
