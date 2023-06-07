package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int width = height;
        for (int i = 0; i < height / 2; i++) {
            int offset = (height - width) / 2;
            for (int j = 0; j < offset; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < width; j++)
                System.out.print(8);
            for (int j = 0; j < offset; j++)
                System.out.print(' ');
            System.out.println();


            width -= 2;
        }

        if (height % 2 != 0) {
           int offset = (height - width) / 2;
            for (int j = 0; j < offset; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < width; j++)
                System.out.print(8);
            for (int j = 0; j < offset; j++)
                System.out.print(' ');
            System.out.println();
            width+=2;
        }else width+=2;
        for (int i = 0; i < height / 2; i++) {
            int offset = (height - width) / 2;
            for (int j = 0; j < offset; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < width; j++)
                System.out.print(8);
            for (int j = 0; j < offset; j++)
                System.out.print(' ');
            System.out.println();


            width += 2;
        }


    }
}
