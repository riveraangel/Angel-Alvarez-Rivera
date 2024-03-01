public class Ejercicio {
public static double funcion(double x) {
        return Math.sin(x);  
    }
    // Implementación del método de Newton-Raphson
    public static double newtonRaphson(double xInicial, double tolerancia) {
        double xActual = xInicial;

        do {
            // Calculamos el valor de la función en xActual
            double valorFuncion = funcion(xActual);
            // Calculamos la pendiente de la función en xActual
            double pendienteFuncion = 2 * xActual;
            
            // Calculamos el siguiente punto usando la fórmula de Newton-Raphson
            double xSiguiente = xActual - valorFuncion / pendienteFuncion;
            
            // Actualizamos el valor de xActual
            xActual = xSiguiente;
            
        } while (Math.abs(funcion(xActual)) > tolerancia); // Mientras el valor de la función en xActual sea mayor que la tolerancia

        return xActual; // Devolvemos el valor de xActual, que es una aproximación de la raíz
    }

    public static void main(String[] args) {
        double xInicial = 5.0; // Valor inicial para comenzar la búsqueda
        double tolerancia = 0.0001; // Tolerancia, cuanto más pequeño, más precisa es la raíz
        double raiz = newtonRaphson(xInicial, tolerancia);
        // Imprimimos la raíz encontrada
        System.out.println("La raíz encontrada es: " + raiz);
    }     
}
