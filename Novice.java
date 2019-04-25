/**
 * Novice
 */
public class Novice {
    protected int hp, exp, level, maxHp, maxExp, maxLevel, attack; 
    protected String name, gender, pictureName;
    public Novice(String name) {
        maxHp = 200;
        exp = 0;
        level = 1;
        maxLevel = 10;
        maxExp = 50;
        hp = maxHp;
        attack = 40; 
        gender = "";
        pictureName = "";
        this.name = name;
    }
    public int getHp(){
        return hp;
    }
    public int getExp(){
        return exp;
    }
    public int getLevel(){
        return level;
    } 
    public int getMaxHp(){
        return maxHp;
    }
    public int getMaxExp(){
        return maxExp;
    }   
    public int getMaxLevel(){
        return maxLevel;
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
        hp -= 20;
        exp += 10; 
        if(exp == maxExp){
            level += 1;
            exp = 0;
        }
        if(hp <= 0){
            level -= 1;
            hp = 0;
        }
    }
    public void revive(){
        hp = maxHp;
    }
    public String getGender(){
        return gender;
    }
}