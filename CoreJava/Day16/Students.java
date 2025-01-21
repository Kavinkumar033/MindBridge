package Day16;
public class Students {
    String name;
    double grade;
    String dept;
    Students(String name,double grade)
    {
        this.name=name;
        this.grade=grade;
    }
    Students(String name,double grade,String dept)
    {
        this.name=name;
        this.grade=grade;
        this.dept=dept;
    }

    public Students() {
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return
                "[name='" + name + '\'' +
                        ", grade=" + grade +"]";
    }
}
