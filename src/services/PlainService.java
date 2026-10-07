package services;

import models.Plain;

import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PlainService {
    public static Plain[] convert(String[] lines) {
        Plain[] Plain = new Plain[lines.length];

        for (int i = 0; i < lines.length; i++) {

            Plain student = new Plain(lines[i]);
            Plain[i] = student;
        }
        return Plain;
    }

    public static void Task1(Plain plane) throws Exception {
        FileService.writeFile("task1.txt", plane.toString());
    }

    public static void Task2(Plain plane) throws Exception {
        if (plane.isMilitary()) {
            FileService.writeFile("task2.txt", "Coast: " + plane.getCoast() + " TopSpeed: " + plane.getTopSpeed());


        } else {
            FileService.writeFile("task2.txt", "name: " + plane.getName() + " country:" + plane.getCountry());


        }
    }

    public static Plain Task3(Plain plane1, Plain plane2) throws Exception {
        if (plane1.getYear() > plane2.getYear() || plane1.getYear() == plane2.getYear()) {
            return plane1;

        } else {
            return plane2;
        }

    }

    public static String Task4(Plain plane1, Plain plane2) throws Exception {
        if (plane1.getWingspan() < plane2.getWingspan() || plane1.getWingspan() == plane2.getWingspan()) {
            return plane2.getName();

        } else {
            return plane1.getName();
        }

    }

    public static String Task5(Plain plane1, Plain plane2, Plain plane3) {

        if (plane1.getSeats() < plane2.getSeats() && plane1.getSeats() < plane3.getSeats()) {
            return plane1.getCountry();

        } else if (plane2.getSeats() < plane3.getSeats() && plane2.getSeats() < plane1.getSeats()) {
            return plane2.getCountry();
        } else if (plane3.getSeats() < plane1.getSeats() && plane3.getSeats() < plane2.getSeats()) {
            return plane3.getCountry();
        } else {
            return plane1.getCountry();
        }
    }

    public static void Task6(Plain[] planes) throws Exception {
        Plain[] p = new Plain[planes.length];

        for (Plain x : planes) {
            if (!x.isMilitary()) {
                FileService.writeFile("task6.txt", x.toString());
            }


        }


    }

    public static void Task7(Plain[] planes) throws Exception {
        Plain[] p = new Plain[planes.length];

        for (Plain plane : planes) {
            if (plane.isMilitary() && plane.getHoursInAir() > 100) {
                FileService.writeFile("task7.txt", plane.toString());
            }

        }

    }

    public static Plain Task8(Plain[] planes) {


        for (int i = 0; i < planes.length - 1; i++) {
            for (int j = 1; j < planes.length; j++) {
                if (planes[i].getWeight() > planes[j].getWeight()) {
                    Plain temp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = temp;
                }


            }

        }
        return planes[0];
    }

    public static Plain Task9(Plain[] planes) throws Exception {
        Plain temp = null;

        for (Plain plane : planes) {
            if (plane.isMilitary()) {
                if (temp == null || plane.getCoast() < temp.getCoast()) {
                    temp = plane;
                }
            }
        }

        return temp;
    }

    public static void Task10(Plain[] planes) throws Exception {
        for (int i = 0; i < planes.length; i++) {
            for (int j = 0; j < planes.length; j++) {
                if(planes[i].getYear() < planes[j].getYear()){
                    Plain temp = planes[i];
                    planes[i] = planes[j];
                    planes[j] = temp;


                }
            }
        }
        for(Plain p : planes){
            FileService.writeFile("Task10"+".txt", p.toString());
        }

    }


    }





