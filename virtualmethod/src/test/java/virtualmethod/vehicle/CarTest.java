package virtualmethod.vehicle;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest {

	@Test
	public void getGrossLoadWithRealValues() {
		Car car = new Car(1700, 4);

		assertThat(car.getGrossLoad() , is((4 + 1) * Car.PERSON_AVERAGE_WEIGHT + 1700));
	}

	@Test
	public void tostring() {
		Car car = new Car(1700, 4);

		assertThat(car.toString(), is("Car{numberPassenger=" + 4 + ", vechileWeight=" + 1700 +'}'));
	}

}