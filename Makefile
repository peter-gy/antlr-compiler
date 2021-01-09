compile:
	java -jar lib/antlr-4.7.1-complete.jar -visitor BigCalc.g4
	javac -cp lib/antlr-4.7.1-complete.jar:. *.java

run:
	java -cp lib/antlr-4.7.1-complete.jar:. BigCalc $(file)

viz:
	java -cp lib/antlr-4.7.1-complete.jar:. org.antlr.v4.gui.TestRig BigCalc $(part) -gui

clean:
	rm -f *.class
	rm -f 'BigCalc.interp'
	rm -f 'BigCalc.tokens'
	rm -f 'BigCalcBaseListener.java'
	rm -f 'BigCalcBaseVisitor.java'
	rm -f 'BigCalcLexer.interp'
	rm -f 'BigCalcLexer.java'
	rm -f 'BigCalcLexer.tokens'
	rm -f 'BigCalcListener.java'
	rm -f 'BigCalcParser.java'
	rm -f 'BigCalcVisitor.java'
