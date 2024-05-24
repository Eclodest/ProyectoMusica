package com.example.ProyectoMusica.controller;

import com.example.ProyectoMusica.service.ServicioCancion;
import com.example.ProyectoMusica.service.ServicioListaReproduccion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Roxana
 * @date 18/04/2024
 */
//ruta url http://localhost:8080/tablero
@Controller
@RequestMapping("/tablero")
public class HomeController {
    ServicioCancion servicioCancion = new ServicioCancion();
    ServicioListaReproduccion servicioListaReproduccion = new ServicioListaReproduccion();
    @GetMapping("")
    public String someMethod() {
        return "./musicmatch/tableroU"; // This should match the file name without the .html extension
    }
    @GetMapping("/")
  /* public String crud(Model model) {
        String valorfinal = "./musicmatch/home";
        try {
            model.addAttribute("canciones", servicioCancion.listarAllCanciones());
            model.addAttribute("listasDeReproduccion", servicioListaReproduccion.listarAllListaReproduccion());
        } catch (Exception ex) {
            Logger.getLogger(HomeController.class.getName()).log(Level.SEVERE, null, ex);
            valorfinal = "error";
        }
        return valorfinal;
    }*/

        public String home(Model model) {
            String valorfinal = "tableroU";
            try {
                model.addAttribute("canciones", servicioCancion.listarAllCanciones());
                model.addAttribute("listasDeReproduccion", servicioListaReproduccion.listarAllListaReproduccion());
            } catch (Exception ex) {
                Logger.getLogger(com.example.ProyectoMusica.controller.HomeController.class.getName()).log(Level.SEVERE, null, ex);
                valorfinal = "error";
            }
            return valorfinal;
        }

}


