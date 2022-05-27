package com.company;

import Classes.*;
import java.io.IOException;

public class Main {

    /**
     * 3. Создать класс окружность, член класса – R. Предусмотреть в классе методы вычисления и
     * вывода сведений о фигуре – площади, длины окружности. Создать производный класс – круглый
     * прямой цилиндр с высотой h, добавить в класс метод определения объема фигуры, перегрузить методы
     * расчета площади и вывода сведений о фигуре. Написать программу, демонстрирующую работу с
     * классом: дано N окружностей и M цилиндров, найти окружность максимальной площади и средний объем
     * цилиндров.
     */

    public Main() throws IOException, ClassNotFoundException {
    }


    public static void main(String[] args )  throws IOException, ClassNotFoundException  {
        final int N = 5;
        final int M = 5;
        Circles circles = new Circles(N);
        Cilinders cilinders = new Cilinders(M);
        for (int i = 0; i < N; i++) {
            circles.add(new Circle((int) (Math.random() * 49 + 1)));
        }
        for (int i = 0; i < M; i++) {
            cilinders.add(new Cilinder((int) (Math.random() * 49 + 1), (int) (Math.random() * 49 + 1)));
        }
        System.out.println(circles);
        System.out.println("Max Circle S: " + circles.getLargestS());
        System.out.println("-----------------------");
        System.out.println(cilinders);
        System.out.println("AvgV = " + cilinders.getAvgV());

        System.out.println("\n-------------------\n");

        List_of_Circles listOfCircles = new List_of_Circles();
        List_of_Cilinders listOfCylinders  = new List_of_Cilinders();



        List_of_Circles listOfCirclesJSON = new List_of_Circles();
        List_of_Cilinders listOfCylindersJSON  = new List_of_Cilinders();

        try {

            listOfCircles=Java_Native.loadCircle();
            listOfCylinders=Java_Native.loadCilinder();

            listOfCirclesJSON=Java_JSON.desCirceleJSON();
            listOfCylindersJSON=Java_JSON.desCilinderJSON();



        }catch(Exception e){

            for (int i = 0; i < N; i++) {
                listOfCircles.add(new Circle((int) (Math.random() * 49 + 1)));
                listOfCirclesJSON.add(new Circle((int) (Math.random() * 49 + 1)));
            }
            for (int i = 0; i < M; i++) {
                listOfCylinders.add(new Cilinder((int) (Math.random() * 49 + 1), (int) (Math.random() * 49 + 1)));
                listOfCylindersJSON.add(new Cilinder((int) (Math.random() * 49 + 1), (int) (Math.random() * 49 + 1)));

            }
            System.out.println(listOfCircles);
            System.out.println("Max Circle S: " + listOfCircles.getLargestS_Of_CirclesList());
            System.out.println("-----------------------");
            System.out.println(listOfCylinders);
            System.out.println("AvgV = " +listOfCylinders.getAvgV_of_CylindersList());

            System.out.println("-----------------------");

            System.out.println(listOfCirclesJSON);
            System.out.println("Max Circle S: " + listOfCirclesJSON.getLargestS_Of_CirclesList());
            System.out.println("-----------------------");
            System.out.println(listOfCylindersJSON);
            System.out.println("AvgV = " +listOfCylindersJSON.getAvgV_of_CylindersList());

        }




        Java_Native.saveCircle(listOfCircles);
        Java_Native.saveCilinder(listOfCylinders);

        Java_JSON.serCircleJson(listOfCirclesJSON);
        Java_JSON.serCilinderJSON(listOfCylindersJSON);

    }
}
