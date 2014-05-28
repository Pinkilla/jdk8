package pit.jdk8;

public class GenderPerson extends Person{
    
    protected Gender gender;

    public GenderPerson(String name, Gender g) {
        super(name);
        gender = g;
    }

    @Override
    public String toString() {
        return "GenderPerson{" + name + ", " + gender + '}';
    }

    /**
     * Hop !
     * J'autorise le changement de sexe.
     * @param g nouveau genre
     */
    public void setGender(Gender g){
        gender = g;
    }





}
