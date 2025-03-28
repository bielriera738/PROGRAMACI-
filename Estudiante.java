public class Estudiante extends Persona {
    private String score;
    private String curs;
    private String assignatures;
    private String escola;
    private String notes;

    // Constructor amb crida a super()
    public Estudiante(int id, int age, String name, String cognom, String adreça, 
                      String score, String curs, String assignatures, String escola, String notes) {
        super(id, age, name, cognom, adreça); // Crida al constructor de Persona
        this.score = score;
        this.curs = curs;
        this.assignatures = assignatures;
        this.escola = escola;
        this.notes = notes;
    }

    // Getters
    public String getScore() {
        return score;
    }

    public String getCurs() {
        return curs;
    }

    public String getAssignatures() {
        return assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public String getNotes() {
        return notes;
    }

    // Setters
    public void setScore(String score) {
        this.score = score;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    // Mètode per imprimir la informació de l'estudiant
    public void printInfo() {
        System.out.println("=== Informació de l'Estudiant ===");
        System.out.println("ID: " + getId());
        System.out.println("Edat: " + getAge());
        System.out.println("Nom: " + getName());
        System.out.println("Cognom: " + getCognom());
        System.out.println("Adreça: " + getAdreça());
        System.out.println("Score: " + getScore());
        System.out.println("Curs: " + getCurs());
        System.out.println("Assignatures: " + getAssignatures());
        System.out.println("Escola: " + getEscola());
        System.out.println("Notes: " + getNotes());
    }
}
