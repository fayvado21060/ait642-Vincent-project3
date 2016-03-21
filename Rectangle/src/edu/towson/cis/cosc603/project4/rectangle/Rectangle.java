package edu.towson.cis.cosc603.project4.rectangle;

// TODO: Auto-generated Javadoc
/**
 * The Class Rectangle.
 */
public class Rectangle {
	
	/** The secondPoint. */
	//** Renamed p1 to firstPoint  */
	//** Renamed p2 to secondPoint */
	
	
	private Point firstPoint, secondPoint;
	
	/**
	 * Instantiates a new rectangle.
	 *
	 * @param p1 the firstPoint
	 * @param p2 the secondPoint
	 */
	Rectangle(Point p1, Point p2) {
		this.firstPoint = p1;
		this.secondPoint = p2;
	}
	
	/**
	 * Gets the area.
	 *
	 * @return the area
	 *     
	 */
	
	public Double getArea() {
		return Math.abs((secondPoint.width - firstPoint.width) * (secondPoint.length - firstPoint.length));
	}
	
	/**
	 * Gets the diagonal.
	 *
	 * @return the diagonal
	 */
	public Double getDiagonal() {
		return Math.sqrt(Math.pow((secondPoint.width - firstPoint.width), 2) + Math.pow((secondPoint.length - firstPoint.length), 2));
	}
}
