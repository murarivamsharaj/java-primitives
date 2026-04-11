package com.java.fundamentals;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrintEvenNumbers {
    static void main() {
                int no = 1;
                while (no <= 10) {
                    if (no == 5) {
                        break;
                    }
                    // Fixed capital 'S' and variable name 'no'
                    System.out.println(++no);

                    no += 3;
                }
            }
        }


