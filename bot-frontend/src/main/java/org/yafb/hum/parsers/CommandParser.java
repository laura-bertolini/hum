package org.yafb.hum.parsers;

import org.yafb.hum.commands.Command;

public interface CommandParser {

	String CMD_DELIMITER = "!";

	Command parse(String msg);

}
