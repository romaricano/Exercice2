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
    Piece tete;
    Piece jupe;
    Piece axe;

    public Piston(Piece tete, Piece jupe, Piece axe) {
        this.tete = tete;
        this.jupe = jupe;
        this.axe = axe;
    }
}

class Machine {
    private int tempsTraitementParPiece;

    public Machine(int tempsTraitementParPiece) {
        this.tempsTraitementParPiece = tempsTraitementParPiece;
    }

    public int getTempsTraitementParPiece() {
        return tempsTraitementParPiece;
    }
}

class MT extends Machine {

    public MT(int tempsTraitementParPiece) {
        super(tempsTraitementParPiece);
    }

    public Piece traiter() {

    }
}

class MP extends Machine {

    public static int nombrePistonsAssembles = 0;

    public int tempsTotalDeTraitementEnSeconde() {
        return getTempsTraitementParPiece() * nombrePistonsAssembles;
    }

    public MP(int tempsTraitementParPiece) {
        super(tempsTraitementParPiece);
    }

    public Piston assembler(Piece tete, Piece jupe, Piece axe) {
        if(tete == null || jupe == null || axe == null) {
            return null;
        }
        nombrePistonsAssembles++;
        return new Piston(tete, jupe, axe);
    }
}

class ChaineDeProduction {
    MP mp;


}




