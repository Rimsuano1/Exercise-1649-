public class GiaiThua {
    public static  int Fact(int n) //n!
    {
        int f = 1;
        for (int i = n; i > 0; i--)
            f = f * i;
        return f;
    }
}
