package uz.pdp.parking;

import java.util.Scanner;

import static uz.pdp.parking.ParkingBuilder.ParkOut;

public class TelegramBotUI {
    static Scanner scanner = new Scanner(System.in);
    static Scanner numscanner = new Scanner(System.in);

    public static void main(String[] args) {
            Parking parking = ParkingBuilder.build("Abu Saxiy", 5, 6);
        while (true) {
//            System.out.println(parking);


            showMenu();
            switch (scanner.nextLine()) {
                case "1" -> showParking(parking);
                case "2" -> amountOfAviableSpaces(parking);
                case "3" -> amountOfUnAviableSpaces(parking);
                case "4" -> ParkIn(parking);
                case "5"-> ParkOut(parking);
                case "0" -> {
                    System.out.println("thank you for using our programm!!!");
                    return;
                }


            }
        }
    }


    static Parking ParkOut(Parking parking){
        Car car = new Car();
        System.out.println("enter the the row ");
        int row = numscanner.nextInt()-1;
        System.out.println("enter the the column ");
        int column = numscanner.nextInt()-1;
        ParkingBuilder.ParkOut(parking, row, column);

        return parking;

    }
    static Parking ParkIn(Parking parking) {


        Car car = new Car();
        System.out.println("enter the the row ");
        int row = numscanner.nextInt()-1;
        System.out.println("enter the the column ");
        int column = numscanner.nextInt()-1;

        if((parking.getRows()[row].getSpots()[column].getCar())==null) {

            System.out.println("enter color");
            car.setColor(scanner.nextLine());
            System.out.println("enter Number");
            car.setNumber(scanner.nextLine());
            System.out.println("enter Model");
            car.setModel(scanner.nextLine());
            System.out.println("enter Type \n" +
                    """ 
                            1-> SEDAN="🚗";
                            2-> POLIS_CAR="🚓";
                            3-> AMBULANCE="🚑";
                            4-> BUS="🚌";
                            5-> TAXI="🚕";            
                            """);
            switch (scanner.nextInt()) {
                case 1:
                    car.setType(CarType.SEDAN);
                    break;
                case 2:
                    car.setType(CarType.POLIS_CAR);
                    break;
                case 3:
                    car.setType(CarType.AMBULANCE);
                    break;
                case 4:
                    car.setType(CarType.BUS);
                    break;
                case 5:
                    car.setType(CarType.TAXI);
                    break;
                default:
                    System.out.println("this type of car is not available");
            }


            ParkingBuilder.ParkIn(parking, row, column, car);
        }else{
            //System.out.println("this space is busy by"+car.toString());
            System.out.println("this space is busy by"+parking.getRows()[row].getSpots()[column].getCar().toString());
        }

        return parking;
    }

    private static void amountOfUnAviableSpaces(Parking parking) {
        Spot[] spots;
        Car car;
        Row row = new Row();
        int countCar = 0;
        Row[] rows = parking.getRows();
        for (int i = 0; i < rows.length; i++) {
            spots = rows[i].getSpots();
            for (int j = 0; j < spots.length; j++) {
                car = spots[j].getCar();
                if (!(car == null)) {
                    countCar++;
                }
            }
            System.out.println(i + 1 + " on row->  busy  space : " + countCar);
            countCar = 0;
            System.out.println();
        }

    }

    private static void amountOfAviableSpaces(Parking parking) {
        Spot[] spots;
        Car car;
        Row row = new Row();
        int countCar = 0;
        Row[] rows = parking.getRows();
        for (int i = 0; i < rows.length; i++) {
            spots = rows[i].getSpots();
            for (int j = 0; j < spots.length; j++) {
                car = spots[j].getCar();
                if ((car == null)) {
                    countCar++;
                }
            }
            System.out.println(i + 1 + " on row->  available open spaces : " + countCar);
            countCar = 0;
            System.out.println();
        }

    }

    private static void showParking(Parking parking) {
        Spot[] spots;
        Car car;
        Row[] rows = parking.getRows();
        for (int i = 0; i < rows.length; i++) {
            spots = rows[i].getSpots();
            for (int j = 0; j < spots.length; j++) {
                car = spots[j].getCar();
                if (car == null) {
                    System.out.print("✅");
                } else {
                    System.out.print(car.getType());
                }
            }
            System.out.println();
        }
    }

    private static void showMenu() {
        System.out.println("""
                1=>Show Parking;
                2=>Show amount of available spaces;
                3=>Show amount of unavailable spaces;
                4=>Park In;
                5=>Park Out;
                0=>Exit;
                """);
    }
}
