public class FrozenCard extends Card{
    private int numberOfLayers;

    public FrozenCard(Suit suit, Rank rank) {
        super(suit, rank);
        numberOfLayers = 2;
    }

    public void removeLayers(){
        numberOfLayers--;
    }
    public void removeLayers(int number_layers) {numberOfLayers-=number_layers; }

    public int getNumberOfLayers(){
        return numberOfLayers;
    }
}
