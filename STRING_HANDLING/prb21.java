package STRING_HANDLING;

import java.util.Scanner;

//21.Read three strings. Print 1 if first string is biggest, 2 if second string is biggest,
// 3 if 3rd string is biggest, 0 if all are same, -1 if 1st and 2nd string are biggest,
// -2 if 2nd and 3rd string are biggest, -3 if 1st and 3rd string are biggest.
public class prb21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();

if(s1.length()==s2.length()){
    if (s2.length()==s3.length()){
        System.out.println(0);
    }
}
else if(s1.length()>s2.length()){
 if(s2.length()>s3.length()){
     System.out.println(1);
 }
}
else if (s2.length()>s3.length()){
   if (s3.length()>s1.length()){
       System.out.println(2);
   }
}
else if (s3.length()>s2.length()){
    if (s2.length()>s1.length() ){
        System.out.println(3);
    }
}

else if (s1.length()>s2.length() ){
    if (s2.length() >s3.length() ){
        System.out.println(-1);
    }
}

else if(s2.length()>s3.length() ){
    if (s3.length()>s1.length() ){
        System.out.println(-2);
    }

}
else if(s3.length()>s2.length()){
    if (s2.length()>s1.length()){
        System.out.println(-3);
    }
}
}
//if (s3.length()>s1.length() ||s1.length()>s3.length()){








}





/* if(s1.length()==s2.length()){
            if (s3.length()==s2.length()){
                System.out.println(0);
            }
            else {
                System.out.println(-1);
            }
        }

      else if(s2.length()==s3.length()){
          if (s3.length()==s1.length()){
              System.out.println(0);
          }
          else{
              System.out.println(-2);
          }
      }

      else if(s1.length()==s3.length()){
          if (s3.length()==s2.length()){
              System.out.println(0);
          }
          else{
              System.out.println(-3);
          }
      }

      else if (s3.length()>s2.length()){
          if ((s2.length()>s1.length())){
              System.out.println(3);
          }
      }
        else if(s1.length()>s2.length()){
            if (s2.length()>s3.length()){
                System.out.println(1);
            }

        }
        else if(s2.length()>s3.length()){
            if (s3.length()>s1.length()){
                System.out.println(2);
            }
        }
*/