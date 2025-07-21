import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.Random;

public class Maman11Q2Controller {

    @FXML
    private Canvas canv;
    private GraphicsContext gc;

    @FXML
    public void initialize() {
        gc = canv.getGraphicsContext2D();
    }


    @FXML
    void drawMatrixPress(ActionEvent event) {
        gc.clearRect(0, 0, canv.getWidth(), canv.getHeight());
        Random r = new Random();
        final int CELL_SIZE = 10;
        final int SIZE = (int)canv.getWidth() / CELL_SIZE;
        gc.setStroke(Color.BLACK);

        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
            {
                gc.strokeRect(i*CELL_SIZE, j*CELL_SIZE, CELL_SIZE, CELL_SIZE);
            }
        }

       int nomOfBlackCells = (int)(SIZE*SIZE*0.1);
        for(int k = 0; k < nomOfBlackCells; k++)
        {
            int i = r.nextInt(SIZE);
            int j  = r.nextInt(SIZE);
            gc.setFill(Color.BLACK);
            gc.fillRect(i*CELL_SIZE, j*CELL_SIZE, CELL_SIZE, CELL_SIZE);
        }
    }

}

