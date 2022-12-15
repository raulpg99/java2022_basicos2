package principal;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas= new ArrayList<>();//se escribe fuera de los metodos para que todos estos lo puedan leer
	
	public void guardarNota(double nota){ //se escribe void porque no se espera ningun resultado, simplemente que guarde la nota y se escribe publico para que se le pueda llamar desde fuera de la clase
		notas.add(nota);
	}
	
	public double media(){ //no se le da nada entre parentesis porque no necesita nada para hacer su trabajo, solo la lista notas que es general para todos los metodos
		double media=0;
		for (int i=0; i<notas.size(); i++) {
			media=media+notas.get(i);
		}
		media=media/notas.size();
		return media;
	}
	
	public int aprobados() {
		int aprobados=0;
		for (int i=0; i<notas.size(); i++) {
			if (notas.get(i)>=5) {
				aprobados++;
			}
		}
		return aprobados;
	}
	
	public double notaMax() {
		double notaMax=notas.get(0);
		for (int i=0; i<notas.size(); i++) {
			notaMax=Math.max(notaMax, notas.get(i));
		}
		return notaMax;
	}
	
    public double notaMin() {
    	double notaMin=notas.get(0);
		for (int i=0; i<notas.size(); i++) {
			notaMin=Math.min(notaMin, notas.get(i));
		}
		return notaMin;
	}
    
    public double[] notas() {//esto se refiere que le voy a entregar un array de dobles
		double[] resultados=new double [notas.size()];
		for (int i=0; i<notas.size(); i++) {
			resultados[i]=notas.get(i);
		}
		return resultados;
	}
    
    public void eliminarSuspensos () {
    	
    	for(int i=0; i<notas.size(); i++) {
    		if (notas.get(i)<5) {
    			notas.remove(i);
    			
    		} 
    	}
    	
    }

}
