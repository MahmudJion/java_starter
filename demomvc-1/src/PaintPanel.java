import java.awt.Graphics;
import java.awt.Point;
import javax.swing.JPanel;

/**
 * This is part of the view allowing the mouse to paint a JPanel.
 * This is modified from Fig 14.34.
 * @author Deitel & Associates, Inc.
 * @author Tom Bylander
 */
public class PaintPanel extends JPanel {
    /**
     * The model of this MVC example (it stores the points)
     */
	private DemoModel model;

	/**
	 * Store the model that holds the points to be drawn.
	 * @param model
	 */
	public PaintPanel(DemoModel model) {
		this.model = model;
	} // end PaintPanel constructor

	/**
	 * Draw ovals in a 4-by-4 bounding box at specified locations on
	 * the panel.
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // clears drawing area
		int i = 0;
		Point point = model.getPoint(0);
		while (point != null) {
			g.fillOval(point.x, point.y, 4, 4);
			i++;
			point = model.getPoint(i);
		}
	} // end method paintComponent
} // end class PaintPanel
