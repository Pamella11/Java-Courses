package ObjectsAndClasses.Lab.Songs;

public class Songs {

    private String listType;
    private String name;
    private String time;

    public Songs(String listType, String name, String time) {
        this.listType = listType;
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getListType() {
        return listType;
    }
}
