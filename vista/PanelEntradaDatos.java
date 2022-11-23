package vista;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import java.awt.Color;



public class PanelEntradaDatos extends JPanel
{
    //Atributos
    private ImageIcon iImagen;
    private JLabel lbImagen;
    private JLabel lbNomLibro;
    private JLabel lbNombreAutor;
    private JLabel lbNombresAutores;
    private JLabel lbAnioEdicion;
    private JLabel lbTipoEdicion;
    private JTextField tfNomLibro;
    private JTextField tfNombreAutor;
    private JTextField tfNombresAutores;
    private JTextField tfAnioEdicion;
    private JRadioButton rbTipoEdicion;
    
    //------------------------
    //Metodos
    //------------------------
    
    //Constructor
    public PanelEntradaDatos()
    {
        //Definicion del contendor del panel
        setLayout(null);
        setBackground(Color.WHITE);
        
        //Creación y adicion de la imagen
        iImagen = new ImageIcon(getClass().getResource("descarga.jpeg"));
        lbImagen = new JLabel(iImagen);
        lbImagen.setBounds(10,20,250,276);
        add(lbImagen);
        
        //Creación y adición de etiquetas
        lbNomLibro = new JLabel("Nombre del libro: ");
        lbNomLibro.setBounds(276,30,250,30);
        add(lbNomLibro);
        
        lbNombreAutor = new JLabel("Nombre del autor: ");
        lbNombreAutor.setBounds(276,80,250,30);
        add(lbNombreAutor);
        
        lbNombresAutores = new JLabel("Nombre de los demás autores: ");
        lbNombresAutores.setBounds(276,130,250,30);
        add(lbNombresAutores);

        lbAnioEdicion = new JLabel("Año de edición: ");
        lbAnioEdicion.setBounds(276,180,250,30);
        add(lbAnioEdicion);

        lbTipoEdicion = new JLabel("Marca la opción si es una edición de lujo: ");
        lbTipoEdicion.setBounds(276,230,250,30);
        add(lbTipoEdicion);
        
        //Creación y adición de campos de texto
        tfNomLibro = new JTextField();
        tfNomLibro.setBounds(526, 30, 120, 30);
        add(tfNomLibro);
        
        tfNombreAutor = new JTextField();
        tfNombreAutor.setBounds(526, 80, 120, 30);
        add(tfNombreAutor);

        tfNombresAutores = new JTextField();
        tfNombresAutores.setBounds(526, 130, 120, 30);
        add(tfNombresAutores);

        tfAnioEdicion = new JTextField();
        tfAnioEdicion.setBounds(526, 180, 120, 30);
        add(tfAnioEdicion);

        rbTipoEdicion = new JRadioButton();
        rbTipoEdicion.setBounds(526, 230, 120, 30);
        add(rbTipoEdicion);

        //Borde y titulo del panel
        TitledBorder borde = BorderFactory.createTitledBorder("Datos de Entrada");
        borde.setTitleColor(Color.BLACK);
        setBorder(borde);
    }
    
    //Metodos de acceso a la información de las cajas de texto
    public String getNomLib()
    {
        return (String) tfNomLibro.getText();
    }

    public String getNomAutor()
    {
        return (String) tfNombreAutor.getText();
    }

    public String getNomAutores()
    {
        return tfNombresAutores.getText();
    }
    
    public String getAnioEdicion()
    {
        return tfAnioEdicion.getText();
    }

    public String getTipoEdicion()
    {
        return rbTipoEdicion.getText();
    }


    //Metodo para borrar cajas de texto
    public void borrar()
    {
        tfNomLibro.setText("");
        tfNombreAutor.setText("");
        tfNombresAutores.setText("");
        tfAnioEdicion.setText("");
        rbTipoEdicion.setText("");
    }

}
