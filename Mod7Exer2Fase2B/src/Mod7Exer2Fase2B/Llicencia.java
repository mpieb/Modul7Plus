package Mod7Exer2Fase2B;

//Definició de clase
public class Llicencia {
    //Variables 
    private String id;
    private String tipusLlicencia;
    private String nomComplet;
    private String dataCaducitat;
    
    //Constructor
    public Llicencia(String id, String tipusLlicencia, String nomComplet, String dataCaducitat){
        this.id = id;
        this.tipusLlicencia = tipusLlicencia;
        this.nomComplet = nomComplet;
        this.dataCaducitat = dataCaducitat;
    }
    
    //Setters i getters
    public void setId (String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void setNomComplet(String nomComplet){
        this.nomComplet = nomComplet;
    }
    
    public String getNomComplet(){
        return nomComplet;
    }
    
    public void setDataCaducitat(String dataCaducitat){
        this.dataCaducitat = dataCaducitat;
    }
    
    public String getDataCaducitat(){
        return dataCaducitat;
    }
}
