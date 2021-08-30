package tw.da.action;

import java.util.ArrayList;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;

import tw.da.model.TruchBean;

public class DemoSpelAction {

	 public static void main(String[] args) {
//		 SpelExpressionParser parse = new SpelExpressionParser();
//		 Expression ex = parse.parseExpression("'Hola,'+'A,igo!!'");
//		 String rs = ex.getValue().toString();
//	        System.out.println(rs);\
		 
		 
			ExpressionParser parser = new SpelExpressionParser();
			Expression express = parser.parseExpression("'Hola,' + ' Amigo!!'");
			String result = express.getValue().toString();
			System.out.println("result:" + result);
			
			StandardEvaluationContext ectx = new StandardEvaluationContext();
	           TruchBean t1 = new TruchBean(101,"bmw");
	           TruchBean t2 = new TruchBean(101,"benz");
	           
	           ArrayList<TruchBean> trucks = new ArrayList<TruchBean>();
	                 trucks.add(t1);
	                 trucks.add(t2);
	                 
	                 ectx.setVariable("trucks", trucks);
	                 
	                 String brand = parser.parseExpression("#trucks[1].breand").getValue(ectx,String.class);
	                 System.out.println(brand);
	                 		
	 }
}
