package JDBC.HWJDBC;

/**
 * Created by shpak on 01.08.2016.
 */
public class SprOgject {
    private int id;
    private String name_ru;
    private String name_en;

    public SprOgject(){}

    public SprOgject(int id, String name_ru, String name_en) {
        this.id = id;
        this.name_ru = name_ru;
        this.name_en = name_en;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_ru() {
        return name_ru;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }
}
