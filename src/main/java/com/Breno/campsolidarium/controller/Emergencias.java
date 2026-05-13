/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Breno.campsolidarium.controller;
import com.Breno.campsolidarium.model.Emergencia;
import com.Breno.campsolidarium.repository.EmergenciaRepository;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.List;

/**
 *
 * @author breno
 */
@WebServlet(name = "Emergencias", urlPatterns = {"/Emergencias"})
public class Emergencias extends HttpServlet {

  
    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        List<Emergencia> emergencias =
                EmergenciaRepository.readAll();

        request.getSession().setAttribute(
                "emergencias",
                emergencias
        );

        response.sendRedirect("emergencias.jsp");
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        int codigo =
                Integer.parseInt(request.getParameter("codigo"));

        String local =
                request.getParameter("local");

        String tipo =
                request.getParameter("tipo");

        String descricao =
                request.getParameter("descricao");

        Emergencia emergencia = new Emergencia();

        emergencia.setCodigo(codigo);
        emergencia.setLocal(local);
        emergencia.setTipo(tipo);
        emergencia.setDescricao(descricao);

        EmergenciaRepository.create(emergencia);

        HttpSession session = request.getSession();

        session.setAttribute(
                "msg",
                "Emergência cadastrada com sucesso!"
        );

        response.sendRedirect("cadastroEmergencia.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Servlet de Emergências";
    }
}