package strategyPattern;

public class LowerCase implements StrategyFormatting {

	@Override
	public String formatText(String text) {
		String lowerCase = "Texto em caixa baixa: " + text.toLowerCase();
		return lowerCase;
	}

}
