import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public List<Domino> formChain(List<Domino> dominoesList) throws ChainNotFoundException {
        if(dominoesList.isEmpty())
            return dominoesList;
        ArrayList<Domino> dominoList = new ArrayList<>();
        if (dominoesList.size() == 1)
            if (dominoesList.get(0).getLeft() == dominoesList.get(0).getRight())
                dominoList.add(dominoesList.get(0));
            else
                throw new ChainNotFoundException("No domino chain found.");
        else {
            List<Domino> mutableList = new ArrayList<>(dominoesList);
            Domino firstDomino = mutableList.get(0);
            dominoList.add(firstDomino);
            mutableList.remove(firstDomino);
        }
        return dominoList;
    }
}


/*
if (dominoList.size() != dominoesList.size() ||
                    dominoList.get(0).getLeft() != dominoList.get(dominoList.size() - 1).getRight()) {
                for (Domino d : dominoList) {
                    System.out.println(d.getLeft() + " " + d.getRight() + " ");
                }
                throw new ChainNotFoundException("No domino chain found.");
 */