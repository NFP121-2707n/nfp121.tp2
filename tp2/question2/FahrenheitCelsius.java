package question2;


/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un num�ro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entr�e de cette application, 
      * dont le commentaire est � compl�ter
      *
      *  @param args ...
      */
     public static void main(String[] args){
        for(int i=0; i<args.length;i++){
            try{
        int fahrenheit = Integer.valueOf(args[i]);
        float celsius = fahrenheitEnCelsius(Integer.valueOf(args[i]));
        System.out.println(fahrenheit + "\u00B0F -> " + celsius + "\u00B0C"); // ligne,
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
         } 
         
       
     }
     
     /** 
      * la m�thode � compl�ter. 
      *   @param f la valeur en degr� Fahrenheit
      *   @return  la conversion en degr� Celsius
      */
     //parse and take string in input , parsing will throw the error
     public static float fahrenheitEnCelsius( int f) throws NumberFormatException{
       try{
        float r1=(float)5;
        float r2=(float)9;
        float d1=(float)32;
        float r=(r1/r2)*(f-d1);
        return  (float)(Math.floor(r*10.0)/10.0); 
        }
       catch(NumberFormatException nfe){
        throw new NumberFormatException();
        }
       
     }

}
