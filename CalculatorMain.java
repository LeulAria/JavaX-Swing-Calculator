import javax.swing.SwingUtilities;

public class CalculatorMain {
	private static CalculatorApplication calculatorApp;

	public static void main(String[] args) {
		// instanciating the calculator app to run to set it visible in the runnable.
		calculatorApp = new CalculatorApplication();

		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorApp.frame.setVisible(true); // setting the calculator window frame visible
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}