package estructura;

import java.util.Arrays;

public class AsocArray {

	String[] claves;
	String[] valores;
	int nCampos;
	
	
	
	
	public AsocArray(){
		claves = new String[1];
		valores = new String[1];
		nCampos = 0;
	}
	
	
	
	
	public void put(String clave, String valor){
		if(nCampos==0){
			claves[0] = clave;
			valores[0] = valor;
			nCampos++;
		}else{
			boolean encontrado = false;
			int i = 0;
			while(!encontrado && i<nCampos){
				if(claves[i].equals(clave)){
					valores[i] = valor;
					encontrado=true;
				}
				i++;
			}
			if(!encontrado){
				if(nCampos==claves.length){
					claves = Arrays.copyOf(claves, claves.length*2);
					valores = Arrays.copyOf(valores, claves.length*2);
				}
				claves[nCampos] = clave;
				valores[nCampos] = valor;
				nCampos++;
			}
		}
	}
	
	
	
	
	public String get(String clave) throws UndefinedKeyException{
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<nCampos){
			if(claves[i].equals(clave)){
				encontrado=true;
			}
			i++;
		}
		if(!encontrado){
			throw new UndefinedKeyException();
		}else{
			return valores[i-1];
		}
	}
	
	
	
	public String getOrElse(String clave, String valorPorDefecto){
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<nCampos){
			if(claves[i].equals(clave)){
				encontrado=true;
			}
			i++;
		}
		if(!encontrado){
			return valorPorDefecto;
		}else{
			return valores[i-1];
		}
	}
	
	
	
	public boolean containsKey(String clave){
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<nCampos){
			if(claves[i].equals(clave)){
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	
	
	
	
	public boolean remove(String clave){
		boolean encontrado = false;
		int i = 0;
		while(!encontrado && i<nCampos){
			if(claves[i].equals(clave)){
				encontrado=true;
			}
			i++;
		} if (!encontrado) return false;
		claves[i-1] = claves[nCampos-1];
		valores[i-1] = valores[nCampos-1];
		nCampos--;
		return true;
	}
	
	
	
	
	
	
	
	public int size(){
		return nCampos;
	}
	
	
	
	
}
