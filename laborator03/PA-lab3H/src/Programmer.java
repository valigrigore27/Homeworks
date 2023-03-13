public class Programmer extends Person {
    private int experienceYears;

     public Programmer(String name, String birthDate, double height, int experienceYears ){
         super(name,birthDate,height);
         this.experienceYears=experienceYears;
     }
     public int getExperienceYears(){
         return experienceYears;
     }

}
