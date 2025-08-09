public class Vector2d {
    private float x, y;

    // Construtor que inicializa as coordenadas do vetor 2D
    public Vector2d(float x, float y) {
        this.x = x;
        this.y = y;
    }

    // Calcula o produto interno (dot product) entre este vetor e outro vetor 2D
    public float dot(Vector2d other) {
        return this.x * other.x + this.y * other.y;
    }

    // Calcula a magnitude (comprimento) do vetor 2D
    public float magnitude() {
        return (float) Math.sqrt(x * x + y * y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
