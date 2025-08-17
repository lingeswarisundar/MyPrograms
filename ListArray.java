import java.io.InputStreamReader;
import java.io.BufferedReader;
class ListArray{
     InputStreamReader isr = new InputStreamReader(System.in);
     BufferedReader br = new BufferedReader(isr);
     int[] array = new int[10];
     int upperBound = -1;
     
     void extendArray() {
          int[] newArray = new int[upperBound*2];
          for (int i =0;i<=upperBound;i++){
               newArray[i] = array[i];
          }
          array = newArray;
     }
     
     void createArray() throws Exception {
          System.out.print("Enter the size :");
          upperBound = Integer.parseInt(br.readLine());
          if(array.length<=upperBound){
               extendArray();
          }
          upperBound = upperBound-1;     
          System.out.println("Enter the elements");
          for (int i=0;i<=upperBound;i++){
               array[i] = Integer.parseInt(br.readLine());
          }      
     }
     
     void insertPositionalElement() throws Exception {
          System.out.print("Enter the Element :");
          int element = Integer.parseInt(br.readLine());
          System.out.println("Enter the position :");
          int position = Integer.parseInt(br.readLine());
          upperBound++;
          if(array.length<=upperBound){
               extendArray();
          }     
          int i = upperBound;
          while(i>position){
              array[i] = array[i-1];
              i--;
          }
          array[position] = element;
     }
     
     void insert () throws Exception{
          System.out.print("Enter the element :");
          int element = Integer.parseInt(br.readLine());
          upperBound++;
          if(array.length<=upperBound){
              extendArray();
          }
          array[upperBound] = element;
     }
     
     void deleteElement() throws Exception{
         System.out.print("Enter the element :");
         int element = Integer.parseInt(br.readLine());
         boolean flag = false;
         for(int i=0;i<upperBound;i++){
             if(array[i]==element||flag){
                  array[i] = array[i+1];
                  flag = true;     
             }
         }        
         upperBound--;
     }
     void delete(){
          upperBound--;
     }
     void print(){
          System.out.print("[ ");
          for(int i=0;i<=upperBound;i++){
              System.out.print(array[i]+" ");
          }
          System.out.print("]\n");
     }     
    void main() throws Exception {
          int choice = -1;
          while (choice!= 7){
               System.out.println("1.CreateList\n2.Insert an element with position\n3.Insert an element\n4.Delete an element\n5.Delete\n6.Print\n7.Exit");
               System.out.print("Enter the choice :");
               choice = Integer.parseInt(br.readLine());
               switch (choice){
                    case 1:
                         createArray();
                         System.out.println("Array Created Succesfully");
                          break;
                    case 2:
                         insertPositionalElement();
                         System.out.println("Element added in a particular position succesfully");
                         break;
                    case 3: 
                         insert();
                         System.out.println("Element added succesfully");
                         break;
                    case 4:
                         deleteElement();
                         System.out.println("Element deleted succesfully");
                         break;
                    case 5:
                         delete();
                         System.out.println("End element deleted succesfully");
                         break;
                    case 6:
                         print();
                         break;
                    case 7:
                         System.out.println("Program Ended Succesfully");
               }
          }                               
     }
     public static void main(String[] args)throws Exception{
           new ListArray().main();
     }
}
