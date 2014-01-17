package javatasks;

public class VarArgsExample

{

        public static void main(String args[])

        {

                concat("Adaptavant","technology","solutions",".","a-cti",".","com");

                concat("Gopal ","Krishnan");

        }

 

        public static void concat(String... s)

        {

        String temp="";

                for(int i=0;i<s.length;i++)

                {
                temp+=s[i];
                }

        System.out.println(temp);
        System.out.println(""+s.length);
        }
        

}