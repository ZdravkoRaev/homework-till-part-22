public interface Comparable {

    public void compareTo (Square a, Square b);

}
class ComparableSquare implements Comparable {
    @Override
    public void compareTo (Square a, Square b) {

        if (a.getSideOne() > b.sideOne) {
            System.out.println("The first Square is bigger");
        }
        else{
            if (a.getSideOne() == b.sideOne) {
                System.out.println("The Squares are the same size");
            }
            else{
                System.out.println("The second Square is bigger");
            }
        }
    }

}


