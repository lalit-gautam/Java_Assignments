
import java.util.Arrays;

public class JavaMOMProgram {
    static String[] javaTeam = {
            "Abhay Kumar Jena",
            "Abhay Ranasingh",
            "Abinash Pradhan",
            "Aruna Kumar Dash",
            "Arupandnda Pal",
            "Aswini Kumar Biswal",
            "Bibekanand Pradhan",
            "Chandan Kumar Das",
            "Hemendra Sethi",
            "Nidhi Jha",
            "Rahul Anand",
            "Sandhyarani Biswa",
            "Saumya Ranjan Giri",
            "Shilpashree Panigrah",
            "Smruti Ranjan Jena",
            "Soumya Ranjan Pala",
            "Subham Ashutosh Samantaray",
            "Subrat Mohapatra",
            "Sushant Kumar Rout",
            "Truptimayyee mandal",
            "Papu Sahoo",
            "Jiten Pal",
            "Lalit Gautam",
            "Kriti Kumar Behera"
    };

    public static void main(String[] args) {
        Arrays.sort(javaTeam);
    //    for(int i=0;i<javaTeam.length;i++){
    //        javaTeam[i] = javaTeam[i]+" "+i;
    //    }
        System.out.println();
        for(String member: getJavaMomSequence(javaTeam)){
            System.out.println(member);
        }
    }

    public static String[] getJavaMomSequence(String[] javateam){
        int start = 0;
        int end = javateam.length-1;
        String[] sequence = new String[javateam.length];
        for(int i=0;i<javateam.length;i++){
            if(i%2==0){
                sequence[i] = javateam[start];
                start++;
            }else{
                sequence[i] = javateam[end];
                end--;
            }
        }
        // for(int i=0;i<javateam.length;i++){
        //     if(i%2==0){
        //         sequence[start] = javateam[i];
        //         start++;
        //     }
        //     else{
        //         sequence[end] = javateam[i];
        //         end--;
        //     }
        // }
        return sequence;

    }


}
