package com.github.marook.eclipse_remote_control.client.parser;

import com.github.marook.eclipse_remote_control.command.command.Command;
import com.github.marook.eclipse_remote_control.command.command.CloseCommand;

public class CloseCommandParser extends CommandParser {

	public String getName() {
		return "close";
	}

	public String getUsage() {
		return "[close]";
	}
	
	public Command parseCommand(final String[] args) {
		if (args.length > 1) {
			throw new CommandParseException("Expecting no argument");
		}
				
		final CloseCommand cmd = new CloseCommand();
				
		return cmd;
	}

}

