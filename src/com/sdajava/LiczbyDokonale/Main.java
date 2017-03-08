package com.sdajava.LiczbyDokonale;

import java.util.Scanner;

public class Main {
    public int n;

    public Main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj liczbe ");
        this.n = sc.nextInt();
    }

    public void wylicz(){
        int suma = 0;
        for (int i = 1; i <= Math.floor(this.n/2); i++){
            if (this.n % i == 0){
                suma += i;
            }
        }

        if (this.n == suma){
            System.out.println("liczba doskonala");
        }
        else{
            System.out.println(" liczba nie doskonala");
        }
    }
    public static void main(String[] args) {
	  Main Doskonala = new Main();
        Doskonala.wylicz();
    }
}
