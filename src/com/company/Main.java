package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();


        while (true){
             try{
            System.out.println("Введите ваша имия");
            String  name  = scanner.nextLine();
            System.out.println( " Введите возраст");
            int age = scanner.nextInt();
            scanner.nextInt();

            user.setAge(age);
            user.setName(name);


             } catch (IllegalNameLengthException e) {
                e.printStackTrace();
            }
            catch (IllegalAgeException e){

                 e.printStackTrace();
            }
        }
    }
}
