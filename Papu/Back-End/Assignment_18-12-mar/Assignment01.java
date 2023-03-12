//remove white space from an string
public class Assignment01
{
    public static void main(String[] args) {
        String name="My name is Sunil";
        System.out.println(removeWhiteSpace(name));
    }
    public static String removeWhiteSpace(String name)
    {
        char[] str=name.toCharArray();
        String result="";
        for(int i=0;i<str.length;i++)
        {
            if(name.charAt(i)==' ')
            {
                continue;
            }
            else{
                result=result+name.charAt(i);
            }
        }
        return result;
    }
}