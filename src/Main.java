import java.util.InputMismatchException;

void main(String[] args) {
    Scanner in = new Scanner(System.in);

    boolean size = true;
    int fSize = 0;
        while (size) {

                try {

                    System.out.printf("Введите высоту фигур: %n");
                    fSize = in.nextInt();
                    if (fSize<=0) {
                        System.out.printf("Число должно быть больше 0! %n");
                        continue;
                    } else {
                        size = false;
                    }
                } catch (InputMismatchException e) {
                    System.out.printf("Ошибка ввода! %n");
                    in.next();
                    continue;
                }

        }
        System.out.printf("Квадрат %n");
        for (int i = 0; i < fSize; i++) {
            for (int j = 0; j < fSize; j++) {
                System.out.printf("* ");
            }
            System.out.printf("%n");
        }

        System.out.printf("Треугольник %n");
        for (int i = 1; i < fSize+1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("* ");
            }
            System.out.printf("%n");
        }

    System.out.printf("Перевернутый треугольник %n");
    for (int i = 1; i < fSize+1; i++) {
        for (int j = fSize+1; j > i; j--) {
            System.out.printf("* ");
        }
        System.out.printf("%n");
    }
    in.close();
}
