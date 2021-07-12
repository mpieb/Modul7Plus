package Mod7Exer2Fase1;

public class NewMain {

    public static void main(String[] args) {
        Vehicle camio = new Camio("1234", "MOT", "Megasso", "Blanc");
        try{
        camio.setMatriculaNombre("12345");
        }catch(Exception e){
            System.out.println("S´han de possar cuatre nombres enters a la matrícula!");
        }
        try{
        camio.setMatriculaChar("HOT");   
        }catch(Exception e){
            System.out.println("S´han de possar dos o tres lletres majúscules a la matrícula!");
        }
        
        System.out.println(camio);
    }
}
