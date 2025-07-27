# JavaFX-Random-Matrix

**RandomMatrix** is a JavaFX application (Java 8) that draws a grid (matrix) of lines with 10-pixel spacing.  
Approximately 10% of the cells are filled with black squares, creating a dynamic and randomized visual pattern.  
Each button click generates a new unique layout.

---

## **Features**
- **Canvas-based drawing:** Grid is rendered on a `Canvas` inside a JavaFX `Application`.
- **Randomized cells:** ~10% of cells are filled using `fillRect` and `GraphicsContext`.
- **Interactive refresh:** A button click clears and redraws the matrix with a new random pattern.
- **Lightweight & simple:** Ideal for learning JavaFX basics.

---

## **Tech Stack**
- **Language:** Java 8  
- **Framework:** JavaFX  
- **IDE Recommended:** IntelliJ IDEA / Eclipse  

---

## **How It Works**
1. A `Canvas` is used to render the grid.
2. A `Controller` class manages drawing and refreshing logic.
3. Randomization is handled using `Math.random()` to choose cells to fill.
4. Grid lines are drawn dynamically based on the canvas size.

---

## **Getting Started**
Clone the repository:
```bash
git clone https://github.com/YourUsername/RandomMatrix.git


