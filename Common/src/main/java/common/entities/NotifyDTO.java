package common.entities;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author adrianfelipegp
 */
public class NotifyDTO implements Serializable{
    private int id;
    private Song song;
    private LocalDate date;
    private int size; 
    
    public NotifyDTO(int id, Song song, int size) {
        this.id = id;
        this.song = song;
        this.date = LocalDate.now();
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Song getSong() {
        return song;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
