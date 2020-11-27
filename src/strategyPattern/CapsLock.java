package strategyPattern;

public class CapsLock implements StrategyFormatting {

	@Override
	public String formatText(String text) {
		String capsLock = "Texto em caixa alta: " + text.toUpperCase();
		return capsLock;
	}

}
