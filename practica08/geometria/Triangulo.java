package geometria;
/**
 * Clase que representa un piligono de tres lados.
 * Está definido por tres puntos en el plano cartesiano.
 * @author Prado Oropeza Karina Vianey
 * @date 09/17/2019 
 */
public class Triangulo{
    private Punto a;
    private Punto b;
    private Punto c;
    
    public static final int EQUILATERO = 0;
    public static final int ESCALENO = 2;
    public static final int ISOSCELES = 1;

    /**
     * Crea un triángulo equilátero de lado 1 con vértices en (0, 0), (1, 0) y (0.5, sin(π / 3)).
     */
    public Triangulo (){
	a = new Punto();
	b = new Punto(1,0);
	c = new Punto(0.5,Math.sin(Math.PI/3));
    }

    /**
     * Crea un triángulo, con los parámetros dados.
     * @param a Punto a asignar al vertice a
     * @param b Punto a asignar al vertice b
     * @param c Punto a asignar al verice c
     */
    public Triangulo (Punto a, Punto b,Punto c){
	this.a = new Punto(a.getX(),a.getY());
        this.b = new Punto (b.getX(),b.getY());
        this.c = new Punto (c.getX(),c.getY());
    }
    
    /**
     * Determina si los vertices del traingulo estan alineados.
     */
    public boolean tieneVerticesAlineados(){
	return a.estanAlineados(b,c);
    }

    /**
     * Determina si un triángulo es equilatero.
     * @return true si es escaleno
     */
    public boolean esEquilatero(){
	double ab = a.distancia(b);
	double ac = a.distancia(c);
	double bc = b.distancia(c);
	return  ab == ac && ab == bc && ac == bc;
    }
    
    /**
     * Determina si un triángulo es escaleno
     * @return true si es escaleno
     */
    public boolean esEscaleno(){
        double ab = a.distancia(b);
	double ac = a.distancia(c);
	double bc = b.distancia(c);
	return  ab != ac && ab != bc && ac != bc;
    }

    /**
     * Devuelve el tipo de triangulo (equilatero,isoceles o escaleno)
     * @return tipo tipo de triangulo
     */
    public int tipo(){
	int tipo;
	if (esEquilatero())
	    tipo = EQUILATERO;
	else{
	    if (esEscaleno())
		tipo = ESCALENO;
	    else
		tipo = ISOSCELES;
	}

	return tipo;
    }
    /**
     * Regresa el vertice A
     * @return Punto a
     */
    public Punto getA(){
	return a;
    }
    /**
     * Regresa el vertice B
     * @return Punto b
     */
    public Punto getB(){
	return b;
    }
    /**
     * Regresa el vertice C
     * @return Punto c
     */
    public Punto getC(){
	return c;
    }
}
