package strategyPattern;

public class Bold implements StrategyFormatting {

	@Override
	public String formatText(String text) {
		String bold = "Texto em negrito: " + text;
		return bold;
	}

}
