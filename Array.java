import java.util.Scanner;
class Array{
        public static void main(String args[]){
                Scanner sc= new Scanner (System.in);
           int [][] Array1= new int[3][3];
           int [][] Array2= new int[3][2];
           int [][] Array3= new int[3][2];

         //taking input elements for Array1
         System.out.println("Enter the First Array Elements: ");
         for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                        Array1[i][j]=sc.nextInt();

                }
         }
         // Printing the elements of Array1.
         System.out.println("The First Array Elemenets are: ");
          for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                        System.out.print(Array1[i][j] + " ");

                }
                System.out.println();
         }

         //taking input elements for Array2.

         System.out.println("enter the Second Array Elements: ");
          for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){
                        Array2[i][j]=sc.nextInt();

                }
         }
         // Printing the elements of Array2.

         System.out.println("The Second Array Elements are: ");
         for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){
                        System.out.print(Array2[i][j] + " ");

                         }      
                         System.out.println();
                            }
          int sum=0;
          // Multiplication of  two 2D Array or Matrix
         for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){ 

                        sum=0;
                   for(int k=0;k<3;k++){
                         
                          sum=sum+Array1[i][k]*Array2[k][j];
                    }
                    Array3[i][j]=sum;

         }
         }

         //Printing the output of Multiplication 

         System.out.println("The Third Array is:");
          for(int i=0;i<3;i++){
                for(int j=0;j<2;j++){
                        System.out.print(Array3[i][j] + " ");
                }
                                         System.out.println();

          }

        }}