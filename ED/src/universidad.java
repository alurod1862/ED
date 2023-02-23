/**
 * @author Iker Rodriguez Montava
 * @version 1.0.0
 */
public class universidad {
    /**
     * @param edad
     */
    public universidad(int edad) {
    }
    /**
     *
     * @param edad
     * @return
     */
    public static String universidad(int edad){
        /**
         * @param edad
         * @param uni
         */
        String uni;
        if (edad >= 18){
            uni = "puedes ir a la universidad";
        }
        else {
            uni = "no puedes ir a la universidad";
        }
        return uni;
    }

}
