package ListasEnlazadas;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Nodo {
    	int info;
        public int dato;
	public Nodo Siguiente;//puntero enlace
        //Construcctor para insertar al final
	public Nodo (int dato, Nodo Pos){
		info=dato;
                Siguiente = Pos;
	}
	public void verNodo(){
		System.out.print("(  "+info+" )");
	}
       


}
