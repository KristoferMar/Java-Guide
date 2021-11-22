package data_structures.iterable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PriorityQueue {
	
	public static void main(String[] args) {
		PriorityQueue.formatPriorities("bla", "bla", 2);
	}
	
    public static void formatPriorities(String cvr, String changedRuleUUID, int changedRulePrio) {
    	
        List<Integer> rules = new ArrayList<>();
        rules.add(1);
        rules.add(5);
        rules.add(3);
        rules.add(7);
        rules.add(1);
        
        System.out.println("rules before: ");
        System.out.println(rules);
        
        rules = rules.stream().peek(null).collect(Collectors.toList());
    	
        System.out.println(rules);
        
        Collections.sort(rules);
            

    }


	private class RuleElement implements Comparable, Serializable {

	    String ruleUUID;
	    int priority;

	    public RuleElement(String ruleUUID, int priority) {
	        this.ruleUUID =ruleUUID;
	        this.priority =priority;
	    }
	    public String getRuleUUID() {
	        return this.ruleUUID;
	    }
	    public int getPriority() {
	        return this.priority;
	    }
	    public void setPriority(int priority) {
	        this.priority = priority;
	    }

	    @Override
	    public int compareTo(Object o) {
	        int cPriority = ((PriorityQueue.RuleElement) o).getPriority();
	        /* Ascending */
	        return this.priority - cPriority;
	    }
	}
}
