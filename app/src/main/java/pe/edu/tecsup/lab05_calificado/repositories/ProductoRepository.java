package pe.edu.tecsup.lab05_calificado.repositories;

import java.util.ArrayList;
import java.util.List;

import pe.edu.tecsup.lab05_calificado.R;
import pe.edu.tecsup.lab05_calificado.models.producto;

/**
 * Created by Alumno on 5/04/2018.
 */

public class ProductoRepository {

 public static   List<producto> productlista=new ArrayList<>();

    static {

        productlista.add(new producto("KFC","mIRAFLORES", "8465697", "kfc" ));
        productlista.add(new producto("BEMBOS","mIRAFLORES", "8465697","bemb" ));
        productlista.add(new producto("PIZZA HUT","mIRAFLORES", "8465697","pizzahut" ));
        productlista.add(new producto("MC DONALDS","mIRAFLORES", "8465697","mcdon" ));
        productlista.add(new producto("BURGER KING","mIRAFLORES", "8465697","burger" ));
        productlista.add(new producto("CHILI","mIRAFLORES", "8465697","chil" ));
        productlista.add(new producto("STARTBUCKS","SAN ISIDRO", "8465697","star" ));


    }
    public static List<producto> getList(){
        return productlista;
    }

}
