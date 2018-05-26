package com.company;

public class Conversor {

    public static void main(String[] args) {

        }

    public static int temp(int x){
        int result = x + 273; // Kelvin para Celsius
        return result;
    }

    public static double veloc(double x){
        double result = x * 1.852; // Milhas por hora para Quilometros por hora
        return result;
    }

    public static double dist(double x){
        double result = x / 1000; // Metros para Quilometros
        return result;
    }

    public static double tempo(double x){
        double result = x / 60; // Minutos para Horas
        return result;
    }

}

