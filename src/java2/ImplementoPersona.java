package java2;



public class ImplementoPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona gerente = new Persona(0, null, null, null, null);
		gerente.id=1;
		gerente.nombre="Alfredo";
		gerente.apellido="Gallardo";
		gerente.sexo="masculino";
		gerente.fechanac="03/12/2000";
		
		System.out.println("GERENTE");
		System.out.println(gerente.toString());
		
		
		
		Persona obrero = new Persona(0, null, null, null, null);
		obrero.id=1;
		obrero.nombre="Daniel";
		obrero.apellido="Ramos";
		obrero.sexo="masculino";
		obrero.fechanac="22/09/2000";
		
		System.out.println("OBRERO");
		System.out.println(obrero.toString());
		
		
		

		Persona obrero1 = new Persona(0, null, null, null, null);
		obrero1.id=2;
		obrero1.nombre="Braian";
		obrero1.apellido="Ramirez";
		obrero1.sexo="masculino";
		obrero1.fechanac="22/09/2000";
		
		System.out.println("OBRERO");
		System.out.println(obrero1.toString());
		
		

		Persona obrero2 = new Persona(0, null, null, null, null);
		obrero2.id=1;
		obrero2.nombre="Carla";
		obrero2.apellido="More";
		obrero2.sexo="femenino";
		obrero2.fechanac="20/09/2000";
		
		System.out.println("OBRERO");
		System.out.println(obrero2.toString());
		
		
		
		
		

		Persona obrero3 = new Persona(0, null, null, null, null);
		obrero3.id=1;
		obrero3.nombre="Wilmer";
		obrero3.apellido="Rivas";
		obrero3.sexo="masculino";
		obrero3.fechanac="15/07/2000";
		
		System.out.println("DOBRERO");
		System.out.println(obrero3.toString());
		
		
		
		
		

	}

}
