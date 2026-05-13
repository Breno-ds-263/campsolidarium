package com.Breno.campsolidarium.repository;


import com.Breno.campsolidarium.model.Emergencia;
import java.util.ArrayList;
import java.util.List;

public class EmergenciaRepository {

    private static final List<Emergencia> emergencias = new ArrayList<>();

    

    private EmergenciaRepository() {

    }

    public static void create(Emergencia e) {
        emergencias.add(e);
    }

    public static Emergencia read(int codigo) {

        for (Emergencia eAux : emergencias) {

            if (eAux.getCodigo() == codigo) {
                return eAux;
            }
        }

        return null;
    }

    public static void update(Emergencia emergencia) {

        for (Emergencia eAux : emergencias) {

            if (eAux.getCodigo() == emergencia.getCodigo()) {

                eAux.setLocal(emergencia.getLocal());
                eAux.setTipo(emergencia.getTipo());
                eAux.setDescricao(emergencia.getDescricao());

                return;
            }
        }
    }

    public static void delete(Emergencia emergencia) {
        emergencias.remove(emergencia);
    }

    public static List<Emergencia> readAll() {
        return emergencias;
    }
}