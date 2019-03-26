package ListasEnlazadas;

import java.util.Scanner;

/**
 *
 * @author Billy Jeshua Sican Matias 0901-17-16250
 */
public class ListasEnlazadas{
    	Nodo Primero;
        Nodo Final;
        Nodo Siguiente;
	public ListasEnlazadas(){ 
		Primero=null;
                Final = null;
	}
	public boolean vacia(){
		if (Primero==null){
                    return(true);
		} else{
                    return(false);
		}
	}
        
	public void InsertarEnPrimero(int Dato){
		Nodo Temporal=new Nodo(Dato, Primero); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
        
        public void InsertarLocalizacion(){
            Scanner scngua = new Scanner(System.in);
            Nodo anterior=Primero;
            Nodo actual=Primero;
            int k=0, pos, Dato;
            System.out.println("En que posicion Decea Incertar ");
            pos = scngua.nextInt();
            System.out.println("Que Dato Va a Insertar: ");
            Dato = scngua.nextInt();
            if (pos>=0){
                while (k!=pos && actual.Siguiente != null){
                    anterior=actual;
                    actual=actual.Siguiente;
                    k++;                   
                }			
            }
            
            Primero.Siguiente = new Nodo(Dato, actual);
            if(Final == null){
                Final = Primero;
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
