package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setHeadLights(14);
        car1.setSpeed(209);
        car1.setBrand("Lexus");


        System.out.println("Количество фар спереди и сзади: " + car1.getHeadLights() + " Скорость: " + car1.getSpeed() + "км/ч" +
                " Марка машины: " + car1.getBrand());

        Car car2 = new Car(4,  310,"BMW");

        System.out.println("Количество фар спереди и сзади: " + car2.getHeadLights() + " Скорость: " + car2.getSpeed() + "км/ч" +
                " Марка машины: " + car2.getBrand());


        Car car3 = new Car(220.4, "Mazda", 8);

        System.out.println("Количество фар спереди и сзади: " + car3.getHeadLights() + " Скорость: " + car3.getSpeed() + "км/ч" +
                " Марка машины: " + car3.getBrand());



        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя");

        String name = sc.nextLine();
        System.out.println("Привет " + name + "!" + "Как дела?");


    }
}
