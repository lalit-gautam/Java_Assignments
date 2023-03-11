import java.util.Arrays;

public class JavaMomTeam {
    public static void main(String[] args) {
    String[] javaTeam = {
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
            "Kriti Kumar Behera",
            "Shrutismita Mishra"
    };

    Arrays.sort(javaTeam);//for alphabetical order

    solution(javaTeam, 0, javaTeam.length-1, 1);
    }

    static void solution(String[] javaTeam, int start, int end, int i){
        
    if(start < end){
        if(i % 2 != 0){
            System.out.println(javaTeam[start]);
            solution(javaTeam, start + 1, end, i + 1 );
        } else {
            System.out.println(javaTeam[end]);
            solution(javaTeam, start, end - 1, i + 1);
        }
    }
    
    }
}
