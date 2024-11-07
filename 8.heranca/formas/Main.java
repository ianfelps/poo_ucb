public class Main { // classe para execucao e testes

    public static void main(String[] args) {
        // array de para objetos Shape
        Shape[] shapes = new Shape[]{
            new Circle(5),
            new Square(4),
            new Triangle(3, 6),
            new Sphere(3),
            new Cube(2),
            new Tetrahedron(2)
        };

        // processar todas as formas no array
        for (Shape shape : shapes) {
            System.out.println(shape.getDescription()); // descricao da forma

            if (shape instanceof TwoDimensionalShape) { // se for bidimensional
                TwoDimensionalShape twoDShape = (TwoDimensionalShape) shape;
                System.out.println("Area: " + twoDShape.getArea()); // imprime a area
            }

            if (shape instanceof ThreeDimensionalShape) { // se for tridimensional
                ThreeDimensionalShape threeDShape = (ThreeDimensionalShape) shape;
                System.out.println("Area: " + threeDShape.getArea()); // imprime a area
                System.out.println("Volume: " + threeDShape.getVolume()); // imprime o volume
            }

            System.out.println();
        }
    }
}