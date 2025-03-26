# 🛠️ Design Patterns Practice

This repository demonstrates the use of fundamental **design patterns** to build extensible and reusable software. Each exercise focuses on applying a specific pattern to solve real-world problems using Java. The project is developed in **IntelliJ IDEA** with **Jbr17**.

---

## 📚 Description

In this practice, we learn to identify and implement programs using design patterns. Patterns are essential for building extensible and reusable software. Java, along with most software frameworks, is designed around the most important software patterns.

---

## 🚀 Objectives

- Learn to identify and apply software design patterns.
- Develop a solid understanding of reusable and extensible software construction.
- Implement solutions using **Singleton** and **Abstract Factory** patterns.

---

## 📝 Levels of Practice

### Level 1 - **Singleton Pattern**  
🔑 **Goal**: Create a class that replicates the behavior of the `Undo` command.

**Specifications**:
- The `Undo` class should store the last introduced commands.
- It should allow:
  - Adding orders.
  - Removing orders.
  - Listing the last introduced orders (similar to the `history` command in Linux).
- **Singleton Pattern** must be used for the `Undo` class.
- A `Main` class will interact with the `Undo` class, allowing input via the console.

### Level 2 - **Abstract Factory Pattern**  
🌍 **Goal**: Build an international address and phone number manager.

**Specifications**:
- The application should support adding international addresses and phone numbers to an address book.
- Due to the different formats used by countries:
  - Implement the **Abstract Factory** pattern to manage country-specific formats.
  - Each country will have its own factory for creating addresses and phone numbers.
- A `Main` class will demonstrate the usage of the address book.

---

## ⚙️ Technologies Used

- **Language**: Java
- **IDE**: IntelliJ IDEA
- **Runtime**: Jbr17

---

## 📂 Project Structure
```plaintext
src
└── com
    ├── level1
    │   └── singleton
    │       ├── Main.java                  # Demonstrates the Singleton pattern
    │       ├── controller
    │       │   └── StartMain.java         # Handles Singleton initialization logic
    │       ├── entities
    │       │   └── Undo.java              # Singleton implementation
    │       └── model
    │           └── LogicSwitch.java       # User input and logic management
    │
    └── level2
        └── abstractFactory
            ├── Main.java                  # Demonstrates the Abstract Factory pattern
            ├── controller
            │   └── StartMain.java         # Handles Abstract Factory initialization logic
            ├── entities                   # Contact management classes
            │   ├── AddressBook.java       # Manages the contact list
            │   ├── Contact.java           # Represents a contact
            │   ├── SpainAddress.java      # Address implementation for Spain
            │   ├── SpainFactory.java      # Factory for Spain-specific objects
            │   ├── SpainPhoneNumber.java  # Phone number implementation for Spain
            │   ├── UKAddress.java         # Address implementation for the UK
            │   ├── UKFactory.java         # Factory for UK-specific objects
            │   ├── UKPhoneNumber.java     # Phone number implementation for the UK
            │   ├── USAddress.java         # Address implementation for the USA
            │   ├── USFactory.java         # Factory for USA-specific objects
            │   └── USPhoneNumber.java     # Phone number implementation for the USA
            └── interfaces                 # Abstract Factory interfaces
                ├── Address.java           # Address contract
                ├── AddressBookFactory.java # Factory contract
                └── PhoneNumber.java       # Phone number contract

```
---

## ▶️ How to Run

1. Clone this repository:
   ```bash
   git clone git@github.com:acocinas/S301Patterns1.git
   cd git@github.com:acocinas/S301Patterns1.git
2. Open the project in your preferred IDE (IntelliJ IDEA recommended).

3. Run the Main classes in each level to see the patterns in action:

Level 1: Run com.level1.singleton.Main.

Level 2: Run com.level2.abstractFactory.Main.

💡 Key Learnings
The Singleton pattern ensures a single instance for managing global application state (e.g., Undo functionality).

The Abstract Factory pattern is ideal for creating families of related objects (e.g., international addresses and phone numbers) without specifying their concrete classes.

🔗 References
Design Patterns: Elements of Reusable Object-Oriented Software

Singleton Pattern

Abstract Factory Pattern

Happy Coding 🚀

