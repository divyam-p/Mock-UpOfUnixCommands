// **********************************************************
// Assignment2:
// Student1:Divyam Patel
// UTORID user_name: pate1006
// UT Student #: 1006139698
// Author: Divyam Patel
//
// Student2: Samyak Mehta
// UTORID user_name: mehtas28
// UT Student #: 1006298542
// Author: Samyak Mehta
//
// Student3: Aryan Patel
// UTORID user_name: pate1065
// UT Student #: 1006273514
// Author: Aryan Patel
//
// Student4: None
// UTORID user_name:
// UT Student #:
// Author:
//
//
// Honor Code: I pledge that this program represents my own
// program code and that I have coded on my own. I received
// help from no one in designing and debugging my program.
// I have also read the plagiarism section in the course info
// sheet of CSC B07 and understand the consequences.
// *********************************************************
package commands;

import java.util.ArrayList;
import filesystem.CommandsInterface;

/**
 * 
 * Class responsible for going to last saved working directory if there are any.
 *
 */
public class PopdCommand extends Commands implements CommandsInterface {

  private StackClass stack = null;
  private ArrayList<String> temp = new ArrayList<String>();

  /**
   * Constructor for PopdCommand
   */
  public PopdCommand() {

    // Create a singleton of the stack class
    this.stack = StackClass.currentStackClassInstance();
  }

  /**
   * Executes popd command
   */
  protected void executeCommand() {

    // Gets the top element from the stack and change directory to it
    // Get popped element from Stack Class
    this.temp = stack.getNewLocation();
    if (temp != null) {
      this.fileSystem.changeCurrentWorkingDir(temp);
      this.fileSystem.goToCurrentWorkingDir();
    }

    else {
      super.content = null;
    }
  }

  /**
   * Checks if input from user is valid before calling executeCommand
   * 
   * @return super.content the output string
   */
  public String checkInput() {

    // Performs validation for all 0 parameter commands (checks that there
    // are no other parameters, invalid chars, etc.
    if (validateInput.checkNumberOfParameterZero(super.userInput)) {
      executeCommand();
    }

    else {
      super.content = null;
    }
    return super.content;
  }
}
