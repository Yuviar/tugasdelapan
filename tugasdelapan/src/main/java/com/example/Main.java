package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        try {
            boolean ulang = false;
            int totalHarga = 0;
            char pesanLagi;
            int pesanan;
            do {
                System.out.println("====== Menu ====== \t\t ====== Minuman ======");
                System.out.println("[1] bakso Rp.15,000 \t\t [5] es teh Rp.5,000");
                System.out.println("[2] soto Rp.20,000 \t\t [6] es jeruk Rp.5,000");
                System.out.println("[3] nasi campur Rp.12,000 \t [7] hangat teh Rp.5,000");
                System.out.println("[4] nasi tahu tek Rp.13,000 \t [8] hangat jeruk Rp.5,000");
                
                System.out.print("Pesanan anda : ");
                pesanan = Integer.parseInt(input.readLine());

                switch (pesanan) {
                    case 1:
                        totalHarga += 15000;
                        break;
                    case 2:
                        totalHarga += 20000;
                        break;
                    case 3:
                        totalHarga += 12000;
                        break;
                    case 4:
                        totalHarga += 13000;
                        break;
                    case 5:
                        totalHarga += 5000;
                        break;
                    case 6:
                        totalHarga += 5000;
                        break;
                    case 7:
                        totalHarga += 5000;
                        break;
                    case 8:
                        totalHarga += 5000;
                        break;
                    default:
                        break;
                }
                System.out.print("pesan lagi?(y/n) : ");
                // pesanLagi = input.readLine();
                
            } while (ulang);

        } catch (Exception e) {
            
        }
    }
}