public class Calculator {
    public float add(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("Numbers cannot be NaN");
        }
        return num1 + num2;
    }
    public float subtract(float num1, float num2) {
        if (Float.isNaN(num1) || Float.isNaN(num2)) {
            throw new IllegalArgumentException("Numbers cannot be NaN");
        }
        return num1 - num2;
    }
    public float divide(float num1, float num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("non divisibile per 0");
        }
        return num1 / num2;
    }
    public float multiply(float num1, float num2) {
        return num1 * num2;
    }
}
