import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.stringtemplate.*;
import org.antlr.stringtemplate.language.*;

public class Main {
    public static StringTemplateGroup templates;

    public static void main(String[] args) throws Exception {
	String templateFileName;
	int a = 0;
	if ( args.length<=1 ) {
		templateFileName = "Java.stg";
	}
	else {
		templateFileName = args[a];
		a++;
	}
	templates = new StringTemplateGroup(new FileReader(templateFileName),
					    AngleBracketTemplateLexer.class);

	CharStream input = new ANTLRFileStream(args[a]);
	PLSQL3Lexer lexer = new PLSQL3Lexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	PLSQL3Parser parser = new PLSQL3Parser(tokens);
	parser.setTemplateLib(templates);
	RuleReturnScope r = parser.program();
	System.out.println(r.getTemplate().toString());
	    
	try {
		FileWriter myWriter = new FileWriter("CSharp_"+String.format(new Date().toString())+"_output");
		myWriter.write(r.getTemplate().toString());
		myWriter.close();
		System.out.println("Successfully wrote to the file.");
	} catch (IOException e) {
		System.out.println("An error occurred.");
		e.printStackTrace();
	}    
    }
}
