🔄 Undo–Redo Command Processor (Java)
A simple console-based Java project that demonstrates how Undo and Redo functionality works internally using Stack and Deque data structures.

This project is inspired by real-world applications like VS Code, Notepad, and Text Editors, where users can undo and redo actions.

📌 Features
Execute custom commands
Undo the most recent command
Redo the last undone command
View undo and redo history
Input validation for better user experience
Beginner-friendly and interview-ready logic
🧠 Core Concept
The project uses two stacks:

Undo Stack → Stores executed commands
Redo Stack → Stores undone commands
Undo–Redo Rule:
New command → goes to Undo Stack and clears Redo Stack
Undo → move command from Undo → Redo
Redo → move command from Redo → Undo
This follows the LIFO (Last In, First Out) principle.

🛠️ Technologies Used
Java (Core Java)
Data Structures:
Stack
Deque (ArrayDeque)
Scanner for user input
📂 Project Structure

UndoRedoCommandProcessor.java

▶️ How to Run the Project
1️⃣ Clone the Repository
git clone [https://github.com/DHAKSHANAMOORTHY26/Java_Project/blob/main/UndoRedoCommandProcessor.git]
2️⃣ Compile the Program
javac UndoRedoCommandProcessor.java
3️⃣ Run the Program
java UndoRedoCommandProcessor
📋 Sample Menu Output
=== Undo-Redo Command Processor ===
1. Execute Command
2. Undo
3. Redo
4. View History
5. Exit
Enter choice:
🧪 Example Usage
Execute command: open file
Execute command: edit text
Undo → removes edit text
Redo → restores edit text
📊 Time and Space Complexity
Operation	Time Complexity
Execute Command	O(1)
Undo	O(1)
Redo	O(1)
View History	O(n)
Space Complexity: O(n) (based on number of commands)

🎯 Learning Outcomes
Understanding Stack (LIFO) data structure
Practical implementation of Undo–Redo logic
Handling user input safely
Writing clean and modular Java code
Real-world application of data structures
🎤 How to Explain This Project in an Interview
“This project demonstrates how undo and redo functionality works using Java. I used two stacks — one for undo and one for redo. Whenever a new command is executed, it goes into the undo stack and clears the redo stack. Undo moves the command from undo to redo, and redo moves it back. This logic is similar to how editors like VS Code handle undo–redo internally.”

🚀 Possible Enhancements
Implement Command Pattern
Limit undo history size
Persist history to a file
Replace Stack with Deque for optimization
Build a GUI version using JavaFX or Swing
👨‍💻 Author
Fresher Java Developer
Learning Data Structures and Core Java
This project is part of DSA & Java practice
📜 License
This project is open-source and free to use for learning and educational purposes.
