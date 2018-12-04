import javafx.scene.canvas.GraphicsContext;

public interface Drawable{
    public void draw(GraphicsContext context);
    public void delete(GraphicsContext context);
}
