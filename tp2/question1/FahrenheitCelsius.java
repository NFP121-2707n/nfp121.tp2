package question1;
/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter
     * 
     * @param args
     *            ...
     */
    public static void main(String[] args) {
        // pour tous les paramètres de la ligne de commande
        for(int i=0; i<args.length;i++){
            
        int fahrenheit = Integer.valueOf(args[i]);
        float celsius = fahrenheitEnCelsius(Integer.valueOf(args[i]));
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"+i); // ligne,
        }                                                                      // format
                                                                                // imposés
                                                                                
    }

    /**
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
     */
    public static float fahrenheitEnCelsius(int f) {
        float r1=(float)5;
        float r2=(float)9;
        float d1=(float)32;
        float r=(r1/r2)*(f-d1);
        return  (float)(Math.floor(r*10.0)/10.0); // à compléter en remplaçant ce return 0.F par la fonction
                    // de conversion
    }

}
