package com.Breno.campsolidarium.controller;

import com.Breno.campsolidarium.repository.InsumoRepository;
import com.Breno.campsolidarium.model.Insumo;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.util.List;

@WebServlet(name = "Insumos", urlPatterns = {"/Insumos"})
public class Insumos extends HttpServlet {

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        List<Insumo> insumos =
                InsumoRepository.readAll();

        request.getSession().setAttribute(
                "insumos",
                insumos
        );

        response.sendRedirect("insumos.jsp");
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        int codigo =
                Integer.parseInt(request.getParameter("codigo"));

        String nome =
                request.getParameter("nome");

        String marca =
                request.getParameter("marca");

        String categoria =
                request.getParameter("categoria");

        Insumo insumo = new Insumo();

        insumo.setCodigo(codigo);
        insumo.setNome(nome);
        insumo.setMarca(marca);
        insumo.setCategoria(categoria);

        InsumoRepository.create(insumo);

        HttpSession session = request.getSession();

        session.setAttribute(
                "msg",
                "Insumo cadastrado com sucesso!"
        );

        response.sendRedirect("cadastroInsumo.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Servlet de Insumos";
    }
}