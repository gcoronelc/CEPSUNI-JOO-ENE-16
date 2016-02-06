package projectestructura;
import java.io.*;
import javax.swing.JOptionPane;
public class alquilar
{
    FileInputStream entrada;
    FileOutputStream salida;
    
    public static void main(String[] args) {
        File archivo;
        
    }
    public void creararchivo()
     {
        File archivo;
        try{
     archivo =new File("E:\\ALFA\\archivo.txt");
     if(archivo.createNewFile())
     {
         JOptionPane.showMessageDialog(null,"se creo el archivo");
     }
     }
        catch(IOException e)
        {
            JOptionPane.showMessageDialog(null,"no se creo el archivo");
        }
        
        
    }
    public  String abrirarchivo(File archivo)
    {String contenido="";
        try {
            entrada=new FileInputStream(archivo);
            int ask;
            while((ask=entrada.read())!=-1)
            {
                char caracter=(char)ask;
                contenido+=caracter;
            }
        } catch (IOException e) {
        }
        return contenido;
    }
    public String guardararchivo(File archivo,String contenido)
    { String respuesta=null;
        try {
            salida=new FileOutputStream(archivo);
            byte [] bytetxt = contenido.getBytes();
            salida.write(bytetxt);
            respuesta="se guardo con exito el archivo";
        } catch (IOException e) {
        }
    
    return respuesta;
    }
  
}
