package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for(int i = 0; i<cathetusLength; i++){
            if(i == 0||i == cathetusLength-1){
                for(int j = 0; j<=i; j++){
                    System.out.print(8);
                }
                System.out.println();
            }else{
                System.out.print(8);
                for(int j = 0; j<i-1; j++)
                    System.out.print(8);
                System.out.println(8);
            }
        }
    }
}
