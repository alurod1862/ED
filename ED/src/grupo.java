/**
 * @author Iker Rodriguez Montava
 * @version 1.0.0
 */
public class grupo {
    /**
     *
     * @param edad
     */
    public grupo(int edad) {
    }
    /**
     * @param edad
     * @return
     *
     */
    public static String grupo(int edad) {
        /**
         * @param rangoEdad
         * @param edad
         */
        String rangoEdad;
        if(edad >= 18) {
            rangoEdad = "universitario";
        } else if (edad >= 12) {
            rangoEdad = "estudiante de secundaria";
        } else {
            rangoEdad = "estudiante de infantil";
        }
        return rangoEdad;
    }

}
