import Modelo.Coche;
import Modelo.Propietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static ArrayList<Coche> coches;
    public static ArrayList<Propietario> propietarios;

    public static void main(String[] args) {

        coches = new ArrayList<>();
        propietarios = new ArrayList<>();

        Coche c1 = new Coche("1234ABC", "Toyota", 2018, 18000);
        Coche c2 = new Coche("5678DEF", "BMW", 2015, 25000);
        Coche c3 = new Coche("9012GHI", "Seat", 2012, 12000);


        Coche c4 = new Coche("3456JKL", "Toyota", 2020, 22000);
        Coche c5 = new Coche("7890MNO", "Audi", 2017, 30000);
        Coche c6 = new Coche("1122PQR", "BMW", 2010, 15000);

        Coche c7 = new Coche("3344STU", "Seat", 2019, 16000);
        Coche c8 = new Coche("5566VWX", "Audi", 2014, 20000);
        Coche c9 = new Coche("7788YZA", "Toyota", 2021, 24000);

        coches.add(c1);
        coches.add(c2);
        coches.add(c3);
        coches.add(c4);
        coches.add(c5);
        coches.add(c6);
        coches.add(c7);
        coches.add(c8);
        coches.add(c9);


        // PROPIETARIOS
        Propietario p1 = new Propietario( "Carlos", List.of(c1, c2, c3) );
        Propietario p2 = new Propietario( "Ana", List.of(c4, c5, c6) );
        Propietario p3 = new Propietario( "Luis", List.of(c7, c8, c9) );

        propietarios.add(p1);
        propietarios.add(p2);
        propietarios.add(p3);


        p1.getCoches().add(c1);
        p1.getCoches().add(c2);
        p1.getCoches().add(c3);
        p1.getCoches().add(c9);

        p2.getCoches().add(c4);
        p2.getCoches().add(c5);
        p2.getCoches().add(c6);

        p3.getCoches().add(c7);
        p3.getCoches().add(c8);


        /// 1

        List<String> matriculas = new ArrayList<>();

        for (Coche c : coches) {
            matriculas.add(c.getMatricula());
        }

        matriculas = coches.stream().map(Coche::getMatricula).toList();

        /// 2

        int contadosCoches = 0;

        for (Coche c : p1.getCoches()) {

            

        }








    }

















}