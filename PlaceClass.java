public class Place {
	private String placeName;
	private Character[] peopleInPlace;

	public void addPersonInPlace(Character person) {
		peopleInPlace.add(person);
	}
	
	public Place(String name) {
		placeName = name;
	}
}
