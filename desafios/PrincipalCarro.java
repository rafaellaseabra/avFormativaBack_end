package avFormativa.desafios;

public class PrincipalCarro {

	public static void main(String[] args) {

	Motor motor = new Motor(" 2.0 turbo de 184 cv ");
	Carro carro = new Carro("BMW 320i", motor);

    System.out.println("Carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());

	}

}
