/*
 * Copyright 2016 Michel Gillet
 *
 * This file is part of eclipse remote control.
 *
 * eclipse remote control is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * eclipse remote control is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with eclipse remote control.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.github.marook.eclipse_remote_control.command.command;


public class ImportProjectCommand extends Command {
	
	private static final long serialVersionUID = 123456L;

	public static final String ID = ImportProjectCommand.class.getName();
	
	private String folderName;
	private String projectName;
	
	public ImportProjectCommand() {
		super(ID);
	}
	
	public String getFolderName() {
		return folderName;
	}
	
	public void setFolderName(final String folderName) {
		this.folderName = folderName;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(final String projectName) {
		this.projectName = projectName;
	}
	
}

