package powerup.systers.com.data.entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "Point")
public class Points {

    @PrimaryKey
    private int pointsId;

    private int strength;

    private int invisibility;

    private int healing;

    private int telepathy;

    private int userPoints;

    public Points(int pointsId, int strength, int invisibility, int healing, int telepathy, int userPoints) {
        this.pointsId = pointsId;
        this.strength = strength;
        this.invisibility = invisibility;
        this.healing = healing;
        this.telepathy = telepathy;
        this.userPoints = userPoints;
    }
}
