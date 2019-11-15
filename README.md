# LinkedList Data Structure

#### Introduction
A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations. 
The elements in a linked list are linked using pointers.
In simple words, a linked list consists of nodes where each node contains a data field and a reference(link) to the next node in the list
- A linked list is represented by a pointer to the first node of the linked list. The first node is called the head
- If the linked list is empty, then the value of the head is NULL

#### Advantages of Linked List over Arrays
- Dynamic Size
- Ease of insertion/deletion

#### Drawbacks
- Random access is not allowed. We have to access elements sequentially starting from the first node
- Extra memory space for a pointer is required with each element of the list
- Not cache friendly. Since array elements are contiguous locations, there is locality of reference which is not there in case of linked lists.

#### Best use-case
- Excessive read, as time complexity of read is always O(1)
- Random access to element using index

#### Time Complexity for Array (average and worst-case)
- Access: O(n)
- Search: O(n)
- Insertion: O(1)
- Deletion: O(1)

#### Time Complexity for `Linked List` java class (worst-case)
- add(): O(1)
- get(): O(n)
- remove(): O(1)
- contains(): O(n)

#### Methods in `java.util.LinkedList` Class
| Methods | Description | Returns | Notes | 
| ------- | :----------- | ------- | ---- |
| add(index i, Element e) | This method Inserts the specified element at the specified position in this list | void |
| add(Element e) | This method appends the specified element to the end of this list | boolean | This method returns True after execution
| addAll​(int index, Collection c) | This method Inserts all of the elements in the specified collection into this list, starting at the specified position | boolean |
| addFirst​(E e) | This method Inserts the specified element at the beginning of this list | void | 
| addLast​(E e) | This method Appends the specified element to the end of this list | void | 
| contains​(Object o) | This method returns true if this list contains the specified element | boolean |
| fill | Assigns the specified value to each element of the specified range of the specified array | void | 
| sort | Sorts the specified array into ascending numerical order | void 

- Other methods includes `clear`, `clone`, `get(index i)`, `indexOf(Object o)`, `toArray()`  

#### Common syntaxs
- Initializing LinkedList in java
```java
LinkedList<String> object = new LinkedList<String>();
```

### Examples
- [`Remove Duplicates from Sorted Array:`](https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/) [Solution](./src/practice/examples/RemoveDuplicates.java) (Easy)