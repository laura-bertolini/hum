package org.yafb.hum.commands;

public class RealCommand implements Command {

	private String cmd;

	public RealCommand(String commandString) {
		cmd = commandString;
	}

	public void execute() {
		System.out.println(String.format("%s is a very powerfull command", cmd));
	}

}
