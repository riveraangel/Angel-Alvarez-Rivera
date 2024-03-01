import java.util.function.Function;

public class Ejercicio3 {
public static double findRoot(Function<Double, Double> function, double x0, double x1, double tolerance, int maxIterations) {
        double x2 = 0;
        int iterations = 0;
        
        do {
            x2 = x1 - ((function.apply(x1) * (x1 - x0)) / (function.apply(x1) - function.apply(x0)));
            x0 = x1;
            x1 = x2;
            iterations++;
        } while (Math.abs(function.apply(x2)) > tolerance && iterations < maxIterations);
        
        return x2;
    }

    public static void main(String[] args) {
        
        Function<Double, Double> function = x -> x * x - 43; 
        
        // Definir los puntos iniciales  
        double x0 = 0.5;
        double x1 = 1.0;
        
        // Definir la tolerancia y el número máximo de iteraciones
        double tolerance = 0.0001;
        int maxIterations = 1000; 
        
        // Encontrar la raíz
        double root = findRoot(function, x0, x1, tolerance, maxIterations);
        
        // Imprimir el resultado
        System.out.println("Raíz encontrada: " + root);
    }    
}
