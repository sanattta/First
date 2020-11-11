package com.sanattta.lesson9.task3.figures.implementations;

import com.sanattta.lesson9.task3.figures.OneParameterFigure;

public class Square extends OneParameterFigure {

    @Override
    public double getArea() {
        return parameter1 * parameter1;
    }

    @Override
    public double getLength() {
        return 4 * parameter1;
    }
}
