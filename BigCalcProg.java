import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Péter Ferenc Gyarmati
 * @id 11913446
 */
public class BigCalcProg {
    public static void main(String[] args) {  
        try {
           final CharStream input = CharStreams.fromFileName(args[0]);
           final BigCalcProgLexer lexer = new BigCalcProgLexer(input);
           final CommonTokenStream tokens = new CommonTokenStream(lexer);
           final BigCalcProgParser parser = new BigCalcProgParser(tokens);
           final ParseTree tree = parser.program();

           final BigCalcProgVisitor<BigDecimal> visitor = new BigCalcProgVisitorImpl();
           final BigDecimal result = visitor.visit(tree);

           if (result != null)
              System.out.println("result: " + result.setScale(10, RoundingMode.HALF_UP));
        }
        catch (ArrayIndexOutOfBoundsException e) {
      	   System.out.println("usage: usage: java BigCalcProg <file>");
        }
        catch (Exception e) {
            e.printStackTrace();
           System.out.println(e);
        }
    }
}
