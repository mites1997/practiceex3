package com.stackroute.pex3;

public class RemoveVowelsFromStrings
{

  String[] places;String result="";
  public String places(String input)
  {   input=input.replaceAll("a|e|i|o|u","");//vowels with small letters replaced
    input=input.replaceAll("A|E|I|O|U","");//vowels with capitals replaced
    places=input.split(" ");
    for(String s:places)//split with " "
    {
      result=result.concat(s).concat(" ");//space concated
    }
    return result.trim();//leading and trailing spaces removed
  }
}
