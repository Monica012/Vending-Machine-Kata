package com.vendingMachine.vendingMachine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class VendingMachineApplication {
	int cur_amount = 0;
	public static void main(String[] args) {
		SpringApplication.run(VendingMachineApplication.class, args);
	}

}
