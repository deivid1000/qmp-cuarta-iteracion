public class TipoDePrenda {

    Categoria categoria;

    final TipoDePrenda ZAPATO = new TipoDePrenda(Categoria.CALZADO);
    final TipoDePrenda REMERA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    final TipoDePrenda CAMISA = new TipoDePrenda(Categoria.PARTE_SUPERIOR);
    final TipoDePrenda PANTALON = new TipoDePrenda(Categoria.PARTE_INFERIOR);

    public TipoDePrenda (Categoria categoria) {
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

}
