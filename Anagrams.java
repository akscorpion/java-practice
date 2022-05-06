import java.util.Scanner;

public class Anagrams {
  static String alphaCount(String str){
      int[] arr = new int[26];
      String count = "";
      for(int i=0; i<str.length(); i++){
          switch(str.charAt(i)){
              case 'a': arr[0] += 1;
                        break;
              case 'b': arr[1] += 1;
                        break;
              case 'c': arr[2] += 1;
                        break;
              case 'd': arr[3] += 1;
                        break;
              case 'e': arr[4] += 1;
                        break;
              case 'f': arr[5] += 1;
                        break;
              case 'g': arr[6] += 1;
                        break;
              case 'h': arr[7] += 1;
                        break;
              case 'i': arr[8] += 1;
                        break;
              case 'j': arr[9] += 1;
                        break;
              case 'k': arr[10] += 1;
                        break;
              case 'l': arr[11] += 1;
                        break;
              case 'm': arr[12] += 1;
                        break;
              case 'n': arr[13] += 1;
                        break;
              case 'o': arr[14] += 1;
                        break;
              case 'p': arr[15] += 1;
                        break;
              case 'q': arr[16] += 1;
                        break;
              case 'r': arr[17] += 1;
                        break;
              case 's': arr[18] += 1;
                        break;
              case 't': arr[19] += 1;
                        break;
              case 'u': arr[20] += 1;
                        break;
              case 'v': arr[21] += 1;
                        break;
              case 'w': arr[22] += 1;
                        break;
              case 'x': arr[23] += 1;
                        break;
              case 'y': arr[24] += 1;
                        break;
              case 'z': arr[25] += 1;
                        break;                                                                             
          }
      }
      for(int i:arr){
          count += i;
      }
      return count;
  }
  
  static boolean isAnagram(String a, String b){
      boolean flag = false;
      
      if(a.length() == b.length()){
          String s1 = alphaCount(a.toLowerCase());
          String s2 = alphaCount(b.toLowerCase());
          if(s1.equals(s2)){
              flag = true;
          }
      }
      return flag;
  }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
