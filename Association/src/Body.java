
public class Body {
private int noOfLegs;
private String eyeColor;
private Heart heart;
public Body() {
	
}
public Body(int noOfLegs, String eyeColor) {
	super();
	this.noOfLegs = noOfLegs;
	this.eyeColor = eyeColor;
}
public int getNoOfLegs() {
	return noOfLegs;
}
public void setNoOfLegs(int noOfLegs) {
	this.noOfLegs = noOfLegs;
}
public String getEyeColor() {
	return eyeColor;
}
public void setEyeColor(String eyeColor) {
	this.eyeColor = eyeColor;
}
public Heart getHeart() {
	return heart;
}
public void setHeart(Heart heart) {
	this.heart = heart;
}


}
