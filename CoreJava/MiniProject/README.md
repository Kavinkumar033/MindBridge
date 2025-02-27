## Project Overview

The **Student Management System** is a Java-based console application designed to manage student records efficiently. Users can add, view, search, update, delete, and sort student data. The program uses file storage to persist data.

## Features

- **Add Student**: Allows adding a new student with ID, Name, Age, Grade, and Email.
- **View Students**: Displays all stored student records.
- **Search Student**: Searches for a student using their ID.
- **Update Student**: Modifies the details of an existing student.
- **Delete Student**: Removes a student record from the list.
- **Sort Students**: Sorts student data based on Name, Age, or Grade.
- **File Storage**: Student data is stored in `StudentsDataBase.txt` for persistence.

## Technologies Used

- **Java** - Core programming language
- **Java I/O** - File handling for data storage
- **Java Collections Framework** - List for managing student records
- **Multithreading** - Used for asynchronous file storage
- **Streams API** - Used for sorting and filtering student data

## Project Structure

The project follows a simple directory structure. The main Java files are stored in the `MiniProject` package. The primary files include:

- `StudentManagementSystem.java` - Contains the main method to run the program.
- `StudentsList.java` - Manages student records.
- `StudentsDataBase.txt` - Used to store student data persistently.

## How to Run

To run the project, ensure you have Java installed and use a terminal or an IDE:

1. **Using an IDE**:
   - Open the project.
   - Compile and run `StudentManagementSystem.java`.

2. **Using the command line**:
   - Navigate to the project folder.
   - Compile all Java files:
     ```sh
     javac MiniProject/*.java
     ```
   - Execute the program:
     ```sh
     java MiniProject.StudentManagementSystem

## File Format

The student data is stored in a `.txt` file format. Each student record is written in a structured manner, ensuring that data can be easily read and modified when necessary. The format follows a standardized structure for consistency and ease of access.

Each record is stored in the following format:
```
ID, Name, Age, Grade, Email
```
For example:
```
101, John Doe, 20, A, johndoe@example.com
102, Jane Smith, 22, B, janesmith@example.com
```

The records are stored line by line in the `StudentsDataBase.txt` file, with each student's details separated by commas. This format allows for easy parsing and retrieval of student information when needed. Additionally, file handling operations ensure that new student records are appended to the file, existing records can be updated, and deleted records are removed effectively.




