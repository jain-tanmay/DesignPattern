package AbstractFactory;

public class Main {
public static void main(String args[]) {
	AbstractFactoryProducer abstractFactoryProducerObj = new AbstractFactoryProducer();
	AbstractFactory abstractFactoryObj = abstractFactoryProducerObj.getFactoryInstance("Luxury");
	Car carObj = abstractFactoryObj.getInstance(50000000);
	System.out.println(carObj.getTopSpeed());
	
}
}
