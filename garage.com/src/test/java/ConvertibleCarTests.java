import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import bsh.This;

public class ConvertibleCarTests {
	private ConvertibleCar Car;

	@BeforeClass
	public void setup() {
		String model = "Miata";
		IEngine engine = new SmallEngine();
		IIgnition ignitionSystem = new ElectronicIgnition();

		this.Car = new ConvertibleCar(model, engine, ignitionSystem);
	}

	@Test
	public void canBuildConvertibleCar() {
		Car car = this.Car;

		String actualModel = car.getModel();

		assertEquals(actualModel, Car.getModel(), "Wrong convertible car model");
	}

	@Test
	public void canStartConvertibleCar() {
		ConvertibleCar car = this.Car;

		car.start();
		boolean isStarted = car.getIsStarted();

		assertTrue(isStarted, "convertible car is not started");
	}

	@Test
	public void canLowerTop() {
		ConvertibleCar car = this.Car;

		car.lowerTop();
		boolean isLowerTop = car.getIsLowerTop();
		assertTrue(isLowerTop, "convertible car is not lowering top");
	}

	@Test
	public void canRaiseTop() {
		ConvertibleCar car = this.Car;

		car.raiseTop();
		boolean isRaiseTop = car.getIsRaiseTop();
		assertTrue(isRaiseTop, "convertible car is not raising top");
	}
}