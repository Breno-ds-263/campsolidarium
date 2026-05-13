package com.Breno.campsolidarium.repository;
import com.Breno.campsolidarium.model.Insumo;
import com.Breno.campsolidarium.model.Ong;


import java.util.ArrayList;
import java.util.List;

public class OngRepository {

    private static final List<Ong> ongs = new ArrayList<>();

    public static void create(Ong ong) {
    ongs.add(ong);
}

    private OngRepository() {

    }

    public static Ong read(int codigo) {

        for (Ong oAux : ongs) {

            if (oAux.getCodigo() == codigo) {
                return oAux;
            }
        }

        return null;
    }

    public static void update(Ong ong) {

        for (Ong oAux : ongs) {

            if (oAux.getCodigo() == ong.getCodigo()) {

                oAux.setNome(ong.getNome());
                oAux.setLogin(ong.getLogin());
                oAux.setSenha(ong.getSenha());

                return;
            }
        }
    }

    public static void delete(Ong ong) {
        ongs.remove(ong);
    }

    public static List<Ong> readAll() {
        return ongs;
    }
}