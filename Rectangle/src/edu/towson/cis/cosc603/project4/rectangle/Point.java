package edu.towson.cis.cosc603.project4.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** xAxis and yAxis coordinates. */
	public Double xAxis, yAxis;
	
	/**
	 * Instantiates a new point.
	 * 
	 * Correction made: Changed 
	 *	this.x = y; to
	 *  this.x = x;
	 *   
	 *  renamed "x" to xAxis 
	 *  renamed "y" to yAxis 
	 *
	 * @param xAxis the x Axis
	 * @param yAxis the y Axis
	 */
	Point(Double x, Double y) {
		this.xAxis = x;
		this.yAxis = y;
	}
}
