package quotes;

public class ApiQuote {
  String starWarsQuote;

  public ApiQuote(String starWarsQuote){
    this.starWarsQuote = starWarsQuote;
  }

  public String toString(){
    return String.format(this.starWarsQuote);
  }
}
