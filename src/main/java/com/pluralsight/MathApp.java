package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // 1. Find the highest salary
        double bobSalary = 50000.00;
        double garySalary = 65000.00;
        double highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is $" + highestSalary);

        // 2. Find the smallest price
        double carPrice = 25000.00;
        double truckPrice = 35000.00;
        double lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest vehicle price is $" + lowestPrice);

        // 3. Find the area of a circle with radius 7.25
        double radius = 7.25;
        double circleArea = Math.PI * Math.pow(radius, 2);

        System.out.println("The area of the circle is " + circleArea);

        // 4. Find the square root of 5.0
        double number = 5.0;
        double squareRoot = Math.sqrt(number);

        System.out.println("The square root of " + number + " is " + squareRoot);

        // 5. Find the distance between two points
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2 = 50;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)
        );

        System.out.println("The distance between the points is " + distance);

        // 6. Find the absolute value of -3.8
        double negativeNumber = -3.8;
        double absoluteValue = Math.abs(negativeNumber);

        System.out.println("The absolute value is " + absoluteValue);

        // 7. Generate a random number between 0.0 and 1.0
        double randomNumber = Math.random();

        System.out.println("A random number is " + randomNumber);

        // 8. Calculate minutes and milliseconds in 24 days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int secondsPerMinute = 60;
        int millisecondsPerSecond = 1000;

        int totalHours = days * hoursPerDay;
        int totalMinutes = totalHours * minutesPerHour;
        int totalSeconds = totalMinutes * secondsPerMinute;
        long totalMilliseconds = (long) totalSeconds * millisecondsPerSecond;

        System.out.println("There are " + totalMinutes + " minutes in " + days + " days.");
        System.out.println("There are " + totalMilliseconds + " milliseconds in " + days + " days.");
    }
}
