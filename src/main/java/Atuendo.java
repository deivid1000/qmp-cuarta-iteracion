import java.util.List;

public class Atuendo {

    List<Prenda> prendaList;

    public List<Sugerencia> getSugerenciasDeAtuendos() {

        AdministrarServicios condicionesBuenosAires = new AdministrarServicios();
        double temperaturaActual = condicionesBuenosAires.getServicio().getCondicionesClimaticas().get("Temperature").get("Value");

        List<Prenda> prendasAptas = (List<Prenda>) prendaList.stream().filter(prenda -> prenda.getTemperaturaMaximaAdecuada() <= temperaturaActual );

        GeneradorSugerencias generadorSugerencias = new GeneradorSugerencias();
        return generadorSugerencias.generarSugerenciasDesde(prendasAptas);

    }

}