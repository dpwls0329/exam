package sec05.exam01_field_polymorphism;

public class Car {
	public Tire frontLeftTire = new HankookTire();
	public Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();

	Number01_brake num1 = new Number01_brake();

	Brake brake01 = new Number01_brake();

	Pedal pedal01 = new Number01_brake();

	public Tire[] tires = {
		new newHankookTire(),
		new newHankookTire(),
		new newHankookTire(),
		new newHankookTire()

	};

	public void run(){
		num1.push();
		num1.stop();

		System.out.println("----------run01-----------");

		brake_stop();

		System.out.println("----------run02-----------");		

		Number01_brake brake02 = (Number01_brake)brake01;
		brake02.push();

		System.out.println("----------run02-----------");

		brake02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new KumhoTire();
		brake02.defaultmethod_install_pedal(frontRightTire);
		frontRightTire = new newHanKookTire();
		brake02.defaultmethod_install_pedal(frontRightTire);
		
		// 	frontLeftTire.roll();
		// 	frontRightTire.roll();
		// 	backLeftTire.roll();
		// 	backRightTire.roll();

		for(Tire tire : tires){
			tire.roll();
		}
	}
}
