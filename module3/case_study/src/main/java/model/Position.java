package model;

public class Position {
    private int possition_id;
    private String position_name;

    public Position(int possition_id, String position_name) {
        this.possition_id = possition_id;
        this.position_name = position_name;
    }

    public int getPossition_id() {
        return possition_id;
    }

    public void setPossition_id(int possition_id) {
        this.possition_id = possition_id;
    }

    public String getPosition_name() {
        return position_name;
    }

    public void setPosition_name(String position_name) {
        this.position_name = position_name;
    }
}

