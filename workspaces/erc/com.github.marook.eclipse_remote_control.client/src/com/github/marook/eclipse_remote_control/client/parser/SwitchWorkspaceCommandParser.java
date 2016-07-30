package com.github.marook.eclipse_remote_control.client.parser;

import com.github.marook.eclipse_remote_control.command.command.Command;
import com.github.marook.eclipse_remote_control.command.command.SwitchWorkspaceCommand;

public class SwitchWorkspaceCommandParser extends CommandParser {

	public String getName() {
		return "switch_workspace";
	}

	public String getUsage() {
		return "[workspace folder]";
	}
	
	public Command parseCommand(final String[] args) {
		if (args.length < 2) {
			throw new CommandParseException("Expecting 1 argument");
		}
		
		final String folderName = args[1];

		final SwitchWorkspaceCommand cmd = new SwitchWorkspaceCommand();
		cmd.setFolderName(folderName);
		
		return cmd;
	}

}

