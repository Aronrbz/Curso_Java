import java.util.ArrayList;
//punto 3
public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    /* Constructor vacío, No inicializa listaProductos, me tira errores.
    public ProductoServicio() {

    }*/

    // Constructor vacio pero que inicializa 'ListaProductos'
    public ProductoServicio() {
        this.listaProductos = new ArrayList<>();
    }

    public ProductoServicio(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }



    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }


    public void listarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("No hay productos en la lista.");
        } else {
            for (int i = 0; i < listaProductos.size(); i++) {
                Producto producto = listaProductos.get(i);
                System.out.println("Producto " + (i + 1) + ":");
                System.out.println("Articulo: " + producto.getArticulo());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Descripcion: " + producto.getDescripcion());
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Talla: " + producto.getTalla());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Color: " + producto.getColor());
                System.out.println();
            }
        }
    }


    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

}
