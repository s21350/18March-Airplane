package com.company;

public class Main {

    public static Object Airplane;
    public static Object Engine = new Engine;


    public static void main(String[] args) {
        Airplane = new Airplane("WizzAir", 2000, 2020, 2500);
    }
    }


    class Airplane<enginePower, productYear> {
        String brand;
        int seats;
        int productYear;
        int enginePower;
        package boolean ecological;
         if((enginePower> 20000) &&(productYear>2000)) {
            System.out.println("The engine is ecological");
        }

        public Airplane(String brand, int seats, int productYear, int enginePower) {
            this.brand = brand;
            this.seats = seats;
            this.productYear = productYear;
            this.enginePower = enginePower;
        }

        public String getBrand() {
            return this.brand;
        }

        public int getSeats() {
            return this.seats;
        }

        public int getProductYear() {
            return this.productYear;
        }

        public int getEnginePower() {
            return this.enginePower;
        }
    }

