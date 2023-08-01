// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

         phone p = new phone();


         p.color = "black";
         p.system1 = "ios ";
         p.model =  2023  ;
         p.size = 67;
         p.name = "pro Max ";


        System.out.println("Name of phone : "+p.name);
        System.out.println("Model of phone  : "+ p.model);
        System.out.println("system of phone  : "+ p.system1);
        System.out.println("color of phone  : "+p.color);
        System.out.println("size of of phone : "+p.size);






        }







    }
class phone {

    int model;
    String system1;
    String color;
    int size;
    String name;

}