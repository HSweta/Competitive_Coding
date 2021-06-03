//import java.util.*;
//public class Main {
//    public static void main (String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int t = sc.nextInt();
//
//       while(t-->0){
//           int n = sc.nextInt();
//            
//           int[] arr = new int[n] ;
//
//           for(int i=0;i<arr.length;i++)
//             arr[i]=sc.nextInt();
//
//             Check(arr);
//           
//           }
//
//       }
//    
//
//    public static void Check(int[] arr){
//
//        Queue<Integer> q = new LinkedList<>();
//        boolean flag = true;
//        int c1 = 0;
//        int c2 = 0;
//           for(int i=0;i<arr.length;i++){
//               if(arr[i]==1){
//                   q.add(1);
//                   c1++;
//               }else{
//                   if(q.peek()!=null)
//                       q.remove();
//                       c2++;
//                    else{
//                         flag = false;
//                         break;
//                     }  
//               }
//           }
//          int s1 = q.size();
//          if(c1-c2>0 ){
//               System.out.println("Valid");
//          }else{
//           System.out.println("Invalid");
//          }
//    
//    }
//}