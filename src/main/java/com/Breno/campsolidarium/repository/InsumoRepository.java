package com.Breno.campsolidarium.repository;
import com.Breno.campsolidarium.model.Insumo;

import java.util.ArrayList;
import java.util.List;

public class InsumoRepository {

    private static final List<Insumo> insumos = new ArrayList<>();


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