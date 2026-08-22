package Vector3D_OOP;

public class Programm {

    public static void main(String[] args) {

        System.out.println();

        Vector3D vector1 = new Vector3D(6, 2, 3);
        Vector3D vector2 = new Vector3D(9, 1, 2);

        System.out.println("Вектор 1: " + vector1);
        System.out.println("Вектор 2: " + vector2);
        System.out.println();

        double len1 = vector1.CalcLength();
        double len2 = vector2.CalcLength();
        System.out.println("Длина вектора 1: " + len1 + "   Длина вектора 2: " + len2);
        System.out.println();

        Vector3D sum1 = vector1.Add(vector2);
        Vector3D sum2 = vector2.Add(vector1);
        System.out.println("Сумма векторов 1: " + sum1 + "   Сумма векторов 2: " + sum2);
        System.out.println();

        Vector3D sub1 = vector1.Subtract(vector2);
        Vector3D sub2 = vector2.Subtract(vector1);
        System.out.println("Разность векторов 1: " + sub1 + "   Разность векторов 2: " + sub2);
        System.out.println();

        double scalProd1 = vector1.ScalarProduct(vector2);
        double scalProd2 = vector2.ScalarProduct(vector1);
        System.out.println("Скалярное произведение 1: " + scalProd1 + "   Скалярное произведение 2: " + scalProd2);
        System.out.println();

        Vector3D vectProd1 = vector1.VectorProduct(vector2);
        Vector3D vectProd2 = vector2.VectorProduct(vector1);
        System.out.println("Векторное произведение 1: " + vectProd1 + "   Векторное произведение 2: " + vectProd2);
        System.out.println();

        System.out.println("Массив рандом векторов:");
        Vector3D[] vector3Darr = Vector3D.GenerateRandVectors(5);
        for (int i = 0; i < vector3Darr.length; i++) {
            System.out.println(vector3Darr[i]);
        }
        System.out.println();

        double cos1 = vector1.CosAngle(vector2);
        double cos2 = vector2.CosAngle(vector1);
        System.out.println("Косинус 1: " + cos1 + "   Косинус 2: " + cos2);

    }

}
