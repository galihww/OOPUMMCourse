public class ArrayExample {
    public static void main(String[] args) {
        double [] ipk;
        ipk = new double[10];

//        int [] usia = new int[10];
        int [] usia = {17,18,16,19,21,16,21,20,18,19};

        ipk[0] = 3.4;
        ipk[1] = 3.7;
        ipk[2] = 3.9;
        ipk[3] = 3.2;
        ipk[4] = 3.3;
        ipk[5] = 3.6;
        ipk[6] = 4.0;
        ipk[7] = 3.25;
        ipk[8] = 3.53;
        ipk[9] = 4.0;

        for(int i=0; i< usia.length; i++){
            System.out.println("index ke: " + i + " element : "+usia[i]);
        }

        for(int i=0; i< ipk.length; i++){
            System.out.println("index ke: " + i + " element : "+ipk[i]);
        }

        int [][] matrix = new int[3][3];

        matrix[0][0] = 10;
        matrix[0][1] = 4;
        matrix[0][2] = 5;
        matrix[1][0] = 9;
        matrix[1][1] = 7;
        matrix[1][2] = 8;
        matrix[2][0] = 6;
        matrix[2][1] = 2;
        matrix[2][2] = 3;

        for (int i =0;i< matrix.length; i++){
            for (int j=0; j< matrix[i].length; j++){
                System.out.println("index-"+i+j+" element: "+matrix[i][j]);
            }
        }
        String [] myBouqet = { "Rose","Sunflower", "Daisy", "Dandelion", "Violet", "Lily" };
        for(int i = 0; i< myBouqet.length; i++){
            System.out.println(myBouqet[i]);
        }

        for(String flower : myBouqet)
            System.out.println(flower);
    }
}
