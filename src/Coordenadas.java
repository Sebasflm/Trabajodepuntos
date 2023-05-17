import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Coordenadas {
    private Punto punto;
    private int numcoordenadas;
    private double x;
    private double y;
    private double distancia;
    private double numdistancias;
    public void ingresarcoordenadas(){
        Scanner scanner = new Scanner(System.in);
        List<Punto> puntos = new ArrayList<>();
        System.out.println("Indique la cantidad de puntos que desea ingresar:");
        numcoordenadas= scanner.nextInt();
        for(int i = 0; i < numcoordenadas; i++) {
            System.out.println("Ingrese el punto "+i+" en x':");
            x= scanner.nextInt();
            System.out.println("Ingrese el punto "+i+" en y':");
            y= scanner.nextInt();
            puntos.add(new Punto(x,y));
        }
        numdistancias=((numcoordenadas)*(numcoordenadas-1))/2;
    }
    public void calculardistancias(){
        distancia=0;
        for(int i = 0; i < numdistancias; i++){
            distancia= 
        }
    }
}

