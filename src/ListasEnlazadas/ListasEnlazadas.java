package ListasEnlazadas;

import java.util.Scanner;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class ListasEnlazadas
{
    	Nodo Primero;
        Nodo Siguiente;
	public ListasEnlazadas(){ 
		Primero=null;
	}
	public boolean vacia(){
		if (Primero==null){
                    return(true);
		} else{
                    return(false);
		}
	}
        
	public void InsertarEnPrimero(int Dato){
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
        
        public void InsertarLocalizacion(){
            Nodo anterior=Primero;
            Scanner scngua = new Scanner(System.in);
            Nodo actual=Primero;
            int k=0, pos, Dato;
            System.out.println("En que posicion Decea Incertar ");
            Dato = scngua.nextInt();
            System.out.println("Que Dato Va a Insertar: ");
            pos = scngua.nextInt();
            Nodo Temporal=new Nodo(Dato);
            if (pos>=0){
		while (k!=pos && actual.Siguiente != null){
                    anterior=actual;
                    actual=actual.Siguiente;
                    Temporal.Siguiente = actual;
                    actual = Temporal;
                    k++;
                    System.out.println("K       "+k);
		}
            System.out.println("Dato: "+actual.info);
            }
        }
        public void Localizar(){
            Nodo anterior=Primero;
            Scanner scngua = new Scanner(System.in);
		Nodo actual=Primero;
		int k=0, pos;
                System.out.println("Que Dato Decea Localizar\nEscriba la posicion: ");
		pos = scngua.nextInt();
                if (pos>=0){
			while (k!=pos && actual.Siguiente != null){
                            anterior=actual;
                            actual=actual.Siguiente;
                            k++;
                            System.out.println("K       "+k);
			}
			System.out.println("Dato: "+actual.info);
		}
            
        }
        
	public void borrarPrimero(){
		Primero=Primero.Siguiente;
	}
        
	public String Listar(){
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null){
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
	}
        
	public void borrarUltimo(){
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null){
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
	}
        
	public void borrarPosicion(int pos){
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
		if (pos>0){
			while (k!=pos && actual.Siguiente != null){
                            anterior=actual;
                            actual=actual.Siguiente;
                            k++;
                            System.out.println("K       "+k);
			}
			anterior.Siguiente = actual.Siguiente;
		}
	}

}
