P2JTrans
========

A PL/SQL to Java translator to convert PL/SQL code to java using ANTLR v3.3 and StringTemplate

Note- This is under development and does not translates all the PL/SQL constucts into Java. 
Contribute to help make it a ful fledged PL/SQL to java translator

#Run

`sudo java -classpath .:antlr-3.3-complete.jar org.antlr.Tool PLSQL3.g`

`sudo javac -classpath .:antlr-3.3-complete.jar *.java`

`sudo java -classpath .:antlr-3.3-complete.jar Main Java.stg input`


### License
MIT

The MIT License (MIT)

Copyright (c) 2014 Ayush Narula

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.