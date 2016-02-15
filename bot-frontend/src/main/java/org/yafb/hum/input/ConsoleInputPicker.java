package org.yafb.hum.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputPicker implements InputPicker {

	public void hello() {
		System.out.println("Hi there from Hum!!");
	}

	public String read() throws IOException {
		System.out.print(">");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
