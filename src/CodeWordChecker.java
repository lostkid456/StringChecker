public class CodeWordChecker implements StringChecker{
    private int num1;
    private int num2;
    private String Word;

    public CodeWordChecker(int num1,int num2,String Word)
    {
        this.num1=num1;
        this.num2=num2;
        this.Word=Word;
    }
    public CodeWordChecker(String getWord)
    {
        this.num1=6;
        this.num2=20;
        this.Word=Word;
    }
    public boolean isValid(String str){
        return(str.length()>num1&&)
    }
}
