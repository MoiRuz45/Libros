package modelo;

import java.util.Objects;

public class Libro {

	private String ISBN;
	private String titulo;
	private int numPag;
	private float precio;
	private int anio;
	private int cantidad;
	private float precioCD;
	
	public Libro() {
		this.ISBN="";
		this.titulo="";
		this.numPag=0;
		this.precio=(float) 0.0;
		this.anio=0;
		this.cantidad=0;
		this.precioCD=(float) 0.0;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecioCD() {
		return precioCD;
	}

	public void setPrecioCD(float precioCD) {
		this.precioCD = precioCD;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(ISBN, other.ISBN);
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", numPag=" + numPag + ", precio=" + precio + ", anio="
				+ anio + ", cantidad=" + cantidad + ", precioCD=" + precioCD + "]";
	}
	
	
}
