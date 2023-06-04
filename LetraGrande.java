import java.util.Scanner;

public class LetraGrande {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a palavra: ");
        String palavraUsuario = in.nextLine();

        char[] letras = palavraUsuario.toCharArray();

        String[] letra = new String[5]; 
        
        String[][] frase = new String[palavraUsuario.length()][letra.length];

        String[] a = {};
        String[] b = {};
        String[] c = {};
        String[] d = {};
        String[] e = {};
        String[] f = {};
        String[] g = {};
        String[] h = {};
        String[] letra_i = {};
        String[] letra_j = {};
        String[] k = {};
        String[] l = {};
        String[] m = {};
        String[] n = {};
        String[] o = {};
        String[] p = {};
        String[] q = {};
        String[] r = {};
        String[] s = {};
        String[] t = {};
        String[] u = {};
        String[] v = {};
        String[] w = {};
        String[] x = {};
        String[] y = {};
        String[] z = {};
        String[] ponto = {};
        String[] espaco = {};
        String[] virgula = {};
        String[] exclamacao = {};
        String[] interrogacao = {};

        for (int i = 0; i < palavraUsuario.length(); i++){
            for (int j = 0; j < letra.length; j++) {
                if (letras[i] == 'a' || letras[i] == 'A') {
                    a = letraA(letra);
                    frase[i][j] = a[j];
                }
                if (letras[i] == 'b' || letras[i] == 'B') {
                    b = letraB(letra);
                    frase[i][j] = b[j];
                    
                }
                if (letras[i] == 'c' || letras[i] == 'C') {
                    c = letraC(letra);
                    frase[i][j] = c[j];
                    
                }
                if (letras[i] == 'd' || letras[i] == 'D') {
                    d = letraD(letra);
                    frase[i][j] = d[j];
                    
                }
                if (letras[i] == 'e' || letras[i] == 'E') {
                    e = letraE(letra);
                    frase[i][j] = e[j];
                    
                }
                if (letras[i] == 'f' || letras[i] == 'F') {
                    f = letraF(letra);
                    frase[i][j] = f[j];
                    
                }
                if (letras[i] == 'g' || letras[i] == 'G') {
                    g = letraG(letra);
                    frase[i][j] = g[j];
                    
                }
                if (letras[i] == 'h' || letras[i] == 'H') {
                    h = letraH(letra);
                    frase[i][j] = h[j];
                    
                }
                if (letras[i] == 'i' || letras[i] == 'I') {
                    letra_i = letraI(letra);
                    frase[i][j] = letra_i[j];
                    
                }
                if (letras[i] == 'j' || letras[i] == 'J') {
                    letra_j = letraJ(letra);
                    frase[i][j] = letra_j[j];
                    
                }
                if (letras[i] == 'k' || letras[i] == 'K') {
                    k = letraK(letra);
                    frase[i][j] = k[j];
                    
                }
                if (letras[i] == 'l' || letras[i] == 'L') {
                    l = letraL(letra);
                    frase[i][j] = l[j];
                    
                }
                if (letras[i] == 'm' || letras[i] == 'M') {
                    m = letraM(letra);
                    frase[i][j] = m[j];
                    
                }
                if (letras[i] == 'n' || letras[i] == 'N') {
                    n = letraN(letra);
                    frase[i][j] = n[j];
                    
                }
                if (letras[i] == 'o' || letras[i] == 'O') {
                    o = letraO(letra);
                    frase[i][j] = o[j];
                    
                }
                if (letras[i] == 'p' || letras[i] == 'P') {
                    p = letraP(letra);
                    frase[i][j] = p[j];
                    
                }
                if (letras[i] == 'q' || letras[i] == 'Q') {
                    q = letraQ(letra);
                    frase[i][j] = q[j];
                    
                }
                if (letras[i] == 'r' || letras[i] == 'R') {
                    r = letraR(letra);
                    frase[i][j] = r[j];
                    
                }
                if (letras[i] == 's' || letras[i] == 'S') {
                    s = letraS(letra);
                    frase[i][j] = s[j];
                    
                }
                if (letras[i] == 't' || letras[i] == 'T') {
                    t = letraT(letra);
                    frase[i][j] = t[j];
                    
                }
                if (letras[i] == 'u' || letras[i] == 'U') {
                    u = letraU(letra);
                    frase[i][j] = u[j];
                    
                }
                if (letras[i] == 'v' || letras[i] == 'V') {
                    v = letraV(letra);
                    frase[i][j] = v[j];
                    
                }
                if (letras[i] == 'w' || letras[i] == 'W') {
                    w = letraW(letra);
                    frase[i][j] = w[j];
                    
                }
                if (letras[i] == 'x' || letras[i] == 'X') {
                    x = letraX(letra);
                    frase[i][j] = x[j];
                    
                }
                if (letras[i] == 'y' || letras[i] == 'Y') {
                    y = letraY(letra);
                    frase[i][j] = y[j];
                    
                }
                if (letras[i] == 'z' || letras[i] == 'Z') {
                    z = letraZ(letra);
                    frase[i][j] = z[j];
                      
                }             
                if (letras[i] == ' ') {
                    espaco = espaco(letra);
                    frase[i][j] = espaco[j];
                      
                }             
                if (letras[i] == ',') {
                    virgula = virgula(letra);
                    frase[i][j] = virgula[j];
                      
                }             
                if (letras[i] == '.') {
                    ponto = ponto(letra);
                    frase[i][j] = ponto[j];
                      
                }             
                if (letras[i] == '!') {
                    exclamacao = exclamacao(letra);
                    frase[i][j] = exclamacao[j];
                      
                }             
                if (letras[i] == '?') {
                    interrogacao = interrogacao(letra);
                    frase[i][j] = interrogacao[j];
                      
                }             
                
            }
            
        }
        // System.out.print(frase[0][j]);

        // System.out.print(frase[0][0] + " ");
        // System.out.print(frase[1][0] + " ");
        // System.out.print(frase[2][0] + " ");
        // System.out.print(frase[3][0] + " ");
        // System.out.print(frase[4][0] + " ");
        // System.out.print(frase[5][0] + " ");
        // System.out.println();
        // System.out.print(frase[0][1] + " ");
        // System.out.print(frase[1][1] + " ");
        // System.out.print(frase[2][1] + " ");
        // System.out.print(frase[3][1] + " ");
        // System.out.print(frase[4][1] + " ");
        // System.out.print(frase[5][1] + " ");

        for (int i = 0; i < letra.length; i++) {
            for (int j = 0; j < palavraUsuario.length(); j++) {
                System.out.print(frase[j][i] + " ");
            }
            System.out.println();
        }

        in.close();
    }
    
    public static String[] espaco(String[] espaco) {
        espaco[0] = "     ";
        espaco[1] = "     ";
        espaco[2] = "     ";
        espaco[3] = "     ";
        espaco[4] = "     ";

        return espaco;
    }
    
    public static String[] interrogacao(String[] interrogacao) {
        interrogacao[0] = " ????? ";
        interrogacao[1] = "?    ??";
        interrogacao[2] = "   ??  ";
        interrogacao[3] = "   ??  ";
        interrogacao[4] = "   ||  ";

        return interrogacao;
    }

    public static String[] exclamacao(String[] exclamacao) {
        exclamacao[0] = "|||  ";
        exclamacao[1] = "|||  ";
        exclamacao[2] = "|||  ";
        exclamacao[3] = "|||  ";
        exclamacao[4] = " 0   ";

        return exclamacao;
    }
    
    public static String[] ponto(String[] ponto) {
        ponto[0] = "     ";
        ponto[1] = "     ";
        ponto[2] = "     ";
        ponto[3] = "     ";
        ponto[4] = "()   ";

        return ponto;
    }
    
    public static String[] virgula(String[] virgula) {
        virgula[0] = "   ";
        virgula[1] = "   ";
        virgula[2] = "   ";
        virgula[3] = " ,,";
        virgula[4] = ",, ";

        return virgula;
    }

    public static String[] letraA(String[] a) {
        a[0] = "AAAAAAA";
        a[1] = "AA   AA";
        a[2] = "AAAAAAA";
        a[3] = "AA   AA";
        a[4] = "AA   AA";

        return a;
    }

    public static String[] letraB(String[] b) {
        b[0] = "BBBBB  ";
        b[1] = "BB  BB ";
        b[2] = "BBBB   ";
        b[3] = "BB  BB ";
        b[4] = "BBBBB  ";

        return b;
    }
    public static String[] letraC(String[] c) {
        c[0] = "CCCCCCCC";
        c[1] = "CC      ";
        c[2] = "CC      ";
        c[3] = "CC      ";
        c[4] = "CCCCCCCC";

        return c;
    }
    public static String[] letraD(String[] d) {
        d[0] = "DDDDD   ";
        d[1] = "DD   DD ";
        d[2] = "DD    DD";
        d[3] = "DD   DD ";
        d[4] = "DDDDDD  ";

        return d;
    }
    public static String[] letraE(String[] e) {
        e[0] = "EEEEEEEE";
        e[1] = "EE      ";
        e[2] = "EEEEEEEE";
        e[3] = "EE      ";
        e[4] = "EEEEEEEE";

        return e;
    }
    public static String[] letraF(String[] f) {
        f[0] = "FFFFFFFF";
        f[1] = "FF      ";
        f[2] = "FFFFFFFF";
        f[3] = "FF      ";
        f[4] = "FF      ";

        return f;
    }
    public static String[] letraG(String[] g) {
        g[0] = "GGGGGGGG";
        g[1] = "GG      ";
        g[2] = "GG   GGG";
        g[3] = "GG     G";
        g[4] = "GGGGGGGG";

        return g;
    }
    public static String[] letraH(String[] h) {
        h[0] = "HH    HH";
        h[1] = "HH    HH";
        h[2] = "HHHHHHHH";
        h[3] = "HH    HH";
        h[4] = "HH    HH";

        return h;
    }
    public static String[] letraI(String[] i) {
        i[0] = "IIIIIIII";
        i[1] = "   II   ";
        i[2] = "   II   ";
        i[3] = "   II   ";
        i[4] = "IIIIIIII";

        return i;
    }
    public static String[] letraJ(String[] j) {
        j[0] = "JJJJJJJJ";
        j[1] = "   JJ   ";
        j[2] = "   JJ   ";
        j[3] = "JJ JJ   ";
        j[4] = "JJJJJ   ";

        return j;
    }
    public static String[] letraK(String[] k) {
        k[0] = "KK    KK";
        k[1] = "KKK KKK ";
        k[2] = "KKKKK   ";
        k[3] = "KKK KKK ";
        k[4] = "KK    KK";

        return k;
    }
    public static String[] letraL(String[] l) {
        l[0] = "LL      ";
        l[1] = "LL      ";
        l[2] = "LL      ";
        l[3] = "LL      ";
        l[4] = "LLLLLLLL";

        return l;
    }
    public static String[] letraM(String[] m) {
        m[0] = "M      M";
        m[1] = "MM    MM";
        m[2] = "M M  M M";
        m[3] = "M  MM  M";
        m[4] = "M      M";

        return m;
    }
    public static String[] letraN(String[] n) {
        n[0] = "NN     NN";
        n[1] = "NNN    NN";
        n[2] = "NN NN  NN";
        n[3] = "NN  NN NN";
        n[4] = "NN   NNNN";

        return n;
    }
    public static String[] letraO(String[] o) {
        o[0] = "OOOOOOOO";
        o[1] = "OO    OO";
        o[2] = "OO    OO";
        o[3] = "OO    OO";
        o[4] = "OOOOOOOO";

        return o;
    }
    public static String[] letraP(String[] p) {
        p[0] = "PPPPPP  ";
        p[1] = "PP    PP";
        p[2] = "PPPPPPP ";
        p[3] = "PP      ";
        p[4] = "PP      ";

        return p;
    }
    public static String[] letraQ(String[] q) {
        q[0] = " QQQQQQ ";
        q[1] = "Q      Q";
        q[2] = "Q   q  Q";
        q[3] = "Q    q Q";
        q[4] = " QQQQQq ";

        return q;
    }
    public static String[] letraR(String[] r) {
        r[0] = "RRRRRRR ";
        r[1] = "RR   RR ";
        r[2] = "RRRRRR  ";
        r[3] = "RR   RR ";
        r[4] = "RR    RR";

        return r;
    }
    public static String[] letraS(String[] s) {
        s[0] = " SSSSSSSS";
        s[1] = "SSS      ";
        s[2] = " SSSSSSS ";
        s[3] = "      SSS";
        s[4] = "SSSSSSSS ";

        return s;
    }
    public static String[] letraT(String[] t) {
        t[0] = "TTTTTTTTT";
        t[1] = "TTTTTTTTT";
        t[2] = "   TTT   ";
        t[3] = "   TTT   ";
        t[4] = "   TTT   ";

        return t;
    }
    public static String[] letraU(String[] u) {
        u[0] = "UU    UU";
        u[1] = "UU    UU";
        u[2] = "UU    UU";
        u[3] = "UU    UU";
        u[4] = " UUUUUU ";

        return u;
    }
    public static String[] letraV(String[] v) {
        v[0] = "V       V";
        v[1] = "VV     VV";
        v[2] = " VV   VV ";
        v[3] = "  VV VV  ";
        v[4] = "   VVV   ";

        return v;
    }
    public static String[] letraW(String[] w) {
        w[0] = "W       W";
        w[1] = "W   W   W";
        w[2] = "W  W W  W";
        w[3] = "W W   W W";
        w[4] = "W       W";

        return w;
    }
    public static String[] letraX(String[] x) {
        x[0] = "XX    XX";
        x[1] = " XX  XX ";
        x[2] = "  XXXX  ";
        x[3] = " XX  XX ";
        x[4] = "XX    XX";
        

        return x;
    }
    public static String[] letraY(String[] y) {
        y[0] = "Y     Y";
        y[1] = " Y   Y ";
        y[2] = "  YYY  ";
        y[3] = "   Y   ";
        y[4] = "   Y   ";
       

        return y;
    }
    public static String[] letraZ(String[] z) {
        z[0] = "ZZZZZZZ";
        z[1] = "    ZZ ";
        z[2] = "  ZZ   ";
        z[3] = "ZZ     ";
        z[4] = "ZZZZZZZ";

        return z;
    }
    
}
