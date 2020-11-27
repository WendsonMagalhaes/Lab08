package strategyPattern;
public class ControllerFormatting {
	
	
	private StrategyFormatting strategyFormatting;

	public  ControllerFormatting (StrategyFormatting strategyFormatting) {
		this.strategyFormatting = strategyFormatting;
	}
	
	public String formatText(String text) {
		return strategyFormatting.formatText(text);
	}
}
