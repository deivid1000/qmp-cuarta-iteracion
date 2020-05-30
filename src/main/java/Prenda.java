import static java.util.Objects.requireNonNull;

public class Prenda {

    TipoDePrenda tipoDePrenda;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama;

    public double getTemperaturaMaximaAdecuada() {
        return temperaturaMaximaAdecuada;
    }

    double temperaturaMaximaAdecuada;

    public Categoria categoria() {
        return tipoDePrenda.getCategoria(); //delegacion
    }

}
