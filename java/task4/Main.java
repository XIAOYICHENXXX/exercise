
class Monster{

    String  type;
    int hit_points;
    int attack_points;
    String[] weaknesses = new String[2];

    public void create(){
        
        String[] TYPE = {"FIRE","WATER","GRASS"};

        
        this.attack_points = (int) (Math.random()*100);
        this.hit_points = (int) (Math.random()*500);
        
        int temp = (int) (Math.random()*(2 - 0 + 1) + 0);
        this.type = TYPE[temp];
        
        int count = 0;
        while(this.weaknesses[1] == null){

            int temp1 = (int) (Math.random()*(2 -  0 + 1) + 0);
            if (this.type.equals(TYPE[temp1])){
                continue;
            }

            
            else if (count == 1 && this.weaknesses[0] == TYPE[temp1]){
                continue;
            }

            this.weaknesses[count] = TYPE[temp1];
            count++;
        }


    }

    public void show(){
        System.out.println(this.type);
        System.out.println(this.hit_points);
        System.out.println(this.attack_points);

        for (int i = 0;  i < this.weaknesses.length; i++){

            System.out.println(this.weaknesses[i]);

        }
    }


    public void attack(Monster the_monster){

        this.hit_points -= the_monster.attack_points;
    }

}




public class Main {
    
    public static void main(String[] args){
        
        Monster[] monsters = new Monster[2];






        for(int i = 0; i < monsters.length; i++){

            monsters[i] = new Monster();
            
            monsters[i].create();
            
            monsters[i].show();
        }


        /* 
        monsters[0] = new Monster();
        monsters[0].create();
        monsters[0].show();

        monsters[1] = new Monster();
        monsters[1].create();
        monsters[1].show();
        */


        monsters[0].attack(monsters[1]);

        monsters[0].show();

    }
}