public class RussianMultiplication {

    public static Integer operation(Integer multiplicador, Integer multiplicando) {
        int result = 0;
        if (multiplicador == 0 || multiplicando == 0) {
            return result;
        }
        while (multiplicador != 1 && multiplicador != -1){
            if (multiplicador % 2 != 0) {
                result += multiplicando;
            }
            multiplicador /= 2;
            multiplicando *= 2;
        }
        if (multiplicador < 0 && multiplicando < 0) {
            result += multiplicando;
            return -result;
        }
        result += multiplicando;
        return result;
    }
}
