public class Line{
	private Point begin;
	private Point end;
	
	public Line(Point begin,Point end){
		this.begin=begin;
		this.end=end;
	}
	public Line(int beginX,int beginY,int endX,int endY){
		this.begin=new Point(beginX,beginY);
		this.end=new Point(endX,endY);
	}
	public Point getBegin(){
		return begin;
	}
	public Point getEnd(){
		return end;
	}
	public void setBegin(Point begin){
		this.begin=begin;
	}
	public void setEnd(Point end){
		this.end=end;
	}
	public int getBeginX(){
		return begin.getX();
	}
	public int getBeginY(){
		return begin.getY();
	}
	public int getEndX(){
		return end.getX();
	}
	public int getEndY(){
		return end.getY();
	}
	public void setBeginX(int x){
		this.begin.setX(x);
	}
	public void setBeginY(int y){
		this.begin.setY(y);
	}
	public void setBeginXY(int x,int y){
		this.begin.setX(x);
		this.begin.setY(y);
	}
	public void setEndX(int x){
		this.end.setX(x);
	}
	public void setendY(int y){
		this.end.setY(y);
	}
	public void setEndXY(int x,int y){
		this.end.setX(x);
		this.end.setY(y);
	}
	public String toString(){
		return "Points :"+begin+" ,  "+end;
	}
	public double getLength(){
		return Math.sqrt((this.begin.getX()-this.end.getX())*(this.begin.getX()-this.end.getX())+
		(this.begin.getY()-this.end.getY())*(this.begin.getY()-this.end.getY()));
	}
	public double getGradient(){
		double a =this.end.getY()-this.begin.getY();
		double b =this.end.getX()-this.begin.getX();
		return a/b;
		
	}
}
