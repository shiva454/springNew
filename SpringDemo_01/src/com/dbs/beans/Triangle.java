package com.dbs.beans;

public class Triangle {
	Point pointA;
	Point pointB;
	Point pointC;
	public Point getPointA() {
		
		return pointA;
	}
	public void setPoint(Point pointA) {
		System.out.println("Setting point A");
		this.pointA=pointA;
		
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		System.out.println("Setting point B");
		this.pointB= pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		System.out.println("Setting point C");
		this.pointC= pointC;
	}
	@Override
	public String toString() {
		return "Traingle [pointA=" +pointA+",pointB="+pointB+",pointC="+pointC+"]";
		
	}
	public Triangle(Point pointA,Point pointB,Point pointC)
	{
		super();
		System.out.println("Constructor with parameters");
		this.pointA=pointA;
		this.pointB=pointB;
		this.pointC=pointC;
		
	}
	public Triangle() {

		super();
		System.out.println("Constructor without parameters");
	}

}
