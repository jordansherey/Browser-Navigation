# Web Browser Navigation Simulator

A Java-based browser simulator that implements core navigation features using custom data structures. Built without Java's Collections framework to demonstrate fundamental data structure implementations.

## Features

- **Web Navigation**: Visit websites with back/forward navigation
- **Browsing History**: Track and display chronological history
- **Session Management**: Save and restore browsing sessions
- **Desktop Integration**: Launches URLs in your default browser

## Implementation Details

### Custom Data Structures

**BrowserLinkedList** - Doubly linked list with sentinel nodes
- O(1) operations for adding/removing from both ends
- Custom iterator with concurrent modification detection

**BrowserArrayList** - Circular array-based dynamic list
- Automatic resizing with modular arithmetic
- Efficient queue operations

**BrowserStack** - LIFO structure for back/forward navigation
- Built on BrowserLinkedList
- O(1) push, pop, and peek operations

**BrowserQueue** - FIFO structure for browsing history
- Built on BrowserArrayList
- Maintains chronological order of visited sites

### Key Features

- **Session Persistence**: Uses Java serialization to save/restore state
- **Browser Integration**: java.awt.Desktop API launches actual URLs
- **Error Handling**: Graceful handling of invalid URLs and empty states

## Technical Highlights

- No dependency on Java Collections framework
- Custom iterator implementations
- Sentinel node pattern for simplified edge cases
- Circular array with dynamic resizing
- Complete serialization support

## Usage

Run the program and use the menu to:
1. Visit a website
2. Navigate back/forward
3. View browsing history
4. Clear history
5. Restore previous session

## Time Complexity

| Operation | Complexity |
|-----------|-----------|
| Visit Website | O(n) |
| Go Back/Forward | O(1) |
| Show History | O(n) |
| Clear History | O(1) |

## Technologies

- Java
- Custom Data Structures (Linked Lists, Stacks, Queues)
- Java Desktop API
- Object Serialization

## Course Context

Built for CE/CS 3345 - Data Structures and Foundations of Algorithmic Analysis at UT Dallas (Fall 2025)
