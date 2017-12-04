package Classes;

/**
 * Esta classe tem como objetivo identificar uma regra de um e-mail (classe "Email")
 * 
 * @author Kevin Corrales n� 73529
 *
 */
public class Rule {

	/**
	 * Atributos:
	 * 		rule -> identifica a regra
	 * 		weight -> peso da regra 
	 */
	private String rule ;
	private int weight = 0;
	
	public Rule(String rule,int weight) {
		this.rule=rule;
		this.weight=weight;
	}
	
	public String getRule() {
		return rule;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	
}
