import java.util.Scanner;

class Employee {
    String Emp_name;
    String Emp_id;
    String Address;
    String Mail_id;
    String Mobile_no;
    
    void details () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        Emp_name = sc.nextLine();
        System.out.print("Enter your id :");
        Emp_id = sc.nextLine();
        System.out.print("Enter your Address :");
        Address = sc.nextLine();
        System.out.print("Enter your MailId :");
        Mail_id = sc.nextLine();
        System.out.print("Enter your Moblie no :");
        Mobile_no = sc.nextLine();
    }
    
    void paySlip(String designation,int bp) {
        float da = 0.5F*bp;
        float hra = 0.1F*bp;
        float pf = 0.12F*bp;
        float grossSalary = bp+da+hra+pf;
        System.out.println("\n[           Salary Slip            ]");
        System.out.println("Employee Name         :"+Emp_name);
        System.out.println("Employee id           :"+Emp_id);
        System.out.println("Employee Address      :"+Address);
        System.out.println("Employee MAilId       :"+Mail_id);
        System.out.println("Employee Moblie no    :"+Mobile_no);
        System.out.println("Employee Designation  :"+designation);
        System.out.println("Employee Salary       :"+grossSalary);
    }  
}

class Programmer extends Employee {
     void salaryDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Programmer Basic Pay :");
        int bp = sc.nextInt();
        super.paySlip("Programmer",bp);
     }
}

class Professor extends Employee {
    void salaryDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Professor Basic Pay :");
        int bp = sc.nextInt();
        super.paySlip("Professor",bp);
     }
}

class AssistentProfessor extends Employee {
    void salaryDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter AssistentProfessor Basic Pay :");
        int bp = sc.nextInt();
        super.paySlip("AssistentProfessor",bp);
     }
}

class PaySlipForEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Programmer 2.Professor 3.AssistentProfessor 4.Exit");
        int choice = 0;
        while(choice!=4) {
           System.out.print("Enter your desigantion choice :");
           choice = sc.nextInt();
           switch(choice) {
               case 1:
                   Programmer pg = new Programmer();
                   pg.details();
                   pg.salaryDetails();
                   break;
               case 2:
                   Professor pf = new Professor();
                   pf.details();
                   pf.salaryDetails();
                   break;
               case 3:
                   AssistentProfessor apf = new AssistentProfessor();
                   apf.details();
                   apf.salaryDetails();
                   break;
               case 4:
                    System.out.println("Program Ended...");    
           }
       }
   }                
}
