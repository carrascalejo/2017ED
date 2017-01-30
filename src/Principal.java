
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona pepe=new Persona();
		pepe.setNombre("Pepe");
		pepe.setPeso(45);
		pepe.setEdad((byte) 1);
		for (int centinela=1; centinela<129; centinela++){
			pepe.setEdad((byte) (pepe.getEdad()+1));
		}
		

	}

}
