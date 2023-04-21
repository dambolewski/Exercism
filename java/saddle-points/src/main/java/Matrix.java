import java.util.*;

class Matrix {

    final Set<MatrixCoordinate> saddlePoints = new HashSet<>();

    Matrix(List<List<Integer>> values) {

        //Loop over rows
        for (int i = 0; i < values.size(); i++) {

            //Taking rows values stored in List<Integer> to keep values in same format
            //[9, 8, 7]
            //[5, 3, 2]
            //[6, 6, 7]
            List<Integer> row = values.get(i);

            //Taking max value from each List<Integer> row
            //9
            //5
            //7
            int rowMax = Collections.max(row);

            //Creating indexes ArrayList<> to compare row indexes instead of values later
            //This comparison will handle 'same values' (if multiple values are the same - index is stored)
            List<Integer> indexes = new ArrayList<>();

            //Loop over row Lists
            for (int j = 0; j < row.size(); j++) {
                Integer rowValue = row.get(j);
                //Comparing every value in row with rowMax and adding it to indexes ArrayList<>
                if(rowValue.equals(rowMax))
                    indexes.add(j);
            }

            //Loop over indexes ArrayList<>
            //[0] -> (9)
            //[0] -> (5)
            //[2] -> (7)
            for (Integer index : indexes) {
                List<Integer> col = new ArrayList<>();

                //Taking cols values stored in ArrayList<> but only columns from index stored in indexes ArrayList<>
                //[9, 5, 6]
                //[9, 5, 6]
                //[7, 2, 7]
                for (List<Integer> rowX : values) {
                    col.add(rowX.get(index));
                }

                //Taking min value from each col ArrayList<>
                //5
                //5
                //2
                Integer colMin = Collections.min(col);

                //If value from row[index] is same as min value from column - store value
                //Row[index] 9 colMin 5
                //Row[index] 5 colMin 5 -> stored
                //Row[index] 7 colMin 2
                if(row.get(index).equals(colMin))
                    saddlePoints.add(new MatrixCoordinate(i+1, index+1));
            }
        }
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        return saddlePoints;

    }
}
