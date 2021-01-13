# Getting Started 
>> Step 1 
* clone the repo with "git clone https://github.com/divyam-p/UnixCommands" 
>> Step 2 
* open project with an Java IDE, example Eclipse 
>> Step 3 
* run the program and you are DONE! 

>> NOTE: 
* When initially cloning, for "speak" command, you may find that there is an error due to not having a java library installed, therefore, you need to get the java library for converting code into audible sound. However, the rest of the commands can still be used by just continuing with the error. 
 * I can't seem to find the exact library that allows the audible sound, I will update this once I find it. 
* Also, might have to import the Junit library which can be done by: 
 * right clicking the project
 * selecting "Build Path", and then "Configure Build Path..."
 * lastly, go under "Java Build Path" on the left side, then "Libraries" and then "Add Library...", select "Junit" and you are done! 

# Description 
>> This is a replication project for unix commands. Some commands that can be used include : 
* man CMD 
  * prints documentation for CMD 
  * USE TO GET A DESCRIPTION OF WHAT EACH COMMAND DOES! 
* rm DIR 
  * removes the DIR from the file system 
* exit 
  * quits the program/session 
* mkdir DIR...
  * creates DIR, which may be relative to the current directory or a full path 
  * can take in more than one DIR 
* cd DIR 
  * changes directory to DIR which may be relative to the current directory or a full path 
* ls [-R] [PATH...] 
  * if "-R" is present, recursively displays all the subdirectoies of PATH and its content 
  * if "ls" alone, displays the contents of current directory 
  * if PATH is a file, displays the file contents 
  * if PATH is a directory (can have multiple PATH's split with space), lists all the contents of the directories specified 
* pwd 
  * displays the current working directory 
* mv OLDPATH NEWPATH 
  * moves content of OLDPATH to NEWPATH, both OLDPATH and NEWPATH may be relative or absolute paths 
  * moves so removes content of OLDPATH 
* cp OLDPATH NEWPATH 
  * copies content of OLDPATH to NEWPATH, both OLDPATH and NEWPATH may be relative or absolute paths 
  * copies so doesn't remove content of OLDPATH like in mv 
* cat FILE ...
  * displays the content of FILE 
  * can have multiple paths 
* curl URL 
  * retrives file at the given URL and adds it to the current working directory 
* echo STRING [>|>>] [PATH] 
  * prints STRING if only "echo STRING" provided 
  * if ">" and "PATH" provided, overwrites "STRING" into the given PATH file 
  * if ">>" and "PATH" provided, appends "STRING" into the given PATH file 
* pushd DIR 
  * pushes the current working directory to a directory stack and changes directory to DIR 
* popd 
  * removes the top entry from the directory stack and changes directory to it 
* history [number] 
  * prints out all the commands previously called if "number" is obmitted 
  * prints out the last "number" called commands if "number" is provided including the current call of "history [number]" 
* save FileName 
  * saves the current file system on your actual computer's file system with the "FileName" as the name of the file system stored 
  * "FileName" can be a relative or absolute path in which case we only consider the name after the last "/" as the file system name to be saved 
* load FileName 
  * loads the file system saved on your actual computer with the name "FileName" 
  * load can only be called if it's the first command called before the start of a new session 
* find path ... -type [f|d] -name expression 
  * find /users/Desktop -type f -name "xyz". This command will search the directory Desktop and find all files (indicated by type f) 
    that have the name exactly xyz
  * find /users/Desktop -type d -name "abc". This command will search the directory Desktop and find all directories (indicated by type d) 
    that have the name exactly abc.
  * find /users/Desktop /users/Desktop1 -type d -name "abc". This command will search the directory Desktop and Desktop1 and find all 
    directories (indicated by type d) that have the name exactly abc
  * find /users/Desktop /users/Desktop1 -type f -name "abc". This command will search the directory Desktop and Desktop1 and find all 
    directories (indicated by type f) that have the name exactly abc
  * if the format of what "find" accepts is wrong or path provided is not correct, then an appropriate error message is given 
* tree 
  * displays the entire file system as a tree 
* speak STRING 
  * speaks the appropriate STRING as audible sound from computer 
  
# Acknowledgements 
Made By: 
* Divyam Patel 
* Aryan Patel 
* Samyak Mehta
