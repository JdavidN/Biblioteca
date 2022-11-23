package modelo;

public class LibroDeColeccion extends Libro
{
    private String nombreColeccion;
    private int numeroLibroColeccion;

    public void LibroDeColeccion(String nombreColeccion, int numeroLibroColeccion) 
    {
        this.nombreColeccion = nombreColeccion;
        this.numeroLibroColeccion = numeroLibroColeccion;
    }

  
    public LibroDeColeccion(String nombreColecccion, int numeroLibroColeccion)
    {
        this.nombreColeccion = nombreColecccion;
        this.numeroLibroColeccion = numeroLibroColeccion;
    }

    public String getNombreColeccion() {
        return nombreColeccion;
    }

    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }

    public int getNumeroLibroColeccion() {
        return numeroLibroColeccion;
    }

    public void setNumeroLibroColeccion(int numeroLibroColeccion) {
        this.numeroLibroColeccion = numeroLibroColeccion;
    }
}
    

