package Words;

import java.io.*;

public class Words {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("C:\\Users\\loban\\wasp_tst\\russian.txt"), "Windows-1251");
        BufferedReader reader = new BufferedReader(isr);
        //BufferedWriter fileWriter = new BufferedWriter(new FileWriter("C:\\Users\\loban\\IdeaProjects\\Matrix\\src\\Words\\FiveLettersWords.txt"));
        int count = 0;
        while(reader.ready()){
            String str = reader.readLine().toLowerCase();
            //outer:
            if(str.length() == 11 && str.charAt(0) != 'б' && str.charAt(3) != 'о' && str.charAt(5) != 'у' && str.charAt(6) != 'л' && str.charAt(6) != 'п' && str.charAt(8) != 'ц' && str.charAt(4) == 'к'){
                System.out.println(str);
//                for(int i = 0; i < str.length(); i++){
//                    if(!Character.isLetter(str.charAt(i))){
//                        break outer;
//                    }
//                }
                count++;
//                fileWriter.write(str.toLowerCase() + "\n");
//                System.out.println(str);
            }
        }
        reader.close();
        //fileWriter.close();
        System.out.println(count);
    }
}
