package com.crumlabs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's calculate some GPA!! \n");
        Scanner s = new Scanner(System.in);

        System.out.println("So, how many courses did you offer this semester?");

        int numCourses = Integer.parseInt(s.nextLine());
        System.out.println("\n");


        Course[] courses = new Course[numCourses];

        int[] unitArr = new int[numCourses];
        int[] pointArr = new int[numCourses];
        for(int i=0; i<numCourses; i++){
            try {
                System.out.println("What's the name of the course? ");
                String name = s.nextLine();
                System.out.println("How many units is the course? ");
                int units = Integer.parseInt(s.nextLine());
                unitArr[i] = units;
                System.out.println("What was your score in the course? ");
                int score = Integer.parseInt(s.nextLine());
                courses[i] = new Course(name, units, score);
                pointArr[i] = courses[i].getPoints(units, courses[i].getGrade(score));
                System.out.println("Number of points for this course " + pointArr[i] + "\n");
            }catch (Exception e){
                System.out.println("There's a problem here");
            }


        }
        int totalPoints = 0;
        int totalUnits = 0;
        for(int i=0; i<numCourses; i++){
            totalPoints += pointArr[i];
            totalUnits += unitArr[i];
        }

        double gpa = totalPoints / totalUnits;
        System.out.println("Your GPA is " + gpa);


    }



}
