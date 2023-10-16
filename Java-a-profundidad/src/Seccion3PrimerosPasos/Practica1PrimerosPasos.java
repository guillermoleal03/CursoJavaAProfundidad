package Seccion3PrimerosPasos;

import javax.swing.*;

public class Practica1PrimerosPasos {
    /*Realizar un programa capaz de calcular el area de un cuadrado, circulo, rectangulo y triangulo*/

    public static void main(String[] args) {
        //Area Cuadrado
        System.out.println("Area Cuadrado: "+areaCuadrado(4));
        //Area Rectangulo
        System.out.println("Area Rectangulo: "+areaRectangulo(5,2));
        //Area Triangulo
        System.out.println("Area Triangulo: "+areaTriangulo(3,2));
    }

    static double areaCuadrado(double lado){
        double area = lado*lado;
        return area;
    }

    static double areaRectangulo(double base,double altura){
        double area = base*altura;
        return area;
    }

    static double areaTriangulo(double base, double altura){
        double area = (areaRectangulo(base,altura)/2);
        return area;
    }

}
