package strategyPattern;

public class Italic implements StrategyFormatting {

	@Override
	public String formatText(String text) {
		String italic = "Texto em italico: " + text;
		return italic;
	}

}
