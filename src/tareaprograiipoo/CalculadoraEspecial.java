
package tareaprograiipoo;

public class CalculadoraEspecial {
    //Atributos de Clase, pueden ser Publicos, Privados y Protegidos (en herencia)
    public String tipoCalculadora;
    public String color;
    public int dimensionPantalla;
    private String numeroDeSerie;
    private String nombrePropietario;

    //Constructor de la clase
    public CalculadoraEspecial(String propietario){
        this.tipoCalculadora="Calculadora Especial";
        this.dimensionPantalla=10;
        this.numeroDeSerie="12345abc";
        this.color="Rojo";
        this.nombrePropietario=propietario;
    }

    //Constructor vacio
    public CalculadoraEspecial(){
    }
    
    public int Factorial(int numero) {
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public double seno(double numero) {
        return Math.sin(Math.toRadians(numero));
    }

    public double coseno(double numero) {
        return Math.cos(Math.toRadians(numero));
    }

    public double tangente(double numero) {
        return Math.tan(Math.toRadians(numero));
    }
    
    public double secante(double numero) {
         double radianes = Math.toRadians(numero);
         return 1 / Math.cos(radianes);
    }
    
    public double cosecante(double numero) {
         double radianes = Math.toRadians(numero);
         return 1 / Math.sin(radianes);
    }
    
}
