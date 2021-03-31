package HomeWork.Teme9.DepTeme9;

public class Department {

    private int deptno;
    private String dname;
    private String city;

    public Department(int deptno, String dname, String city) {
        this.deptno = deptno;
        this.dname = dname;
        this.city = city;
    }


    public int getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getCity() {
        return city;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptno=" + deptno +
                ", dname='" + dname + '\'' +
                ", city='" + city + '\'' +
                '}';
    }


}
