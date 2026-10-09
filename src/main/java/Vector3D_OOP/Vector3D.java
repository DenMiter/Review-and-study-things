package Vector3D_OOP;

import java.util.Random;

public class Vector3D {

    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public static Vector3D[] GenerateRandVectors(int N) {
        Vector3D[] vector3Darr = new Vector3D[N];
        for (int i = 0; i < N; i++) {

            Random random = new Random();
            int x = random.nextInt(10);
            int y = random.nextInt(10);
            int z = random.nextInt(10);

            vector3Darr[i] = new Vector3D(x, y, z);
        }
        return vector3Darr;
    }

    public double CalcLength() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));

    }

    public double ScalarProduct(Vector3D other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    public Vector3D VectorProduct(Vector3D other) {
        return new Vector3D(this.y * other.z - this.z * other.y, this.z * other.x - this.x * other.z,
                this.x * other.y - this.y * other.x);
    }

    public double CosAngle(Vector3D other) {
        return this.ScalarProduct(other) / (this.CalcLength() * other.CalcLength());
    }

    public Vector3D Add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public Vector3D Subtract(Vector3D other) {
        return new Vector3D(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    @Override
    public String toString() {
        return ("( " + x + ", " + y + ", " + z + " )");
    }

}
