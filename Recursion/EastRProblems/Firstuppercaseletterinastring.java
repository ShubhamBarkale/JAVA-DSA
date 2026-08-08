public class Firstuppercaseletterinastring{

 public static void main(String[] args) {
       String str = "shubham  Barkale";
       char res = first(str,0);
       if (res==0){
        System.out.print("char  not found");
       }
       else{
         System.out.print("char found :-"+res);
       }
 }
 static char first(String str,int index){
    if(str.length()==index){
        return 0;
    }

    if(Character.isUpperCase(str.charAt(index))){
        return str.charAt(index);
    }
    return first(str, index+1);
 }
}