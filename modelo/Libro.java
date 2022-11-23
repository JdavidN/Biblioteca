package modelo;

public class Libro
{
    //Atributos
    protected String nombreLibro;
    protected String nombreAutor;
    protected String nombreAutores;
    protected int anioEdicion;
    protected boolean tipoEdicion;

    //Métodos
    //Constructor nulo
    public Libro()
    {
    }
    
    //Contructor en parámetro
    public Libro(String nombreLibr, String nombreAtor, String nombresAutores, int anioEdicion, boolean tipoEdicion)
    {
        this.nombreLibro = nombreLibr;
        this.nombreAutor = nombreAtor;
        this.nombreAutores = nombresAutores;
        this.anioEdicion = anioEdicion;
        this.tipoEdicion = tipoEdicion;
    }

    //Métodos de acceso
    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNombreAutores() {
        return nombreAutores;
    }

    public void setNombreAutores(String nombreAutores) {
        this.nombreAutores = nombreAutores;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public boolean isTipoEdicion() {
        return tipoEdicion;
    }

    public void setTipoEdicion(boolean tipoEdicion) {
        this.tipoEdicion = tipoEdicion;
    }


    

}
