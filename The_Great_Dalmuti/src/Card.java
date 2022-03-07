public class Card implements Comparable<Card>{
    int value;
    public Card(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void display(){
        System.out.print(" " + value + " ");
    }

    @Override
    public int compareTo(Card o) {
        return this.getValue() - o.getValue();
    }
}
