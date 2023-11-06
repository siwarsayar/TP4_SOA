package serveur;

import jakarta.xml.ws.Endpoint;
import service.CalculatriceWS;

public class ServeurJWS {
    public static void main(String[] args) {
        // Crée une instance de la classe CalculatriceWS, qui est le service web que vous souhaitez publier.
        CalculatriceWS calculatrice = new CalculatriceWS();

        // Définit l'URL à laquelle le service web sera publié.
        String url = "http://localhost:8084/";

        // Publie le service web à l'URL spécifiée en utilisant l'API Endpoint.
        // Cela permet au service web d'être accessible via des requêtes HTTP à cette URL.
        Endpoint.publish(url, calculatrice);

        // Affiche l'URL du service web publié.
        System.out.println("Server url: " + url);
    }
}
