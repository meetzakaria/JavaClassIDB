package Class22.MainVehicle;

public class GridPrint {
    public static void main(String[] args) {
        for (int i = 0; i<60; i++){
            if(i%10==0){
                System.out.println();
            }
            System.out.print("_ ");
        }
    }
}
