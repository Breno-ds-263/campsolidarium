package com.Breno.campsolidarium.repository;
import com.Breno.campsolidarium.model.Insumo;

import java.util.ArrayList;
import java.util.List;

public class InsumoRepository {

    private static final List<Insumo> insumos = new ArrayList<>();

    static {

        Insumo i = new Insumo();

        i.setCodigo(1);
        i.setNome("Água Mineral");
        i.setMarca("Indaiá");
        i.setCategoria("Alimento");

        insumos.add(i);

        i = new Insumo();

        i.setCodigo(2);
        i.setNome("Camisa");
        i.setMarca("Hering");
        i.setCategoria("Vestuário");

        insumos.add(i);
    }

    private InsumoRepository() {

    }

    public static void create(Insumo i) {
        insumos.add(i);
    }

    public static Insumo read(int codigo) {

        for (Insumo iAux : insumos) {

            if (iAux.getCodigo() == codigo) {
                return iAux;
            }
        }

        return null;
    }

    public static void update(Insumo insumo) {

        for (Insumo iAux : insumos) {

            if (iAux.getCodigo() == insumo.getCodigo()) {

                iAux.setNome(insumo.getNome());
                iAux.setMarca(insumo.getMarca());
                iAux.setCategoria(insumo.getCategoria());

                return;
            }
        }
    }

    public static void delete(Insumo insumo) {
        insumos.remove(insumo);
    }

    public static List<Insumo> readAll() {
        return insumos;
    }
}