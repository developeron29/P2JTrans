P2JTrans
========

A PL/SQL to Java translator to convert PL/SQL code to java using ANTLR v3.3 and StringTemplate

Note- This is under development and does not translates all the PL/SQL constucts into Java. 
Contribute to help make it a ful fledged PL/SQL to java translator

#Run

`sudo java -classpath .:antlr-3.3-complete.jar org.antlr.Tool PLSQL3.g`

`sudo javac -classpath .:antlr-3.3-complete.jar *.java`

`sudo java -classpath .:antlr-3.3-complete.jar Main Java.stg input`

