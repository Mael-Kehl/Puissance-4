public class Table{
  public Case[][] array;

  public Table(String name){ // Constructeur
    this.array = new Case[6][7];
    for(int i=0; i<array.length; ++i)
      for(int j=0; j<array[0].length; ++j)
        this.array[i][j]= new Case(name);
  }

  public void printTable(){ //Affichage de la Table
    System.out.println(" 1 2 3 4 5 6 7");
    for(int i=0; i<array.length; ++i)
    {
      System.out.print("\033[34m"+"|");
      for(int j=0; j<array[0].length; ++j)
        System.out.print(this.array[i][j].getName()+"\033[34m"+"|");
      System.out.println();
    }
    System.out.println();
  }

  public void setCase(int i, int j, String name){
    array[i][j].setName(name); //On se trouve dans un tableau de cases
  }

  public boolean colTest(){
    for(int i=0; i<array.length; i++){
      //premierement on vérifie que la case n'est pas vide
      if(array[2][i].getName()!="."){
        //On vérifie la partie supérieure
        if(array[0][i].getName()==array[2][i].getName()&&array[1][i].getName()==array[2][i].getName()&&array[3][i].getName()==array[2][i].getName())
        {
          return true;
        }
        //On vérifie la partie inférieure
        if(array[3][i].getName()==array[2][i].getName()&&array[4][i].getName()==array[2][i].getName()&&array[5][i].getName()==array[2][i].getName())
        {
          return true;
        }
        if(array[3][i].getName()==array[2][i].getName()&&array[4][i].getName()==array[2][i].getName()&&array[1][i].getName()==array[2][i].getName())
        {
          return true;
        }
      }//Fin if
    }//Fin for
    return false;
  }

  public boolean ligneTest(){
    for(int y=0;y<array.length;++y){
      //On vérifie que la case du milieu n'est pas vide
      if(array[y][3].getName()!="."){
        //on vérifie le côté gauche
        if(array[y][0].getName()==array[y][3].getName()&&array[y][1].getName()==array[y][3].getName()&&array[y][2].getName()==array[y][3].getName())
        {
          return true;
        }
        //On vérifie le côté gauche
        if(array[y][4].getName()==array[y][3].getName()&&array[y][5].getName()==array[y][3].getName()&&array[y][6].getName()==array[y][3].getName())
        {
          return true;
        }
        if(array[y][4].getName()==array[y][3].getName()&&array[y][5].getName()==array[y][3].getName()&&array[y][2].getName()==array[y][3].getName())
        {
          return true;
        }
        if(array[y][1].getName()==array[y][3].getName()&&array[y][2].getName()==array[y][3].getName()&&array[y][4].getName()==array[y][3].getName())
        {
          return true;
        }
      }//Fin if
    }//Fin for
    return false;
  }

  public boolean diagTest(){
    //Test obliques montantes partant de la colonne 4 (3 en indice)
    for(int i=3;i<array.length;i++){
      if(array[i][3].getName()!="."){
        if(array[i][3].getName()==array[i-1][4].getName()&&array[i][3].getName()==array[i-2][5].getName()&&array[i][3].getName()==array[i-3][6].getName())
        {
          return true;
        }
        if(array[i][3].getName()==array[i-1][2].getName()&&array[i][3].getName()==array[i-2][1].getName()&&array[i][3].getName()==array[i-3][0].getName())
        {
          return true;
        }
      }//Fin if
    }//Fin for
    //Test obliques descendantes partant de la colonne 4 (indice 3)
    for(int i=0; i<3;i++){
      if(array[i][3].getName()!="."){
        if(array[i][3].getName()==array[i+1][4].getName()&&array[i][3].getName()==array[i+2][5].getName()&&array[i][3].getName()==array[i+3][6].getName())
        {
          return true;
        }//Fin if
        if(array[i][3].getName()==array[i+1][2].getName()&&array[i][3].getName()==array[i+2][1].getName()&&array[i][3].getName()==array[i+3][0].getName())
        {
          return true;
        }//fin if
      }//Fin if
    }//Fin for
    //test obliques Montantes 1 colonne 3 / 3 colonne 1
    for(int i=2;i<array.length-1;i++){
      if(array[i][3].getName()!="."){
        if(array[i][3].getName()==array[i-1][4].getName()&&array[i][3].getName()==array[i-2][5].getName()&&array[i][3].getName()==array[i+1][2].getName())
        {
          return true;
        }
        if(array[i][3].getName()==array[i-1][2].getName()&&array[i][3].getName()==array[i-2][1].getName()&&array[i][3].getName()==array[i+1][4].getName())
        {
          return true;
        }
      }//Fin if
    }//Fin for
    for(int i=1; i<4;i++){
      if(array[i][3].getName()!="."){
        if(array[i][3].getName()==array[i+1][4].getName()&&array[i][3].getName()==array[i+2][5].getName()&&array[i][3].getName()==array[i-1][2].getName())
        {
          return true;
        }//Fin if
        if(array[i][3].getName()==array[i+1][2].getName()&&array[i][3].getName()==array[i+2][1].getName()&&array[i][3].getName()==array[i-1][4].getName())
        {
          return true;
        }//fin if
      }//Fin if
    }//Fin for
    return false;
  }

}//Fin class
