//Program Name : Regular Polygon
//Sourced From : **9.9 (GEOMETRY: N-SIDED REGULAR POLYGON) - Liang Textbook
//Developer : Alex Johnston
//Version 1.1 - 08/28/2024
//**Added UML Diagram 
//
//+------------UML Diagram for M01_4_Polygon------------------------+
//
//+---------------------------------------------------+
//|   M01_4_Polygon     							  |
//+---------------------------------------------------+
//| + main(args: String[]): void                      |
//| - printPolygons(polygons: RegularPolygon[]): void |
//+---------------------------------------------------+
//| +---------------------------------------------------------------+
//| |   RegularPolygon    											|
//| +---------------------------------------------------------------+
//| | - n: int           										    |
//| | - side: double      											|
//| | - x: double         											|
//| | - y: double        											|
//| +---------------------------------------------------------------+
//| | + RegularPolygon() 											|
//| | + RegularPolygon(n: int, side: double) 						|
//| | + RegularPolygon(n: int, side: double, x: double, y: double)  |
//| | + getN(): int       											|
//| | + setN(n: int): void											|
//| | + getSide(): double 											|
//| | + setSide(side: double): void 								|
//| | + getX(): double   										    |
//| | + setX(x: double): void                                       |
//| | + getY(): double                                              |
//| | + setY(y: double): void                                       |
//| | + getPerimeter(): double                                      |
//| | + getArea(): double                                           |
//| +---------------------------------------------------------------+




public class M01_4_Polygon {
    
	public static void main(String[] args) {
        RegularPolygon[] polygons = {
                new RegularPolygon(),
                new RegularPolygon(6, 4),
                new RegularPolygon(10, 4, 5.6, 7.8)
        };
        
        printPolygons(polygons);
    }
	
// Prints out the three polygons along with their area and parameter values
    private static void printPolygons(RegularPolygon[] polygons) {
        for (int i = 0; i < polygons.length; i++) {
            System.out.printf("Polygon-%d [Area: %7.3f, Perimeter: %2.0f]%n",
                    i, polygons[i].getArea(), polygons[i].getPerimeter());
        }
    }

    private static class RegularPolygon {
        private int n = 3;
        private double side = 1;
        private double x = 0;
        private double y = 0;

        RegularPolygon() {
        }

        RegularPolygon(int n, double side) {
            this.n = n;
            this.side = side;
        }

        RegularPolygon(int n, double side, double x, double y) {
            this.n = n;
            this.side = side;
            this.x = x;
            this.y = y;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
        }

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }

        public double getPerimeter() {
            return n * side;
        }

        public double getArea() {
            return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
        }
    }
}