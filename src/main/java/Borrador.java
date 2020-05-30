import static java.util.Objects.requireNonNull;

public class Borrador {

    TipoDePrenda tipoDePrenda;
    Material material;
    Color colorPrincipal;
    Color colorSecundario;
    Trama trama = Trama.LISA;
    double temperaturaMaximaAdecuada;

    public Borrador(TipoDePrenda tipoDePrenda){
        validateNonNull(tipoDePrenda);
        this.tipoDePrenda = tipoDePrenda;
    }

    public void especificarMaterial(Material material){
        validateNonNull(material);
        this.validarMaterialConsistenteConTipoDePrenda(material);
        this.material = material;
    }

    public void especificarColorPrincipal(Color color){
        validateNonNull(color);
        this.colorPrincipal = color;
    }

    public void especificarColorSecundario(Color color){
        validateNonNull(color);
        this.colorSecundario = color;
    }

    public void especificarTrama(Trama trama){
        this.trama = trama == null ? Trama.LISA : trama;
    }

    public void especificartemperaturaMaximaAdecuada(double temperatura){
        this.temperaturaMaximaAdecuada = temperatura;
    }

    public Prenda crearPrenda(){
        return new Prenda(tipoDePrenda, material, colorPrincipal, colorSecundario, trama);
    }

}
