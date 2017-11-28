package edu.ucsb.cs56.networking.expression_evaluator;

public class Evaluator{
    
    public static int evaluate(Parser p){
	switch (p.getOp()){
	case "+":
	    return p.getLHS() + p.getRHS();
	    break;
	case "-":
	    return p.getLHS() - p.getRHS();
	    break;
	case "*":
	    return p.getLHS() * p.getRHS();
	    break;
	case "/":
	    return p.getLHS() / p.getRHS();
	    break;
	}
    }
}
