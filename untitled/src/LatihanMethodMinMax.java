import java.util.Arrays;

public class LatihanMethodMinMax {
    public static String HighLow (String str){
        String[] baru=str.split(" ");
        int[] hasil=new int[baru.length];
        for (int index =0; index< baru.length;index++){
            hasil[index]=Integer.parseInt(baru[index]);
        }
        Arrays.sort(hasil);

        String Max = String.valueOf(Arrays.stream(hasil).max());
        String Min = String.valueOf(Arrays.stream(hasil).min());

        return Max + " " + Min;
    }
    public static void main(String[] args) {
        System.out.println(HighLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
