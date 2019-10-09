package br.com.drummond.lexicalAnalyzer.pascal;

import java.io.File;
import java.nio.file.Paths;

public class GeneratorPascal {
	public static void main(String[] args) {
		String rootPath = Paths.get("").toAbsolutePath().toString();
		String subPath = "/src/br/com/drummond/lexicalAnalyzer/pascal/";
		String file = rootPath + subPath + "pascal.lex";
		File sourceCode = new File(file);
		jflex.Main.generate(sourceCode);
	}
}