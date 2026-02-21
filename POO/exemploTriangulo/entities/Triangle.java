package POO.exemploTriangulo.entities; // pacotes da classe

public class Triangle {
    
    public double a; // atributos de classe
    public double b;
    public double c;

    // calcula a área do triangulo
    public double area() { // nome do método
        double p = (a + b + c) / 2.0;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c)); // corpo de método
        return result;
    }

}

// Delegação de responsabilidades, cada classse é responsavel por si mesma, o nome disso é coesão 
// A classe triangulo que deve saber calcular a área do triangulo