import java.io.*;

public class Cat {
    public static void main(String[] args){
        if(args.length == 0) {
            System.out.println("ファイルの名前入力");
            return;
        } else {
            for(int i=0; i<args.length; i++){
                File file = new File(args[i]);
                run(file);
            }
        }
    }

    private static void run(File file){
        try{
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String str;
            while( true ){
                str = br.readLine();
                if(str == null)break;
                System.out.println(str);
            }
            br.close();
        } catch(FileNotFoundException e) {
            System.out.println("cat: "+file+": "+"ファイルが見つからない");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}