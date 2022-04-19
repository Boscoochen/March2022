public class ConvertibleCar extends Car implements ICar {
	private boolean IsLowerTop;
	private boolean IsRaiseTop;

	public ConvertibleCar(String model, IEngine engine, IIgnition ignitionSystem) {
		super(model, engine, ignitionSystem);
	}

	public void lowerTop() {
		this.IsLowerTop = true;
	}

	public boolean getIsLowerTop() {
		return this.IsLowerTop;
	}

	public void raiseTop() {
		this.IsRaiseTop = true;
	}

	public boolean getIsRaiseTop() {
		return this.IsRaiseTop;
	}
}