package com.app.java_forex_algorithms;

import java.net.URISyntaxException;

public class App {

	public static void main(String[] args) throws URISyntaxException {
		System.out.println("main() started");
		Thread thread1 = new Thread(new TradeRunnable(1));
		thread1.start();
		System.out.println("main() finished");

	}

}
