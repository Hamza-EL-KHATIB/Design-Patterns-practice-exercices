package com.hamzakh.factorymethod.shapefactory;

/**
 * CircleCreator class that extends ShapeCreator.
 */
public class CircleCreator extends ShapeCreator {
    /**
     * Method to create a Circle.
     * @return A Circle object.
     */
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
