class Box{
	double width;
	double height;
	double depth;
	Box(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	public double volume() {
		return width*height*depth;
	}
}
public class Exercise1 {

	public static void main(String[] args) {
		Box b= new Box(12,2,3);
		double vol;
		vol=b.volume();
		System.out.println(vol);
	}

}
