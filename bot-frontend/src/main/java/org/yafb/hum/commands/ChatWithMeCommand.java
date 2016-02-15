package org.yafb.hum.commands;

public class ChatWithMeCommand implements Command {

	private String cmd;

	public ChatWithMeCommand(String commandString) {
		cmd = commandString;
	}

	public void execute() {
		// set a session of chat with user
		System.out.println(String.format("\"%s\" is an interesting thought", cmd));
	}

}
