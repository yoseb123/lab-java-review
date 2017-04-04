package edu.info448.review;

/**
 * A class representing a gift box containing an object
 */
public class GiftBox<T> {

	private TeddyBear gift; //what is inside the box

	//makes a new gift box containing the gift
	public GiftBox(TeddyBear gift){
		this.gift = gift;
	}

	//unwraps the gift and returns what's inside
	public TeddyBear openGift() {
		return this.gift;
	}

	public void gift() {
		GiftBox<TeddyBear> teddy = new GiftBox<TeddyBear>();
	}
}