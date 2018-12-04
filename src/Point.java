import javafx.scene.canvas.GraphicsContext;

import java.awt.geom.Point2D;

public class Point implements Draw<Point>{
    Point2D point;
    int nb_point = 0;

    public Point(Point2D point){
        this.point = point;
        nb_point++;
    }

    @Override
    public void draw(GraphicsContext context) {
        context.fillOval();
    }

    @Override
    public void delete(GraphicsContext context) {

    }
}
