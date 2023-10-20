class Emp{
    int empId;
    String empName;
    double empSal;

    void setData(int empId , String empName , double empSal){
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }
    int getEmpId(){
        return this.empId;
    }
    String getEmpName(){
        return empName;
    }
    double getEmpSal(){
        return empSal;
    }

    void show(int empId , String empName , double empSal){
        System.out.println("Emp ID : " + empId + " Emp Name : " + empName + " Emp Sal : " + empSal);
    }

    int add(){
        return 10 + 20;
    }

    int add(int a , int b) {
        return a + b;
    }

}
public class Oops_Practice {
    public static void main(String[] args) {
        Emp e1 = new Emp();
        Emp e2 = new Emp();
        Emp e3 = e1;


        e1.empId = 10;
        e1.empName = "Tejas";
        e1.empSal = 10000;
//        e1.show();

        e2.show(11 ,"Sachin" , 20000);
//        e3.show();

        String s = "Tejas";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());

        System.out.println("----------------------------------------------------------------");

        Emp e4 = new Emp();
        e4.setData(14, "Rohit" ,30000);
        System.out.println(e4.getEmpId());
        System.out.println(e4.getEmpName());
        System.out.println(e4.getEmpSal());

        e1.setData(15, "Rahul" ,40000);
        System.out.println(e1.getEmpId());
        System.out.println(e1.getEmpName());
    }
}
