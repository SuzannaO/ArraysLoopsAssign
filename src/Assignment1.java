
    package com.company;
    public class Assignment1 {

        public static void main(String[] args) {
            int[] arrayNumbers = {5, 3, 7, 6, 2, 8};
            forLoop(arrayNumbers);
            System.out.println();
            forEachLoop(arrayNumbers);
            System.out.println();
            whileLoop(arrayNumbers);
            System.out.println();
            doWhileLoop(arrayNumbers);
//couldn't find other solution to make space between methods, so numbers in print line won't be in one column
            // that's why used sout; \n didn't work here
        }

        public static void forLoop(int[] arrayNumbers) {
            for (int i = 0; i < arrayNumbers.length; i++) {
                System.out.println(arrayNumbers[i]);
            }
        }

        public static void forEachLoop(int[] arrayNumbers) {
            for (int value : arrayNumbers)
                System.out.println(value);
        }

        public static void whileLoop(int[] arrayNumbers) {
            int i = 0;
            while (i < arrayNumbers.length) {
                System.out.println(arrayNumbers[i]);
                i++;
            }
        }

        public static void doWhileLoop(int[] arrayNumbers) {
            int i = 0;
            do {
                System.out.println(arrayNumbers[i]);
                i++;
            }
            while (i < arrayNumbers.length);
        }
    }
//for this assignment for or for each loop can be used, no need in while or do while loops

