package treichel.screensharingmobile.Entities;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Brian on 27/11/2017.
 */

@Entity
public class Status {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String type;

    public Status(String type){
        this.type = type;
    }
}
