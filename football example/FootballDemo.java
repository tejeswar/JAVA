import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: Nthdimenzion
 * Date: 7/31/13
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class FootballDemo {
    public static void sortTable(String [][] mapTable,int count){
        int goal_temp = 0;
        String team_temp = null;
        for (int j = 0;j < count;j++){
            for (int k = 0;k<count-j-1;k++){
                int goal1 = Integer.parseInt(mapTable[k][1]);
                int goal2 = Integer.parseInt(mapTable[k+1][1]);
                if (goal1 > goal2){
                    goal_temp = goal1;
                    mapTable[k][1] = Integer.toString(goal2);
                    mapTable[k+1][1] = Integer.toString(goal_temp);
                    team_temp =  mapTable[k][0];
                    mapTable[k][0] = mapTable[k+1][0];
                    mapTable[k+1][0] = team_temp;
                }
                System.out.println();
            }
        }
        System.out.println("Highest goal difference is :"+mapTable[count-1][1]+" by "+mapTable[count-1][0]+" team");
        System.out.println("second Highest goal difference is :"+mapTable[count-2][1]+" by "+mapTable[count-2][0]+" team");
        System.out.println("lowest goal difference is :"+mapTable[0][1]+" by "+mapTable[0][0]+" team");
        System.out.println("second lowest goal difference is :"+mapTable[1][1]+" by "+mapTable[1][0]+" team");
    }
    public static void reader()throws Exception{
        String regexPattern1 = "[.][\\s]+[aA-zZ]+";
        String regexPattern2 = "[\\d]{1,2}[\\s]+[-][\\s]+[\\d]{1,2}";
        BufferedReader br = null;
        int diff;
        String sCurrentLine;
        String[][] mapTable = new String[50][2];
        br = new BufferedReader(new FileReader("D://football.txt"));
        int count =0;
        while ((sCurrentLine = br.readLine()) != null) {
            Pattern pattern1 = Pattern.compile(regexPattern1);
            Matcher team_matcher = pattern1.matcher(sCurrentLine);
            Pattern pattern2=Pattern.compile(regexPattern2);
            Matcher goal_matcher=pattern2.matcher(sCurrentLine);
            if (team_matcher.find() && goal_matcher.find()){
                String team = team_matcher.group();
                team = team.replace("."," ");
                String goal = goal_matcher.group();
                String[] data = (goal.trim()).split("-");
                int for_goal = Integer.parseInt(data[0].trim());
                int against_goal = Integer.parseInt(data[1].trim());
                diff = (for_goal > against_goal  ? for_goal - against_goal:against_goal - for_goal);
                mapTable[count][0] = team.trim();
                mapTable[count][1] =Integer.toString(diff);
                count++;
            }
        }
        sortTable(mapTable,count);
    }
    public static void main(String[] arg)throws Exception{
        reader();
    }
}
