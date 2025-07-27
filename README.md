# JavaFX-Random-Matrix
RandomMatrix
RandomMatrix is a JavaFX application (Java 8) that draws a grid (matrix) of lines with 10-pixel spacing.
A random selection of approximately 10% of the cells is filled with black squares, creating a dynamic and randomized visual pattern.
Each button click generates a new unique layout.

Features
Canvas-based drawing: Grid is rendered on a Canvas inside a JavaFX Application.

Randomized cells: Around 10% of cells are filled with black squares using fillRect and GraphicsContext.

Interactive refresh: A button click clears and redraws the matrix with a new random pattern.

Lightweight and simple: Ideal for learning JavaFX basics.

Tech Stack
Language: Java 8

Framework: JavaFX

IDE Recommended: IntelliJ IDEA / Eclipse

How It Works
A Canvas is used to render the matrix.

A Controller class handles the logic for drawing and refreshing.

Randomization is performed using Math.random() for selecting cells to fill.

The grid lines are drawn dynamically based on the canvas size.

Getting Started
Clone the repository:

bash
Copy
Edit
git clone https://github.com/YourUsername/RandomMatrix.git
Import the project into your IDE.

Ensure Java 8 and JavaFX SDK are configured.

Run the Main class.

