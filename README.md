# File-Tampering-Checker
From this tool end users can know whether the file is tampered or not. The
tool will internally calculate the MD5 hash value from the help of windows
CMD(command prompt).

If the user selects a single file He/She will get only MD5 hash from the help of
the official website of the file, He/She can compare the values of the hash and get to
know whether the file is tampered of not but if the user selected the original file and
another file used to check for the tempering process and the electrical file may be text
file, image file, video file and other file also.

## INTRODUCTION
### Introduction to the problem
File Tampered checker works with the concept of hash-value. That is
each and every file which is ever created has a unique Hash-value to it. This hash
value is a set of numbers given to a file. This hash-value will remain the same for
a given file if copy a file but if the you even slightly edit it in any way then that
specific file hash-value will be different from the original one. This is because
when you edit any type of file then its hash-value will be changed immediately.
This change will happen every time you do any kind of minor edits in the file ex
if you leave an extra space in a text file then the text file’s hash-value will change.

We use the hash-value concept because using it we can check any type of
file for its hash-value from text file or any type of file.

### Problem Statement
The problem that needs to be solved from “File Tampered Checker” tool
is that, We have to find out whether the users data has been altered or tampered
in any way or not.

Our project is coded on this concept, that is we first check the original
file’s hash-value then we check the one which was copied if both of these hash-
value are same then it means that the file has not been tampered in any way
however if both the file hash value is different then it definitely means that the
file is tampered.

### Objectives
The main objectives of our project is to known that the data has been tampered or
not will help full for common users as well as cybersecurity professionals.

### Expected Outcome
From our “File Tampered Checker” tool we will be able to get a Hash value
which will be 40 characters long. Using this User can verify the hash value of the file
and get to know if its tempered or not.

We use the hash-value concept because using it we can check any type of file
for its hash-value from a text file or any type of file.

## LITERATURE SURVEY
For the “File Tampering checker” tool we have conducted the literature survey
for the sake of getting better results by our project. This chapter is about the survey
and finding done by us.

### Existing System
Basically there are two types of existing system based on the hash file checker.
The first one bring the online hash checker and the other are free software like
IgorWasher, HashChecker, Nirsoft HashMyFiles etc

### Drawback
Almost all of these online and software hash file checker has some kind of
drawbacks to them. Down are some of there drawbacks of Hash Checker tool
From this tool users cannot get the hash-value of the file which has space in there
name.

To check the hash value of file online, The user must have active internet
connection and also if the user data is confidential on that scenario it may be risky
decision.

### Proposed System
The windows tool which has been made by us is definitely going to have
most, if not all the features of the above system and its developed in java
programming language so that the code will run smoothly and the any java developer
can see the source code of the tool so it's trustworthy.

## PROJECT REQUIREMENT SPECIFICATIONS
### Introduction
Our project which is developed by us does not need some high end
requirement specifications but rather some decent specs will do the job. Our
program will be able to run on the eclipse itself.
Our tool must have the following requirements.
- The system must have a Windows operating system with cmd.
- The system must have java pre installed.

### Hardware and Software Requirements
#### Minimum Hardware Requirements:
- Processor - Pentium 2 266 MHz
- Memory - Minimum of 8 MB memory
- Hard Disk - Minimum Disk space 250MB
- Display - Display, Mouse and Keyboard
#### Minimum Software Requirements:
- Operating System - Windows XP
- Language - Java because its easy to learn, Secure and required minimum memory
  allocation to run tool.
- IDE - Eclipse, The main reason to use the eclipse is that its functions are easy to
  solve and also that the built in packages are helpful for creating tools like our program.

### Feasibility Study
The electronic files are vulnerable for tampering. So that we bring with this
“File tampering checker” tool in order to know whether the file is tampered or not.
This tool will be helpful for the common computer users as well as cyber security
professionals as a Forensic tool.

### Economic Feasibility
The tool can be used by the cybersecurity professionals to submit the evidence in
court on forensic investigation.

### Technical Feasibility
From this tool users can get the hash value which is unique for each file. From this
users can compare it to the original file hash value.

### Organizational Feasibility
When users downloading any file from online, most of the official software
will have a unique hash value in there official web page so that the users can cross
check if they have got a legit software or a tampered software.

## SYSTEM DESIGN AND ANALYSIS
The File tampering checker is built with the help of java programming language.
We know that the java programming language is platform independent but this tool is
internally using windows CMD hence this tool will run only run in windows operating
system.

In this tool we are using the following ```Certutil -hashfile``` command which will run in
command prompt and it will get the hash value form the command CMD and print it
in console. Of course we are trimming the unwanted output.

After This the tool will give the users the hash file, which can be copied by the users
and used.

When the tool runs it will first ask the user to choose any file, This is done with the
help of the FileChooser. If the user select the file then a process will be created which
will bring back the file’s path and Hash-value. The hash value is the only needed
thing item here so in order to do that the tool will have to trim all of its unwanted text.

### Flowcharts
A flowchart is a type of diagram that represents an algorithm or process. This
diagrammatic representation can give a step-by-step solution to a given problem. As
shown in figure 1 it shows how our project works.

![Flowchart Image](https://github.com/ChetankumarSB/File-Tampering-Checker/blob/master/assets/Flowchart.png?raw=true)

### IMPLEMENTATION AND SOFTWARE SOURCE CODE
The tool has been written in java langue and has been written in eclipse
which is an open source software.

This java tool is using file chooser button for a user to select file and the
command will run in CMD to get the output.

When the program runs it will first ask the user to select any file. This is done
with the help of JFileChooser.APPROVE_OPTION which lets the users to select any
file from the device.

Then that file hash value will be extracted using the following command
Certutil -hashfile

After this the output has to be trimmed as along with the hash value it will also
display the file path . So in order to do it we have to use replace command which will
basically remove out all of the unwanted portion from the output

```
 String s1 = s.replace("SHA1 hash of ", "");
 String s2 = s1.replace(f1.getSelectedFile().getAbsolutePath(), "");
 String s3 = s2.replace(":", "");
 ```

After this the output which is now trimmed and reduced to only the hash
value is displayed on the console.

## Output:

![Selection Output Image](https://raw.githubusercontent.com/ChetankumarSB/File-Tampering-Checker/master/assets/Output01.png?raw=true)

![Result Output Image](https://raw.githubusercontent.com/ChetankumarSB/File-Tampering-Checker/master/assets/Output02.png?raw=true)

### Code Explanation

Our project main code works on the concept of the hash-value. That is the
hash value of each and every file given to us. Meaning that when user enters any file
name , that specific file name and hash value will be stored in a variable that variable
will be compared to the variable which has stored the hash and file name of the
second one. Then both of the variables will be trimmed so that now it has only the
hash value will be there. Now this both hash value will be compared with each other
if both these hash values are same than it means files have not been tampered if it is
slightly different to than it means that file has been tampered.

## TESTING
For testing purposes we have tested our programs in the following ways . First
we will have to create the test case scenarios where we list each and every possible
way we can test our program so that it we can detect what all error or bug are there in
the system. Then we test the system to each and every test cases which have been
listed in the test cases. Now in the test cases if the actual result is same as the
the expected result then that test case is passed and it is left. If in any means any one of
the test cases actual result and the expected result does not match each other then that
case is sent to the bug report.

In the bug report we keep a record of why that specific test case has failed and
why. We document as to how to get these test cases and everything related to it. This
steps are done to each and every test case which has failed.

The bug report which has been done particularly mean any error but rather that
a specific feature has not been added yet.

### Test Cases:

![Testcase Image](https://raw.githubusercontent.com/ChetankumarSB/File-Tampering-Checker/master/assets/Testcase01.png?raw=true)

![Testcase Image](https://raw.githubusercontent.com/ChetankumarSB/File-Tampering-Checker/master/assets/Testcase02.png?raw=true)

### Bug Report:

![Bug Report Image](https://raw.githubusercontent.com/ChetankumarSB/File-Tampering-Checker/master/assets/Bugreport.png?raw=true)

### CONCLUSION

Our project as of now works properly and has all the expected outcomes. With
our program users can easily get to know the has values of there files and known
whether their files have been tampered, if so which specific file has been tampered.
The tool will be very much helpful for almost everyone. Common users will be able
to know if their data has been altered in any way. On the other hand security people
can use this tool as evidence to the court.

The tools is small and consistent so that both user and developers can check
and verify if the tool is authentic or not.

## FUTURE ENHANCEMENT
The Tool which is created by is non-GUI based one where the output is
displayed on the terminal itself. This same tool can be built with the help of the java
GUI will be both user friendly and will look neat too. So one of the enhancement
which can be made into java GUI.

The other enhancement which can be made is that we cannot compare online
files to it we can only compare that files which are present in the laptops hard disk . If
we edit the source code a little bit than the tool will be able to select files which are
present online EX- cloud based files, etc. The tool can be modified to select multiple
files at the same time.

## BIBLIOGRAPHY
- The programme is based on the concept of hash file. [Website link](https://www.thewindowsclub.com/verify-md5-checksum-of-files-using-certutil)
- The code has been modified and edited from the help of [Website link](https://www.javatpoint.com/java-jfilechooser)
- To run operating system commands [Video link](https://youtu.be/moeoyqpS4KI)
