import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        student s1=new student();
         Scanner read = new Scanner(System.in);
        System.out.println("Enter Your ID: ");
        s1.id=read.nextInt();
        int sid = s1.id;
        do {
            System.out.println("Select Your Choice :1. New Registration. 2. Attender Detail. 3. Exit");
            int choice = read.nextInt();

            if (choice == 1) {
                    System.out.println("Make a New Register");
                    s1.StInfo();
                }
            else if (choice == 2) {
                System.out.println("Attender Detail");
                Attend a = new Attend();
                a.print();

            } else {
                read.close();
            }sid++;
        }while (s1.id!= sid);




//        System.out.println("choose number 1 for register and 2 for Show :");
//        int c = read.nextInt();
//        if(c==1){
//            System.out.println("New Register");
//            System.out.println("Please Enter your ID :");
//            s1.id=read.nextInt();
//            System.out.println("Please Enter your Name :");
//            s1.Sname=read.next();
//        } else if (c==2) {
//
//
//
//        }else {
//            read.close();
//
//        }
//
//
//        System.out.println(s1.id);

    }
}
class student{

    int id;
    String Sname;


    void  StInfo(){
        Scanner read = new Scanner(System.in);
            System.out.println("Please Enter your ID :");
            id=read.nextInt();
           System.out.println("Please Enter your Name :");
           Sname=read.next();

    }
}


