package classes;

public class StudentQ6 {
    String name;
    String rollNo;
    Double CGPA;

    public StudentQ6(String name, String rollNo, Double CGPA){
        this.name = name;
        this.rollNo = rollNo;
        this.CGPA = CGPA;
    }

    public Double getPercentage(){
        return 9.5*CGPA;
    }

}
