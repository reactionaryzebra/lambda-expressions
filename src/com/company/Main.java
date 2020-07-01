package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        new Thread(()-> System.out.println("Printing from the Runnable")).start();
    }
}

class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from runnable");
    }
}
