package edu.towson.cis.cosc603.project4.rectangle;

/**
 * The Point Class.
 */
public class Point {
	
	/** width and length coordinates. */
	public Double width, length;
	
	/**
	 * Instantiates a new point.
	 * 
	 * Correction made: Changed 
	 *	this.x = y; to
	 *  this.x = x;
	 *   
	 *  renamed "x" to width 
	 *  renamed "y" to length 
	 *
	 * @param width the width
	 * @param length the length
	 */
	Point(Double x, Double y) {
		this.width = x;
		this.length = y;
	}
}
