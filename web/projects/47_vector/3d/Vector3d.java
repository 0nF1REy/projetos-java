public class Vector3d {
    private float x, y, z;

    // Construtor que inicializa as coordenadas do vetor
    public Vector3d(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Calcula o produto interno (dot product) entre este vetor e outro vetor
    public float dot(Vector3d other) {
        return this.x * other.x + this.y * other.y + this.z * other.z;
    }

    // Calcula a magnitude (comprimento) do vetor
    public float magnitude() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ", " + z + ")";
    }
}
