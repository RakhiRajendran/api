public class JavaExample{
  public static void main(String args[]){
    //two rows and three columns
    String arr[][]={{"anu","anb","anc"},{"df","dd","dd"}};

    //outer loop 0 till number of rows
    for(int i=0;i<2;i++){
      //inner loop from 0 till number of columns
      for(int j=0;j<3;j++){
        System.out.print(arr[i][j]+" ");
      }
      //new line after each row
      System.out.println();
    }
  }
}