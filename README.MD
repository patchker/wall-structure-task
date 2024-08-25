# wall-structure-task

## Project Description

The wall project is an implementation of a structure representing a wall composed of blocks. This structure allows for the creation of both simple blocks and composite blocks (containing other blocks). The project enables searching for blocks by color, material, and counting all blocks in the structure.

## Features

- Search for a block by color
- Search for all blocks of a given material
- Count all blocks in the structure
- Support for simple and composite blocks

## Project Structure

The project consists of the following main components:

### model:
1. `Structure` interface: Defines the main methods for interacting with the structure.
2. `Block` interface: Represents a single block.
3. `CompositeBlock` interface: Extends `Block`, representing a block composed of other blocks.

### impl:
4. `Wall` class: Implements `Structure`, representing the entire wall.
5. `CompositeBlockClass` class: Implements `CompositeBlock`.
6. `SimpleBlock` class: Implements `Block`, representing a simple block.

`Main` class: Contains an example of structure usage.

## Technologies and Tools Used

- Java: Oracle OpenJDK 22.0.2
- IDE: IntelliJ IDEA 2024.1.4

## How to Run the Project

1. Clone the repository to your local machine.
2. Open the project in your IDE.
3. Compile the project.
4. Run the `Main` class to see an example usage of the structure.

## Sample output:
```
Total blocks: 6
Searching for blue block...
Blue block found: true
Found block color: blue and material: brick
Brick blocks: 1
```