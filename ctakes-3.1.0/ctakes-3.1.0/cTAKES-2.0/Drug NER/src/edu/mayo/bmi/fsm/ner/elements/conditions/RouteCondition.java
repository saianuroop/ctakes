package edu.mayo.bmi.fsm.ner.elements.conditions;

import net.openai.util.fsm.Condition;
import edu.mayo.bmi.fsm.ner.output.elements.RouteToken;

/**
 * Checks whether a token is a RouteToken.
 * @author Mayo Clinic
 */
public class RouteCondition extends Condition
{
	public boolean satisfiedBy(Object conditional)
	{
		if (conditional instanceof RouteToken)
		{
			return true;
		}
        	
		return false;
	}		
}
