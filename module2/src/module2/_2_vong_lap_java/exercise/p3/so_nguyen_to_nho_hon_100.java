package module2._2_vong_lap_java.exercise.p3;

public class so_nguyen_to_nho_hon_100 {
    public static void main(String[] args){
        boolean check=true;
        for (int i=2;i<100;i++){
            if (i !=2) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        check = false;
                        break;
                    }
                }
            }
            if (check){
                System.out.println(i);
            }
            check=true;
        }
    }
}
