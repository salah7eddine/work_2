package org.home.myapp;

import org.home.myapp.service.MyService;

public class MyApp { // CamelCase
	public static void main(String[] args) {
		// System.out.println("Hello !!");
		if (args.length != 2) {
			System.out.println("You must provide 2 arguments!!!");
			System.exit(0);
		}

		MyService myService = new MyService();

		double a = Double.parseDouble(args[0]);
		double b = Double.parseDouble(args[1]);

		double result = myService.compute(a, b);

		System.out.println(String.format("Sum of %s and %s is %s", a, b, result));
	}
}