package ej2;

public class Main {

    public static void main(String[] args) {
        
        // Creación de arrays de Videojuegos y Series
        Videojuego[] Videojuegos = new Videojuego[5];
        
        Videojuegos[0] = new Videojuego();
        Videojuegos[1] = new Videojuego("The Witcher", 50);
        Videojuegos[2] = new Videojuego("Elden Ring", 100);
        Videojuegos[3] = new Videojuego("Minecraft", 500, "Sandbox", "Mojang");
        Videojuegos[4] = new Videojuego("LoL", 434434, "MOBA", "Riot");

        Serie[] Series = new Serie[5];
        
        Series[0] = new Serie();
        Series[1] = new Serie("GOT", "GRRm");
        Series[2] = new Serie("TWD", "Pepe Viyuela");
        Series[3] = new Serie("The Witcher", 2, "Lucha", "Rothfus");
        Series[4] = new Serie("Julandri", 6, "Amor", "Juanito");

        // Entregar algunos videojuegos y series
        Videojuegos[1].entregar();
        Series[3].entregar();

        // Contar entregados
        int countVideojuegosEntregados = 0;
        int countSeriesEntregadas = 0;

        for (Videojuego v : Videojuegos) {
            if (v.isEntregado()) {
                countVideojuegosEntregados++;
            }
        }

        for (Serie s : Series) {
            if (s.isEntregado()) {
                countSeriesEntregadas++;
            }
        }

        System.out.println("Videojuegos entregados: " + countVideojuegosEntregados);
        System.out.println("Series entregadas: " + countSeriesEntregadas);

        // Mostrar el videojuego con más horas y la serie con más temporadas
        Videojuego maxHoras = Videojuegos[0];
        for (Videojuego v : Videojuegos) {
            if (v.getHorasEstimadas() > maxHoras.getHorasEstimadas()) {
                maxHoras = v;
            }
        }

        Serie maxTemporadas = Series[0];
        for (Serie s : Series) {
            if (s.getNumeroTemporadas() > maxTemporadas.getNumeroTemporadas()) {
                maxTemporadas = s;
            }
        }

        System.out.println("Videojuego con más horas: " + maxHoras);
        System.out.println("Serie con más temporadas: " + maxTemporadas);
    }
}
