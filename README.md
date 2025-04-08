# 🚀 Data Structures & Algorithms in Java 📊

![GitHub stars](https://img.shields.io/github/stars/tran203/DSA?style=social)
![GitHub forks](https://img.shields.io/github/forks/tran203/DSA?style=social)
![GitHub issues](https://img.shields.io/github/issues/tran203/DSA)
![GitHub license](https://img.shields.io/github/license/tran203/DSA)

## 🧩 Introduction

Welcome to my Data Structures and Algorithms journey in Java! This repository documents my learning process following **[Kunal Kushwaha](https://www.youtube.com/KunalKushwaha)**'s excellent DSA curriculum. Here you'll find implementations, notes, and solutions to various DSA problems as I work through them.

> 💡 *"The difference between a good programmer and a great one is the understanding of algorithms and data structures."*

## 📚 What's Inside

- 📂 **Data Structures** - Implementation of fundamental data structures
- 🧮 **Algorithms** - Various algorithm implementations and analyses
- 🧠 **Problem Solving** - Solutions to coding challenges and interview questions
- 📝 **Notes** - Key learnings and concepts explained in my own words
- 🔍 **Time & Space Complexity** - Analysis for all implementations

## 🎯 Topics Covered

### 1️⃣ Basics & Mathematics
- [ ] Basic Java syntax
- [ ] Time & Space Complexity
- [ ] Mathematics for DSA

### 2️⃣ Data Structures
- [ ] Arrays & ArrayLists
- [ ] Strings
- [ ] Linked Lists
- [ ] Stacks & Queues
- [ ] Trees & Binary Trees
- [ ] Heaps
- [ ] Hash Tables
- [ ] Graphs

### 3️⃣ Algorithms
- [ ] Searching
- [ ] Sorting
- [ ] Recursion
- [ ] Bit Manipulation
- [ ] Two Pointers
- [ ] Sliding Window
- [ ] Dynamic Programming
- [ ] Greedy Algorithms
- [ ] Backtracking

## 🚀 Learning Path

This repository follows **Kunal Kushwaha**'s DSA course structure, starting with basic concepts and progressively advancing to more complex topics. Each section builds upon previous knowledge to ensure a solid foundation.

> 👨‍🏫 Huge thanks to [Kunal Kushwaha](https://www.youtube.com/c/KunalKushwaha) for his amazing free DSA course! His teaching style has made complex concepts accessible and enjoyable.

## 🏆 Practice Platform Solutions

This repository includes my solutions to problems from:

### 💻 LeetCode   🧩 HackerRank 


> 🔄 I regularly practice on these platforms to reinforce theoretical concepts with practical problem-solving!

## 💻 Code Examples

Here's a quick preview of what you'll find:

```java
// Binary Search implementation
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        return -1;
    }
}
```

## 📈 Progress Tracker

<!--
| Topic | Status | Confidence Level |
|-------|--------|------------------|
| Arrays | ⏳ In Progress | ⭐⭐⭐ |
| Binary Search | 🔄 Revisiting | ⭐⭐⭐⭐ |
| Recursion | 📝 Notes Done | ⭐⭐ |
| Sorting | 🎯 Started | ⭐⭐ |
| Linked Lists | 🔜 Coming Soon | - |
| LeetCode Easy Problems | ⏳ In Progress | ⭐⭐⭐ |
| HackerRank Algorithm Section | 🔄 Working Through | ⭐⭐ | -->

| Topic | Status | Confidence Level |
|-------|--------|------------------|
| Arrays | ⏳ In Progress | ⭐ |
| Searching | 🔜 Coming Soon | - |
| &nbsp;&nbsp;&nbsp;&nbsp;└── Linear Search | - | - |
| &nbsp;&nbsp;&nbsp;&nbsp;└── Binary Search | - | - |


## 📚 Resources

- [Kunal Kushwaha's DSA Playlist](https://www.youtube.com/playlist?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ) 👨‍🏫
- [Kunal's GitHub](https://github.com/kunal-kushwaha) 💻
- [Community Classroom](https://www.communityclassroom.io/) 🏫
- [LeetCode](https://leetcode.com/) 🧩
- [HackerRank](https://www.hackerrank.com/) 🏆
- [GeeksforGeeks](https://www.geeksforgeeks.org/) 📖

## 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
