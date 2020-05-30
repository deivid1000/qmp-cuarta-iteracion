import java.util.List;
import java.util.Map;

public class ServicioAccu implements Servicio{
    @Override
    public Map<String, Object> getCondicionesClimaticas() {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
        return condicionesClimaticas.get(0);
    }
}
