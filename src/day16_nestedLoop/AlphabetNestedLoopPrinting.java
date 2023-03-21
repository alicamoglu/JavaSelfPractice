package day16_nestedLoop;
/*
2. Use a nested loop to print the following output:
        Aa Ab Ac Ad Ae Af Ag Ah Ai Aj Ak Al Am An Ao Ap Aq Ar As At Au Av Aw Ax Ay Az
        Ba Bb Bc Bd Be Bf Bg Bh Bi Bj Bk Bl Bm Bn Bo Bp Bq Br Bs Bt Bu Bv Bw Bx By Bz
        Ca Cb Cc Cd Ce Cf Cg Ch Ci Cj Ck Cl Cm Cn Co Cp Cq Cr Cs Ct Cu Cv Cw Cx Cy Cz
        Da Db Dc Dd De Df Dg Dh Di Dj Dk Dl Dm Dn Do Dp Dq Dr Ds Dt Du Dv Dw Dx Dy Dz
        Ea Eb Ec Ed Ee Ef Eg Eh Ei Ej Ek El Em En Eo Ep Eq Er Es Et Eu Ev Ew Ex Ey Ez
*/
public class AlphabetNestedLoopPrinting {

    public static void main(String[] args) {
//        String letters = "ABCDE";//FGHIJKLMNOPQRSTUVWXYZ";
        String letters = "";
        for (char cc = 'A'; cc<='E';cc++)
            letters += cc;
        String lowercaseAlphabet = "";
        for (char c = 'a'; c <= 'z'; c++) {
            lowercaseAlphabet += c;
        }
        System.out.println(lowercaseAlphabet);
        for (int j = 0; j < letters.length(); j++) {
            for (int i = 0; i < lowercaseAlphabet.length(); i++) {
                System.out.print("" + letters.charAt(j) + lowercaseAlphabet.charAt(i) + " ");

            }
            System.out.println("\n");
        }



            //solution from Cydeo
        for (char j = 'A'; j <= 'E'; j++) {

            for (char i = 'a'; i <= 'z'; i++) {
                System.out.print(j + "" + i+" ");
            }

            System.out.println();

        }






    }
}
