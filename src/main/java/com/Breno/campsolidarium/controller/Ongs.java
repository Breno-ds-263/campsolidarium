/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.Breno.campsolidarium.controller;

import com.Breno.campsolidarium.repository.OngRepository;
import com.Breno.campsolidarium.model.Ong;
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
@WebServlet(name = "Ongs", urlPatterns = {"/Ongs"})
public class Ongs extends HttpServlet {
 @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {

        List<Ong> ongs = OngRepository.readAll();

        request.getSession().setAttribute("ongs", ongs);

        response.sendRedirect("ongs.jsp");
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

        String login =
                request.getParameter("login");

        String senha =
                request.getParameter("senha");

        Ong ong = new Ong();

        ong.setCodigo(codigo);
        ong.setNome(nome);
        ong.setLogin(login);
        ong.setSenha(senha);

        OngRepository.create(ong);

        HttpSession session = request.getSession();

        session.setAttribute(
                "msg",
                "ONG cadastrada com sucesso!"
        );

        response.sendRedirect("cadastroOng.jsp");
    }

    @Override
    public String getServletInfo() {
        return "Servlet de ONGs";
    }
}