## Data Structures in Java 🚀💻🚀
# Arrays
``Definition:`` A fixed-size, ordered collection of elements of the same data type.
```
Diagram:
+---+---+---+---+
| 0 | 1 | 2 | 3 | (indices)
+---+---+---+---+
  |   |   |   |
  v   v   v
  [10, 20, 30, 40] (values)
 ```
``Access:`` Elements are accessed using a zero-based index (array[index]).
``Operations:`` Inserting or deleting elements is expensive as it requires shifting other elements.

# 2D Arrays
``Definition:`` A collection of arrays arranged in rows and columns, forming a matrix.
```
Diagram:
         col 0   col 1
   +---+---+---+---+
 row 0 | 10 | 20 | ... |
   +---+---+---+---+
 row 1 | 30 | 40 | ... |
   +---+---+---+---+
         ...
```
``Access:`` Elements are accessed using row and column indices (array[row][col]).
``Operations:`` Similar to 1D arrays, but with two indices.

# Maps
``Definition:`` An unordered collection of key-value pairs. Keys must be unique, values can be duplicated.
```
Diagram:
     key1 -> value1
          |
     key2 -> value2
          |
          ...
```
``Implementation:`` Hash tables (HashMap in Java) are common for efficient average-case access.
Operations: Add, remove, search, update elements based on keys.

# HashMap
``Definition:`` A specific implementation of the Map interface using a hash table for fast key-based retrieval.
``Diagram:`` (Same as Map)
``Key Points:``
Keys must have a proper hashCode() implementation and implement equals().
Hash collisions (multiple keys mapping to the same bucket) are handled using chaining or other techniques.

# Sets
``Definition:`` An unordered collection of unique elements.
```
Diagram:
     element1
          |
     element2
          |
          ...
```
Implementation: Hash tables (HashSet in Java) are common for efficient membership testing.
Operations: Add, remove, check if an element exists.

# Lists
``Definition:`` An ordered collection of elements, allowing duplicates.
```
Diagram:
+---+---+---+---+
| 0 | 1 | 2 | 3 | (indices)
+---+---+---+---+
  |   |   |   |
  v   v   v
  [10, 20, 20, 40] (values)
```
``Implementation:`` Arrays or linked lists can be used. Java's ArrayList uses an array internally.
``Operations:`` Add, remove, insert, access elements by index.

# LinkedList
``Definition:`` An ordered collection of elements where each element points to the next and (optionally) the previous element in the list.
```
Diagram:
   +---+---+   +---+---+   +---+---+
   | 10 | -> | 20 | -> | 30 | -> ...
   +---+---+   +---+---+   +---+---+
```
``Operations:`` Similar to Lists, but generally slower for random access (faster for insertions/deletions in the middle).
Queues

``Definition:`` A linear data structure where elements are inserted at the back (enqueue) and removed from the front (dequeue). Follows a First-In-First-Out (FIFO) principle.
```
Diagram:
         enqueue
          v
+---+---+   +---+---+   +---+---+
| 10 | -> | 20 | -> | 30 | -> ...
+---+---+   +---+---+   +---+---+
          dequeue ^
```
``Implementation:` Arrays or linked lists can be used. Java's LinkedList can be used as a Queue.
Sets, Maps, and Interfaces
Sets and Maps are interfaces in Java, defining the operations a collection must support.
HashMap and HashSet are concrete implementations of these interfaces.
You can create your own custom data structures that implement these interfaces.

# Hash Functions
``Definition:`` A function that takes an arbitrary input (key) and maps it to a fixed-size value (hash code) in a deterministic (always the same for the same input) way.
Purpose: Used in hash tables (like HashMap and HashSet) to efficiently store and retrieve key-value pairs. Hash codes are used as indexes to locate elements within the hash table.

# How Hash Functions Work:
``Input Key:`` The hash function takes an object (key) as input, which can be a string, integer, custom object, etc.
Transformation: The function applies a series of operations to the key, potentially involving bit manipulation, character manipulations, or other techniques.
Hash Code Output: The final result of the transformation is a fixed-size integer (hash code).

# Ideal Properties of a Hash Function:
``Deterministic:`` Same input key should always produce the same hash code.
Uniform Distribution: Hash codes should be evenly distributed across the available range to minimize collisions (multiple keys mapping to the same hash code).
Efficiency: The function should be relatively fast to compute.

# Common Hash Function Examples:
``Java's hashCode():`` Built-in method for objects that provides a basic hash code implementation.
MD5 and SHA-1: Cryptographic hash functions that are not ideal for hash tables due to their focus on security over distribution.

# Hash Collisions
``Definition:`` When two different keys map to the same hash code. This can happen even with good hash functions.
Collision Resolution Techniques:
Separate Chaining: Stores elements with the same hash code in a linked list at that index.
Open Addressing: Probes for an empty slot in the hash table if a collision occurs.

# Hash Codes
``Definition:`` The fixed-size integer value produced by a hash function.
Purpose: Used as an index within the hash table to locate the corresponding key-value pair.
Equality vs. Hash Code:
Two objects with the same hash code may not be equal. They might just have collided.
Two equal objects must have the same hash code for efficient retrieval in a hash table.
In Summary:

Hash functions and hash codes are essential components of hash tables,
 enabling efficient key-based access and retrieval of data. While collisions can
 occur, good hash functions
and collision resolution techniques minimize their impact on performance.