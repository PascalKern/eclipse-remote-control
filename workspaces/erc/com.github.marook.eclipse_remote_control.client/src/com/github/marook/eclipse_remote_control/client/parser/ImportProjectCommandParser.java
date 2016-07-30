package com.github.marook.eclipse_remote_control.client.parser;

import com.github.marook.eclipse_remote_control.command.command.Command;
import com.github.marook.eclipse_remote_control.command.command.ImportProjectCommand;

public class ImportProjectCommandParser extends CommandParser {

	public String getName() {
		return "import_project";
	}

	public String getUsage() {
		return "[folder project_name]";
	}

	public Command parseCommand(final String[] args) {
		if (args.length < 3) {
			throw new CommandParseException("Expecting 2 argument");
		}

		
		final String folderName = args[1];
		final String projectName = args[2];

		final ImportProjectCommand cmd = new ImportProjectCommand();
		cmd.setFolderName(folderName);
		cmd.setProjectName(projectName);
		
		return cmd;
	}

}
