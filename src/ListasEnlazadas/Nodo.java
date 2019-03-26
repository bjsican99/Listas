package ListasEnlazadas;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Nodo {
    	int info;
	public Nodo Siguiente;
	public Nodo (int dato){
		info=dato;
	}
	public void verNodo(){
		System.out.print("(  "+info+" )");
	}

}
