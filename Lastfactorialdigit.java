import java.util.*;
class Lastfactorialdigit{
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int n=kbd.nextInt();
    int a,tot=1;
    for(int i=0;i<n;i++){
      a=kbd.nextInt();
      tot=1;
      for(int j=a;j>=1;j--) {
          tot=tot*j;
      }
      if(tot<=10){
          System.out.println(tot);
      }
      else{
        System.out.println(tot%10);
      }
    }
    
  }
}
