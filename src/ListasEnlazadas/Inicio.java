package ListasEnlazadas;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListasEnlazadas miLista=new ListasEnlazadas();
	miLista.InsertarEnPrimero(10);
	miLista.InsertarEnPrimero(15);
	miLista.InsertarEnPrimero(30);
	miLista.InsertarEnPrimero(50);
	miLista.InsertarEnPrimero(40);
	miLista.InsertarEnPrimero(60);
        
	System.out.println(miLista.Listar());
        miLista.InsertarLocalizacion();
	System.out.println("borrar");
	//miLista.borrarUltimo();
        //miLista.borrarPrimero();
        miLista.borrarPosicion(2);
	
	System.out.println(miLista.Listar());
    }
    
}
