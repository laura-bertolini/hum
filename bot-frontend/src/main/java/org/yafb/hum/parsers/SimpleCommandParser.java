package org.yafb.hum.parsers;

import org.yafb.hum.commands.ChatWithMeCommand;
import org.yafb.hum.commands.Command;
import org.yafb.hum.commands.RealCommand;

public class SimpleCommandParser implements CommandParser {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.yafb.hum.parsers.CommandParser#parse(java.lang.String)
	 */
	public Command parse(String msg) {
		if (msg == null || msg.trim().equals("")) {
			throw new IllegalArgumentException("Message must be a valid, non-empty string");
		}
		Command cmd = msg.startsWith(CommandParser.CMD_DELIMITER) ? new RealCommand(msg) : new ChatWithMeCommand(msg);
		return cmd;
	}

}
