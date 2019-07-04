# What is Comparator i Comparable. And what is the difference?

> ##### Comparable and Comparator are both interfaces that can be used to sort any of Collection's classes instances. The difference is:

- **Comparable** provides a single sorting sequence. In other words, we can sort the collection on the basis of a single element such as id, name, and price.
- **Comparable** affects the original class, i.e., the actual class is modified.
- **Comparable** provides compareTo() method to sort elements.
>
- **Comparator** provides multiple sorting sequences. So, we can sort the collection on the basis of multiple elements.
- **Comparator** doesn't affect the original class, i.e., the actual class is not modified.
- **Comparator** provides compare() method to sort elements.

# Why PriorityQueue MAX capacity is MAX_INTEGER- 8? And why is initial capacity = 11?
##### 1) The shape and structure of an array object, such as an array of int values, is similar to that of a standard Java object. The primary difference is that the array object has an additional piece of metadata that denotes the array's size. This metadata itself needs 4 byte of allocated memeory on 32 bit architectures, 8 byte on 64 bit architectures. Max size of an array defined as Integera maximum value. We substract 8 bytes out of it to reserve the memory for metadata header.
***
##### 2) Initial capacity seems to be simply the initial capacity of the ArrayList + 1. Since PriorityQueue is based on self balancing binary tree, which scheme and working principle you can find on the screenhot below, it works with the arrayList as an argument. Tree growth starts from the root with index "1" and should have 10 children by default. So initial capacity is defined as (10 + 1) = 11.:
![N|Solid](https://he-s3.s3.amazonaws.com/media/uploads/2270b0f.jpg)