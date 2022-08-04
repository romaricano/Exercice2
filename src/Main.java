public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class Piece {

}

class Tete extends Piece {

}

class Jupe extends Piece {

}

class Axe extends Piece {

}

class Piston {
    Tete tete;
    Jupe jupe;
    Axe axe;
}

class Machine {
    private int tempsTraitementParPiece;

    public Machine(int tempsTraitementParPiece) {
        this.tempsTraitementParPiece = tempsTraitementParPiece;
    }
}




