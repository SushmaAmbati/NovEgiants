
public class TestComposition {

	public static void main(String[] args) {
	Body body = new Body(2,"Black");
    Heart heart = new Heart(4,4,"Oval");
    body.setHeart(heart); 
    heart.setBody(body); 
    System.out.println("Body has heart which has "+body.getHeart().getNoOfArteries()+" Arteries and "+body.getHeart().getNoOfVentricles()+" Ventricles");
	System.out.println("Heart is in the body which has "+heart.getBody().getNoOfLegs()+" legs and "+heart.getBody().getEyeColor()+" eye color");
	}
	

}
