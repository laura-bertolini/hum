package org.yafb.hum.bot;

import java.io.IOException;

import org.yafb.hum.commands.Command;
import org.yafb.hum.input.ConsoleInputPicker;
import org.yafb.hum.input.InputPicker;
import org.yafb.hum.parsers.CommandParser;
import org.yafb.hum.parsers.SimpleCommandParser;

public class Hum {

	private InputPicker inputPicker;
	private CommandParser commandParser;

	public Hum() {
		inputPicker = new ConsoleInputPicker();
		commandParser = new SimpleCommandParser();
	}

	public static void main(String[] args) {
		Hum hum = new Hum();
		try {
			hum.start();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void start() throws IOException {
		inputPicker.hello();
		String msg = inputPicker.read();
		while (!msg.equals(InputPicker.QUIT)) {
			Command cmd = commandParser.parse(msg);
			cmd.execute();
			msg = inputPicker.read();
		}
		System.out.println("Bye!");
	}

}
