/**
 * MonsterStatus
 */
public class MonsterStatus {
    protected int hp, maxHp, attack;
    protected String name, pictureName;
    public MonsterStatus(String name) {
        maxHp = 200;
        maxHp = hp;
        attack = 20;
        this.name = name;
        pictureName = "";
    }
    public int getHp(){
        return hp;
    }
    public int getMaxHp(){
        return maxHp;
    } 
    public int getAttack(){
        return attack;
    }
    public String getName(){
        return name;
    }
    public String getPicture(){
        return pictureName;
    }
    public void getDamage(){
        hp -= 40;
        if(hp <= 0){
            hp = 0;
        }
    }
}